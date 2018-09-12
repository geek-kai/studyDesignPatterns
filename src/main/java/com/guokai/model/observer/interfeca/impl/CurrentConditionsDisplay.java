package com.guokai.model.observer.interfeca.impl;

import com.guokai.model.observer.interfeca.DisplayElement;
import com.guokai.model.observer.interfeca.Observer;
import com.guokai.model.observer.interfeca.Subject;

import java.util.List;

/**
 * @author 郭凯
 * @date 2018/9/12 14:41
 * 当前气象
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {

    private  Subject subject;
    private Float temperature;
    private Float humidity;

    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+temperature+"F degrees and"+humidity+"%humidity");
    }

    @Override
    public Boolean update(Subject subject, Object object) {
        if(subject instanceof  WeatherSubject){
            WeatherSubject weatherSubject= (WeatherSubject) subject;
            this.humidity=weatherSubject.getHumidity();
            this.temperature=weatherSubject.getTemperature();
            display();
        }
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
}
