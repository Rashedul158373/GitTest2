package com.rashedulbd.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine,btnPoint;
    private Button btnPlus, btnMinus, btnMiltiplication, btnDivition, btnEqual,btnAC,btnDelete;
    private TextView tvDisplay,tvShowDisplay, tvDisplayResult;
    double var1,var2;
    boolean add,sub,mul,div,clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewByID();

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText(tvDisplay.getText()+"0");
                tvShowDisplay.setText(tvShowDisplay.getText()+"0");

            }
        });
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText(tvDisplay.getText()+"1");
                tvShowDisplay.setText(tvShowDisplay.getText()+"1");

            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText(tvDisplay.getText()+"2");
                tvShowDisplay.setText(tvShowDisplay.getText()+"2");

            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText(tvDisplay.getText()+"3");
                tvShowDisplay.setText(tvShowDisplay.getText()+"3");

            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText(tvDisplay.getText()+"4");
                tvShowDisplay.setText(tvShowDisplay.getText()+"4");

            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText(tvDisplay.getText()+"5");
                tvShowDisplay.setText(tvShowDisplay.getText()+"5");

            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText(tvDisplay.getText()+"6");
                tvShowDisplay.setText(tvShowDisplay.getText()+"6");

            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText(tvDisplay.getText()+"7");
                tvShowDisplay.setText(tvShowDisplay.getText()+"7");

            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText(tvDisplay.getText()+"8");
                tvShowDisplay.setText(tvShowDisplay.getText()+"8");

            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText(tvDisplay.getText()+"9");
                tvShowDisplay.setText(tvShowDisplay.getText()+"9");

            }
        });
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText(tvDisplay.getText()+getString(R.string.pointString));
                tvShowDisplay.setText(tvShowDisplay.getText()+getString(R.string.pointString));

            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    var1=Double.parseDouble(tvDisplay.getText()+"");
                    tvShowDisplay.setText(tvShowDisplay.getText()+"+");
                    add=true;
                    tvDisplay.setText(null);

                }
                catch (Exception e){

                }

            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    var1=Double.parseDouble(tvDisplay.getText()+"");
                    tvShowDisplay.setText(tvShowDisplay.getText()+"-");
                    sub=true;
                    tvDisplay.setText(null);

                }
                catch (Exception e){

                }

            }
        });
        btnMiltiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    var1=Double.parseDouble(tvDisplay.getText()+"");
                    tvShowDisplay.setText(tvShowDisplay.getText()+"*");
                    mul=true;
                    tvDisplay.setText(null);

                }
                catch (Exception e){

                }

            }
        });
        btnDivition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    var1=Double.parseDouble(tvDisplay.getText()+"");
                    tvShowDisplay.setText(tvShowDisplay.getText()+"/");
                    div=true;
                    tvDisplay.setText(null);

                }
                catch (Exception e){
                }

            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    var2 = Double.parseDouble(tvDisplay.getText()+"");
                    if(add==true)
                    {
                        tvDisplayResult.setText(var1+var2+"");
                        tvShowDisplay.setText(tvShowDisplay.getText()+getString(R.string.semicolon));
                        tvDisplay.setText(null);
                        add=false;

                    }
                    if(sub==true)
                    {
                        tvDisplayResult.setText(var1-var2+"");
                        tvShowDisplay.setText(tvShowDisplay.getText()+getString(R.string.semicolon));
                        tvDisplay.setText(null);
                        sub=false;

                    }
                    if(mul==true)
                    {
                        tvDisplayResult.setText(var1*var2+"");
                        tvShowDisplay.setText(tvShowDisplay.getText()+getString(R.string.semicolon));
                        tvDisplay.setText(null);
                        mul=false;
                    }
                    if(div==true)
                    {

                        tvDisplayResult.setText(var1/var2+"");
                        tvShowDisplay.setText(tvShowDisplay.getText()+getString(R.string.semicolon));
                        tvDisplay.setText(null);
                        div=false;

                    }

                } catch (Exception e) {
                }


            }
        });
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText(null);
                tvDisplayResult.setText(null);
                tvShowDisplay.setText(null);
            }
        });
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDisplay.setText(null);
//                int number=0;
//                if (tvDisplay.length()>0){
//                    number = tvDisplay.length()-1;
//                    tvDisplay.setText(number);
//
//                }
//                else{
//                    tvDisplay.length();
//                }
            }
        });

    }

    public void findViewByID(){

        btnZero = findViewById(R.id.btnzero);
        btnOne = findViewById(R.id.btnOne);
        btnTwo = findViewById(R.id.btntwo);
        btnThree = findViewById(R.id.btnThree);
        btnFour = findViewById(R.id.btnFour);
        btnFive = findViewById(R.id.btnFive);
        btnSix = findViewById(R.id.btnSix);
        btnSeven = findViewById(R.id.btnSeven);
        btnEight = findViewById(R.id.btnEight);
        btnNine = findViewById(R.id.btnNine);
        btnPoint = findViewById(R.id.btnPoint);

        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMiltiplication = findViewById(R.id.btnMultiplication);
        btnDivition = findViewById(R.id.btnDivided);
        btnEqual = findViewById(R.id.btnEqual);
        btnAC = findViewById(R.id.btnAC);
        btnDelete = findViewById(R.id.btnDelete);

        tvDisplay = findViewById(R.id.tvDisplay);
        tvShowDisplay = findViewById(R.id.tvShowDisplay);
        tvDisplayResult = findViewById(R.id.tvDisplayResult);

    }
}