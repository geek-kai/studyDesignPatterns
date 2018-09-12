package com.guokai.model.observer.interfeca;

/**
 * @author 郭凯
 * @date 2018/9/12 13:43
 * 观察者接口
 * 所有观察者都需要实现该接口
 */
public interface Observer {
    /**
     * 主题更新后 同步更新消息
     * @param subject
     * @param object
     * @return
     */
    Boolean update(Subject subject,Object object);
}
