package com.example.cjcu.d20180928_jerry.Cash;

public class CashContent {
    private CashSuper cs;

    public CashContent (CashSuper cs){//這邊去知道要選擇哪一中優惠折扣ex:九折、滿千送百...
        this.cs=cs;
    }
    public double GetResult (double money){
        return cs.acceptCash(money);//我不需要管怎麼算，就像+-*/一樣，我只知道我把一個double丟進去他就會幫我算金額。
    }
}
