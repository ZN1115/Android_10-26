package com.example.cjcu.d20180928_jerry.tw.edu.jerry.calculation;

public class Div extends AOperator {
    public Div(){
        super();
    }

    @Override
    public double getAnswer() throws CalException {
        //判斷分母是否為0
        if(numB == 0)
        {
            throw new CalException();
        }

        return numA / numB;
    }

}
