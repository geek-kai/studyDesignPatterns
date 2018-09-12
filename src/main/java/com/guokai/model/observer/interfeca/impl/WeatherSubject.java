package com.guokai.model.observer.interfeca.impl;

import com.guokai.model.observer.interfeca.Observer;
import com.guokai.model.observer.interfeca.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 郭凯
 * @date 2018/9/12 14:21
 */
public class WeatherSubject extends ArrayList implements Subject{
    private List<Observer>observers;
    private Float temperature;
    private Float humidity;
    private Float pressure;

    public WeatherSubject() {
        observers=new ArrayList();
    }

    @Override
    public Boolean registerObserver(Observer observer) {

        if (observer == null) {
            throw new NullPointerException();
        }
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
        return true;
    }

    @Override
    public Boolean removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i>=0){
            observers.remove(i);
        }
        return true;
    }

    private void  messageChange(){
        notifyObserver();
    }
    public void  setMessage(Float temperature,Float humidity,Float pressure){
        this.humidity=humidity;
        this.temperature=temperature;
        this.pressure=pressure;
        messageChange();
    }
    @Override
    public Boolean notifyObserver() {
        observers.parallelStream().forEach(
                observer->observer.update(this,null)
        );
        return true;
    }

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public Float getHumidity() {
        return humidity;
    }

    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }

    public Float getPressure() {
        return pressure;
    }

    public void setPressure(Float pressure) {
        this.pressure = pressure;
    }
}
