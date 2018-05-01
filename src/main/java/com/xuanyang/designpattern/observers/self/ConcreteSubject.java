package com.xuanyang.designpattern.observers.self;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    /** 数据*/
    private String msg = "";
    private boolean changed = false;

    private List<Observer> observers;

    public ConcreteSubject() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public boolean addObserver(Observer o) {
        if (observers.contains(o)) {
            return false;
        }
        observers.add(o);
        return false;
    }

    @Override
    public boolean deleteObserver(Observer o) {
        if (observers.contains(o)) {
            observers.remove(o);
            return true;
        }
        return false;
    }

    public void setMsg(String msg) {
        if (this.msg.equals(msg)) {
            changed = false;
            return;
        }
        this.msg = msg;
        changed = true;
        notifyData();
    }

    @Override
    public void notifyData() {
        if (changed) {
            for (Observer observer : observers) {
                observer.update(msg);
            }
        }
    }
}
