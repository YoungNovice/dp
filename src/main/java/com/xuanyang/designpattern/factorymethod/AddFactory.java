package com.xuanyang.designpattern.factorymethod;

public class AddFactory implements  IFactory {

    @Override
    public Operation create() {
        return new Add();
    }
}
