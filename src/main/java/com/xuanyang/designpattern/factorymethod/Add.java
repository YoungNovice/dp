package com.xuanyang.designpattern.factorymethod;

public class Add implements Operation {

    @Override
    public int getResult(int a, int b) {
        return a + b;
    }
}
