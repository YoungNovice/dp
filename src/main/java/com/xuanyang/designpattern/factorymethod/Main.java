package com.xuanyang.designpattern.factorymethod;

public class Main {

    public static void main(String[] args) {

        IFactory factory = new SubFactory();
        Operation operation = factory.create();
        System.out.println(operation.getResult(1, 2));
    }
}
