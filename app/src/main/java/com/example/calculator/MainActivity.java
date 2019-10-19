package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    EditText viewText;
    Button one, two, three, four, five, six, seven, eight, nine, zero, sub, add, div, mul, equal,clear;

    float num1, num2;

    boolean Addition, Subtract, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        sub = findViewById(R.id.sub);
        viewText = findViewById(R.id.numView);
        add = findViewById(R.id.add);
        div = findViewById(R.id.div);
        mul = findViewById(R.id.mul);
        ;
        equal = findViewById(R.id.equal);

        clear = findViewById(R.id.clear);



        one.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                viewText.setText(viewText.getText() + "1");
            }
        } );
        two.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                viewText.setText(viewText.getText() + "2");
            }
        } );

        three.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                viewText.setText(viewText.getText() + "3");
            }
        } );

        four.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                viewText.setText(viewText.getText() + "4");
            }
        } );

        five.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                viewText.setText(viewText.getText() + "5");
            }
        } );

        six.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                viewText.setText(viewText.getText() + "6");
            }
        } );

        seven.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                viewText.setText(viewText.getText() + "7");
            }
        } );

        eight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                viewText.setText(viewText.getText() + "8");
            }
        } );

        nine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                viewText.setText(viewText.getText() + "9");
            }
        } );

        zero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                viewText.setText(viewText.getText() + "0");
            }
        } );

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    num1 = Float.parseFloat(viewText.getText() + "");
                    Addition = true;
                    viewText.setText(null);



            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(viewText.getText() + "");
                Subtract = true;
                viewText.setText(null);

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(viewText.getText() + "");
                Multiplication = true;
                viewText.setText(null);

            }
        });



        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(viewText.getText() + "");
                Division = true;
                viewText.setText(null);

            }
        });


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewText.setText("");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Float.parseFloat(viewText.getText() + "");

                if (Addition == true) {
                    viewText.setText(num1 + num2 + "");
                    Addition = false;
                }

                if (Subtract == true) {
                    viewText.setText(num1 - num2 + "");
                    Subtract = false;
                }

                if (Multiplication == true) {
                    viewText.setText(num1 * num2 + "");
                    Multiplication = false;
                }

                if (Division == true) {
                    viewText.setText(num1 / num2 + "");
                    Division = false;
                }
            }
        });



    }


}
