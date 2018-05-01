package com.xuanyang.designpattern.decoraotr;

public class KuziDecorater implements DecoraterInterface {

    private DecoraterInterface decoraterInterface;

    public void setDecoraterInterface(DecoraterInterface decoraterInterface) {
        this.decoraterInterface = decoraterInterface;
    }

    @Override
    public String show() {
        decoraterInterface.show();
        System.out.println("裤子");
        return "";
    }
}
