package com.example.cjcu.d20180928_jerry.tw.edu.jerry.calculation;

public class Mult extends AOperator {
    public Mult()
    {
        super();
    }

    @Override
    public double getAnswer() {
        return numA * numB;
    }

}
