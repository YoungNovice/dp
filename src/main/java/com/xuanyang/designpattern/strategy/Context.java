package com.xuanyang.designpattern.strategy;

/**
 * 用一个Context 维护一个strategy 对象
 */
public class Context {

    private Strategy strategy;


    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextMethod() {
        strategy.strategyInterface();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
