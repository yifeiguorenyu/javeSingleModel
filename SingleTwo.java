package com.chx.yifei.singemyapplication;

public class SingleTwo {
    private SingleTwo(){}

    private static SingleTwo instance = null;

    public static SingleTwo getInstance(){
        if(instance==null){
            instance=new SingleTwo();
        }

        return instance;
    }




}
