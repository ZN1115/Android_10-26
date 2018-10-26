package com.example.cjcu.d20180928_jerry;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.cjcu.d20180928_jerry.tw.edu.jerry.calculation.AOperator;
import com.example.cjcu.d20180928_jerry.tw.edu.jerry.calculation.Add;
import com.example.cjcu.d20180928_jerry.tw.edu.jerry.calculation.CalException;
import com.example.cjcu.d20180928_jerry.tw.edu.jerry.calculation.Div;
import com.example.cjcu.d20180928_jerry.tw.edu.jerry.calculation.Mult;
import com.example.cjcu.d20180928_jerry.tw.edu.jerry.calculation.OperatorFactory;
import com.example.cjcu.d20180928_jerry.tw.edu.jerry.calculation.Sub;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);



        Spinner operatorList = (Spinner) findViewById(R.id.operatorList);

        //方法一
        ArrayAdapter<OperatorFactory.Operator> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item,
                OperatorFactory.Operator.values());


        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        operatorList.setAdapter(adapter);




        Log.i("Jerry","Onclick");

    }


    public void cal(View view) {


        //取得下拉是選單文字
        Spinner operatorList = (Spinner) findViewById(R.id.operatorList);


        //取得使用者輸入文字
        EditText et_NumA = (EditText) findViewById(R.id.et_NumA);
        EditText et_NumB = (EditText) findViewById(R.id.et_NumB);
        TextView tv_Answer = (TextView) findViewById(R.id.tv_Answer);

        //將使用者輸入文字轉換為double
        double numberA = Double.parseDouble(et_NumA.getText().toString());
        double numberB = Double.parseDouble(et_NumB.getText().toString());
        OperatorFactory.Operator operatior = (OperatorFactory.Operator)operatorList.getSelectedItem();

        //建立運算類別
        AOperator ao1 = OperatorFactory.create(operatior);


        //檢查類別是否存在
        if(ao1 == null)
        {
            tv_Answer.setText("輸入錯誤");
        }
        else
        {
            //建立使用者輸入的數字
            ao1.setNumber(numberA,numberB);
            //將使用者輸入的數字顯示在螢幕上
            try
            {
                tv_Answer.setText(String.valueOf(ao1.getAnswer()));
            }
            catch (CalException e)
            {
                tv_Answer.setText("CalException");
            }
            catch (Exception e)
            {
                tv_Answer.setText(String.valueOf(e.getMessage()));
            }
        }





    }


    public void NextPage(View view) {
        Intent intent =new Intent();
        intent.setClass(FirstActivity.this,SecondActivity.class);
        startActivity(intent);
        finish();
    }
}
