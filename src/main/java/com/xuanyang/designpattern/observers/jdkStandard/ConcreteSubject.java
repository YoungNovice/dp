package com.xuanyang.designpattern.observers.jdkStandard;

import java.util.Observable;

public class ConcreteSubject extends Observable {

    private String data = "";

    @Override
    public void notifyObservers(Object arg) {
        super.notifyObservers(arg);
    }
}
