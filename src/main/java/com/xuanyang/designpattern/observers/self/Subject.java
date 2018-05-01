package com.xuanyang.designpattern.observers.self;

/**
 * 主题
 *
 */
public interface Subject {

    /** 添加观察者*/
    boolean addObserver(Observer observer);
    boolean deleteObserver(Observer observer);
    void notifyData();
}
