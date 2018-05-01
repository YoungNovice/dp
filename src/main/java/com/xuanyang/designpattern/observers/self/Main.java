package com.xuanyang.designpattern.observers.self;

public class Main {

    public static void main(String[] args) {
        Observer o = new ConcreteObserver();
        ConcreteSubject subject = new ConcreteSubject();
        subject.addObserver(o);
    }
}
