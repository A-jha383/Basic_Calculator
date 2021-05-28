package com.example.android.basic_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText numb1 ,numb2;
Button cal;
Spinner opt;
TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numb1 = (EditText)findViewById(R.id.no1);
        numb2 = (EditText)findViewById(R.id.no2);
        opt = (Spinner)findViewById(R.id.opt);
        cal = (Button)findViewById(R.id.button);
        res = (TextView)findViewById(R.id.result);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(numb1.getText().toString());
                double num2 = Double.parseDouble(numb2.getText().toString());
                String oper = opt.getSelectedItem().toString();
                double result = 0;
                switch (oper){
                    case "-":
                        result = num1-num2;
                        break;
                    case "+":
                        result = num1+num2;
                        break;
                    case "*":
                        result = num1*num2;
                        break;
                    case "/":
                        result = num1/num2;
                        break;
                    case "%":
                        result = num1%num2;
                        break;
                    default:
                        Toast.makeText(MainActivity.this,"Please Select Operator",Toast.LENGTH_LONG).show();

                }
                if(oper!="Select Operator"){
                res.setText("OUTPUT :"+result);}

            }
        });

    }
}