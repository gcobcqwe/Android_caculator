package com.example.jim.caculators1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0;
    private Button buttondot, buttonequal, buttonadd, buttonsub, buttonmulti, buttondivi;
    private TextView display_text;

    private String n1 = "";
    private String n2 = "";

    private String mark = "";//P=+ M=- X=* D=/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //textView1
        display_text = (TextView) findViewById(R.id.textView2);

        //1
        button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.d("test", display_text.getText().toString());

                // TODO Auto-generated method stub
                if(display_text.getText().toString().equals("0")){
                    display_text.setText("1");
                }
                else {
                    display_text.setText(display_text.getText() + "1");
                }
            }
        });
        //2
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(display_text.getText().toString().equals("0")){
                    display_text.setText("2");
                }
                else {
                    display_text.setText(display_text.getText() + "2");
                }
            }
        });
        //3
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(display_text.getText().toString().equals("0")){
                    display_text.setText("3");
                }
                else {
                    display_text.setText(display_text.getText() + "3");
                }


            }
        });
        //4
        button4 = (Button) findViewById(R.id.button6);
        button4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                // TODO Auto-generated method stub
                if(display_text.getText().toString().equals("0")){
                    display_text.setText("4");
                }
                else {
                    display_text.setText(display_text.getText() + "4");
                }

            }
        });
        //5
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                // TODO Auto-generated method stub
                if(display_text.getText().toString().equals("0")){
                    display_text.setText("5");
                }
                else {
                    display_text.setText(display_text.getText() + "5");
                }


            }
        });
        //6
        button6 = (Button) findViewById(R.id.button7);
        button6.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                // TODO Auto-generated method stub
                if(display_text.getText().toString().equals("0")){
                    display_text.setText("6");
                }
                else {
                    display_text.setText(display_text.getText() + "6");
                }

            }
        });
        //7
        button7 = (Button) findViewById(R.id.button9);
        button7.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                // TODO Auto-generated method stub
                if(display_text.getText().toString().equals("0")){
                    display_text.setText("7");
                }
                else {
                    display_text.setText(display_text.getText() + "7");
                }

            }
        });
        //8
        button8 = (Button) findViewById(R.id.button10);
        button8.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                // TODO Auto-generated method stub
                if(display_text.getText().toString().equals("0")){
                    display_text.setText("8");
                }
                else {
                    display_text.setText(display_text.getText() + "8");
                }

            }
        });
        //9
        button9 = (Button) findViewById(R.id.button11);
        button9.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                // TODO Auto-generated method stub
                if(display_text.getText().toString().equals("0")){
                    display_text.setText("9");
                }
                else {
                    display_text.setText(display_text.getText() + "9");
                }

            }
        });
        //0
        button0 = (Button) findViewById(R.id.button13);
        button0.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                // TODO Auto-generated method stub
                if(display_text.getText().toString().equals("0")){
                    display_text.setText("0");
                }
                else {
                    display_text.setText(display_text.getText() + "0");
                }

            }
        });


        //.
        buttondot = (Button) findViewById(R.id.button14);
        buttondot.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                // TODO Auto-generated method stub

                display_text.setText(display_text.getText() + ".");

            }
        });

        //=
        buttonequal = (Button) findViewById(R.id.button15);
        buttonequal.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                // TODO Auto-generated method stub
                try {
                    if (mark == "P") {
                        n1 = display_text.getText().toString().split("\\+")[0];
                        n2 = display_text.getText().toString().split("\\+")[1];
                        display_text.setText(String.valueOf(Double.parseDouble(n1) + Double.parseDouble(n2)));


                    } else if (mark == "M") {
                        n1 = display_text.getText().toString().split("\\-")[0];
                        n2 = display_text.getText().toString().split("\\-")[1];
                        display_text.setText(String.valueOf(Double.parseDouble(n1) - Double.parseDouble(n2)));

                    } else if (mark == "X") {
                        n1 = display_text.getText().toString().split("\\*")[0];
                        n2 = display_text.getText().toString().split("\\*")[1];
                        display_text.setText(String.valueOf(Double.parseDouble(n1) * Double.parseDouble(n2)));

                    } else if (mark == "D") {
                        n1 = display_text.getText().toString().split("\\/")[0];
                        n2 = display_text.getText().toString().split("\\/")[1];
                        display_text.setText(String.valueOf(Double.parseDouble(n1) / Double.parseDouble(n2)));

                    } else {
                        display_text.setText(display_text.getText());
                    }
                } catch (Exception e) {
                    // TODO: handle exception
                    display_text.setText("0");
                }

            }
        });
        //----------------------------- +-*/ ---------------------------------------------------------------------------------
        //+
        buttonadd = (Button) findViewById(R.id.button4);
        buttonadd.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                // TODO Auto-generated method stub
                mark = "P";
                display_text.setText(display_text.getText() + "+");

            }
        });

        //-
        buttonsub = (Button) findViewById(R.id.button8);
        buttonsub.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                // TODO Auto-generated method stub
                mark = "M";
                display_text.setText(display_text.getText() + "-");


            }
        });
        //*
        buttonmulti = (Button) findViewById(R.id.button12);
        buttonmulti.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                // TODO Auto-generated method stub
                mark = "X";
                display_text.setText(display_text.getText() + "*");
            }
        });
        ///
        buttondivi = (Button) findViewById(R.id.button16);
        buttondivi.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                // TODO Auto-generated method stub
                mark = "D";
                display_text.setText(display_text.getText() + "/");
            }
        });

        //reset
        buttonadd = (Button) findViewById(R.id.button17);
        buttonadd.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                // TODO Auto-generated method stub
                display_text.setText("0");
            }
        });
        //ce
        buttonadd = (Button) findViewById(R.id.button18);
        buttonadd.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                display_text.setText(display_text.getText().toString().substring(0, display_text.getText().toString().length() - 1));

            }
        });
    }

}

