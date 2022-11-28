package com.cc.java;

public class Timer {

    static double timerOn(){
        return System.currentTimeMillis();
    }

    static double timerOut(){
        return System.currentTimeMillis();
    }

    static double result(double startTime, double stoppTime) {
        return stoppTime - startTime;
    }
}
