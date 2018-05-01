package com.xuanyang.designpattern.factorymethod;

public class SubFactory implements  IFactory {

    @Override
    public Operation create() {
        return new Sub();
    }
}
