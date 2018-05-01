package com.xuanyang.designpattern.command;

public class Main {

    public static void main(String[] args) {
        Command command = new ConcreteCommand(new Excutor());
        command.doIt();
    }
}
