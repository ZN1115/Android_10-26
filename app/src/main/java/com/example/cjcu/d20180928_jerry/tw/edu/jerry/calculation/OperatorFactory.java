package com.example.cjcu.d20180928_jerry.tw.edu.jerry.calculation;

import android.util.Log;

import java.util.Vector;

public class OperatorFactory {
    public enum Operator {
        Add,
        Sub,
        Mult,
        Div,
        Power,
        Test
    }

    public static AOperator create(Operator operator) {
        AOperator ao1 = null;
        switch (operator) {
            case Add:
                ao1 = new Add();
                break;
            case Sub:
                ao1 = new Sub();
                break;
            case Mult:
                ao1 = new Mult();
                break;
            case Div:
                ao1 = new Div();
                break;
            case Power:
            case Test:
                ao1 = new Power();
                break;
            default:
                break;
        }
        return ao1;
    }
}
