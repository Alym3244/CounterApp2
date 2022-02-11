package com.example.counterapp2;

public class CounterModel {
    int count = 0;

    void increment(){
        ++count;
    }
    void decrease(){
        --count;
    }

    public int getCount() {
        return count;
    }
}
