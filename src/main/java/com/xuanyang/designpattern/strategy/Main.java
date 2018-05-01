package com.xuanyang.designpattern.strategy;

public class Main {

    public static void main(String[] args) {
        Context context = null;

        context = new Context(new StrategyA());
        context.contextMethod();

        context.setStrategy(new StrategyB());
        context.contextMethod();
    }
}
