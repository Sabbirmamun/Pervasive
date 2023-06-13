package com.example.basicpervasive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,add,sub,mul,div,eql,dec;
    TextView tv;
    double firstnum,secondnum,result;
    String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b0=( Button)findViewById(R.id.btn_0);
        b1=( Button)findViewById(R.id.btn_1);
        b2=( Button)findViewById(R.id.btn_2);
        b3=( Button)findViewById(R.id.btn_3);
        b4=( Button)findViewById(R.id.btn_4);
        b5=( Button)findViewById(R.id.btn_5);
        b6=( Button)findViewById(R.id.btn_6);
        b7=( Button)findViewById(R.id.btn_7);
        b8=( Button)findViewById(R.id.btn_8);
        b9=( Button)findViewById(R.id.btn_9);
        add=( Button)findViewById(R.id.btn_add);
        sub=( Button)findViewById(R.id.btn_sub);
        mul=( Button)findViewById(R.id.btn_mul);
        div=( Button)findViewById(R.id.btn_div);
        dec=( Button)findViewById(R.id.btn_c);
        eql=( Button)findViewById(R.id.btn_eql);

        tv= (TextView) findViewById(R.id.display);
    }

    public void method_0(View view)
    {
        String input = tv.getText()+"0";
        tv.setText(input);
    }

    public void method_1(View view)
    {
        String input = tv.getText()+"1";
        tv.setText(input);
    }

    public void method_2(View view)
    {
        String input = tv.getText()+"2";
        tv.setText(input);
    }

    public void method_3(View view)
    {
        String input = tv.getText()+"3";
        tv.setText(input);
    }

    public void method_4(View view)
    {
        String input = tv.getText()+"4";
        tv.setText(input);
    }

    public void method_5(View view)
    {
        String input = tv.getText()+"5";
        tv.setText(input);
    }

    public void method_6(View view)
    {
        String input = tv.getText()+"6";
        tv.setText(input);
    }

    public void method_7(View view)
    {
        String input = tv.getText()+"7";
        tv.setText(input);
    }

    public void method_8(View view)
    {
        String input = tv.getText()+"8";
        tv.setText(input);
    }

    public void method_9(View view)
    {
        String input = tv.getText()+"9";
        tv.setText(input);
    }

    public void method_add(View view)
    {
        firstnum = Double.parseDouble(tv.getText().toString());
        tv.setText("");
        operation = "+";
    }
    public void method_sub(View view)
    {
        firstnum = Double.parseDouble(tv.getText().toString());
        tv.setText("");
        operation = "-";
    }
    public void method_mul(View view)
    {
        firstnum = Double.parseDouble(tv.getText().toString());
        tv.setText("");
        operation = "*";
    }
    public void method_div(View view)
    {
        firstnum = Double.parseDouble(tv.getText().toString());
        tv.setText("");
        operation = "/";
    }
    public void method_c(View view)
    {



        firstnum = Double.parseDouble(tv.getText().toString());
        tv.setText("");
        operation = "";

    }



    public void method_eql(View view)
    {
        String answer;
        secondnum = Double.parseDouble(tv.getText().toString());
        switch (operation)
        {
            case "+" :
                result = firstnum + secondnum;
                answer = String.format("%.0f", result);
                tv.setText(answer);
                break;

            case "-" :
                result = firstnum - secondnum;
                answer = String.format("%0f", result);
                tv.setText(answer);
                break;

            case "*" :
                result = firstnum * secondnum;
                answer = String.format("%.0f", result);
                tv.setText(answer);
                break;

            case "/" :
                result = firstnum / secondnum;
                answer = String.format("%.0f", result);
                tv.setText(answer);
                break;
        }
    }
}
