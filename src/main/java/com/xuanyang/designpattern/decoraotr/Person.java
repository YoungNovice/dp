package com.xuanyang.designpattern.decoraotr;

public class Person implements DecoraterInterface {

    @Override
    public String show() {
        System.out.println("人");
        return "";
    }
}
