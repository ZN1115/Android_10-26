package com.example.cjcu.d20180928_jerry.Cash;

public class CashRebate extends CashSuper {
    private  double monRebate=1;

    public CashRebate(double monRebate){
        this.monRebate=monRebate;
    }

    @Override
    public double acceptCash(double money) {

        return money*this.monRebate;
    }
}
