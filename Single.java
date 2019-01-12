package com.chx.yifei.singemyapplication;

public class Single {
    private Single(){}

    private static Single instance = new Single();

    public static Single getInstance(){
        return  instance;
    }


}
