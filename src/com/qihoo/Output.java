package com.qihoo;

public class Output implements OutputInterface {

    @Override
    public void test(String input) {
        System.out.println("您的输入为：" + input);
    }
}
