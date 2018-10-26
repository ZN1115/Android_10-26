package com.example.cjcu.d20180928_jerry;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.cjcu.d20180928_jerry.Cash.CashContent;
import com.example.cjcu.d20180928_jerry.Cash.CashRebate;
import com.example.cjcu.d20180928_jerry.Cash.CashSuper;

import org.w3c.dom.Text;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }


    public void cal(View view) {
        EditText Money=(EditText) findViewById(R.id.Money);
        EditText Number=(EditText)findViewById(R.id.Number);


        double Mon=Double.parseDouble(Money.getText().toString());
        double Num=Double.parseDouble(Number.getText().toString());

        TextView Totle=(TextView)findViewById(R.id.Totle);

        CashSuper cs=new CashRebate(0.8);
        //策略模式
        CashContent cc=new CashContent(cs);


        Totle.setText(String.valueOf(cc.GetResult(Mon*Num)));

    }

    public void back(View view) {
        Intent intent2 =new Intent();
        intent2.setClass(SecondActivity.this,FirstActivity.class);
        startActivity(intent2);
        finish();
    }
}
