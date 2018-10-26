package com.example.cjcu.d20180928_jerry.tw.edu.jerry.calculation;

public class Power extends AOperator {
    @Override
    public double getAnswer() throws CalException, Exception {
        return Math.pow(this.numA,this.numB);
    }
}
