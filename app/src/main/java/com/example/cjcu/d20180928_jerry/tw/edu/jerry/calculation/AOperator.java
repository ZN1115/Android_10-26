package com.example.cjcu.d20180928_jerry.tw.edu.jerry.calculation;



public abstract class AOperator {
    protected double numA;
    protected double numB;

    public AOperator()
    {
        this.numA = 0;
        this.numB = 0;
    }

    public void setNumber(double numA , double numB)
    {
        setNumA(numA);
        setNumB(numB);
    }

    public void setNumA(double numA)
    {
        this.numA = numA;
    }

    public void setNumB(double numB)
    {
        this.numB = numB;
    }

    public abstract double getAnswer() throws CalException,Exception;
}
