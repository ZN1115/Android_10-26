package com.example.cjcu.d20180928_jerry.tw.edu.jerry.calculation;

public class Add extends AOperator {

    public Add()
    {
        super();
    }

    @Override
    public double getAnswer() {
        return numA + numB;
    }


}
