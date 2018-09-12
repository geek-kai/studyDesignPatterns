package com.guokai.model.observer.interfeca;

/**
 * @author 郭凯
 * @date 2018/9/12 13:42
 * 主题接口
 * 主题具体实现类都需要实现该接口
 */
public interface Subject {

    /**
     * 注册观察者
     * @param observer
     * @return
     */
    Boolean registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer
     * @return
     */
    Boolean removeObserver(Observer observer);

    /**
     * 通知观察者
     * @return
     */
    Boolean notifyObserver();
}
