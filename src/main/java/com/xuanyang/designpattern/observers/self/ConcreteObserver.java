package com.xuanyang.designpattern.observers.self;

public class ConcreteObserver implements Observer {

    @Override
    public void update(String msg) {
        System.out.println("我收到消息"+msg+ "了");
    }
}
