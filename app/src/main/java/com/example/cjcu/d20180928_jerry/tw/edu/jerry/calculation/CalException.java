package com.example.cjcu.d20180928_jerry.tw.edu.jerry.calculation;

public class CalException extends Exception {
    public CalException(){
        super("分母不可為0.0");
    }
}
