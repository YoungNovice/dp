package com.xuanyang.designpattern.decoraotr;

public class Main {

    public static void main(String[] args) {

        DecoraterInterface person = new Person();
        YifuDecorater yifu = new YifuDecorater();
        KuziDecorater kuzi = new KuziDecorater();
        kuzi.setDecoraterInterface(person);
        yifu.setDecoraterInterface(kuzi);
        yifu.show();

    }
}
