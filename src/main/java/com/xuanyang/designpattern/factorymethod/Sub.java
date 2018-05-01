package com.xuanyang.designpattern.factorymethod;

public class Sub implements Operation {

    @Override
    public int getResult(int a, int b) {
        return a - b;
    }
}
