package com.example.counterapp2;

public class Injector {
    public static CounterPresenter attachPresenter(){
        return new CounterPresenter();
    }
}
