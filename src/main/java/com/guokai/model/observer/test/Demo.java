package com.guokai.model.observer.test;

import com.guokai.model.observer.interfeca.Subject;
import com.guokai.model.observer.interfeca.impl.CurrentConditionsDisplay;
import com.guokai.model.observer.interfeca.impl.WeatherSubject;

/**
 * @author 郭凯
 * @date 2018/9/12 14:46
 */
public class Demo {

    public static void main(String[] args) {
        WeatherSubject weatherSubject=new WeatherSubject();
        CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherSubject);
        weatherSubject.setMessage(80f,65f,30.4f);
        weatherSubject.setMessage(82f,70f,29.2f);
        weatherSubject.setMessage(78f,90f,29.2f);
    }
}
