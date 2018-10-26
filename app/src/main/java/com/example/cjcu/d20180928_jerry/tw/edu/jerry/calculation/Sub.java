package com.example.cjcu.d20180928_jerry.tw.edu.jerry.calculation;

public class Sub extends AOperator {
    public Sub()
    {
        super();
    }

    @Override
    public double getAnswer() {
        return numA - numB;
    }
}
