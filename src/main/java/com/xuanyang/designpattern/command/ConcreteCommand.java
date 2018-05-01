package com.xuanyang.designpattern.command;

/**
 * 具体执行命令
 */
public class ConcreteCommand implements Command {

    /** 具体执行者*/
    private Excutor excutor;

    public ConcreteCommand(Excutor excutor) {
        this.excutor = excutor;
    }

    @Override
    public void doIt() {
        excutor.say();
    }
}
