package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btndot, btnequals, btnmod, btnmul, btnplus, btnminus, btndiv, btnac;
    EditText ed1;
    Float res1;
    Boolean add, sub, div, mul, mod;

    void storePre()
    {
        res1 = Float.parseFloat(ed1.getText()+"");

    }
    void setFalse()
    {

        add=sub=div=mul=mod=false;
    }
    void Clear()
    {
        res1 = null;
        ed1.setText(null);
        setFalse();


    }


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btndot = (Button) findViewById(R.id.btndot);
        btnequals = (Button) findViewById(R.id.btnequals);
        btnmod = (Button) findViewById(R.id.btnmod);
        btnmul = (Button) findViewById(R.id.btnmul);
        btnplus = (Button) findViewById(R.id.btnplus);
        btnminus = (Button) findViewById(R.id.btnminus);
        btndiv = (Button) findViewById(R.id.btndiv);
        btnac = (Button) findViewById(R.id.btnac);
        ed1 = (EditText) findViewById(R.id.ed1);

        btn1.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                ed1.setText(ed1.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                ed1.setText(ed1.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                ed1.setText(ed1.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                ed1.setText(ed1.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                ed1.setText(ed1.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                ed1.setText(ed1.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                ed1.setText(ed1.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                ed1.setText(ed1.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                ed1.setText(ed1.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                ed1.setText(ed1.getText()+"0");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                ed1.setText(ed1.getText()+".");
            }
        });

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1==null)
                {

                    assert false;
                    ed1.setText("");
                }
                else
                {
                    storePre();
                    setFalse();
                    add = true;
                    ed1.setText(null);



                }
            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1==null)
                {

                    assert false;
                    ed1.setText("");
                }
                else
                {
                    storePre();
                    setFalse();
                    sub = true;
                    ed1.setText(null);



                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1==null)
                {

                    assert false;
                    ed1.setText("");
                }
                else
                {
                    storePre();
                    setFalse();
                    mul = true;
                    ed1.setText(null);



                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1==null)
                {

                    assert false;
                    ed1.setText("");
                }
                else
                {
                    storePre();
                    setFalse();
                    div = true;
                    ed1.setText(null);



                }
            }
        });
        btnmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed1==null)
                {

                    assert false;
                    ed1.setText("");
                }
                else
                {
                    storePre();
                    setFalse();
                    mod = true;
                    ed1.setText(null);



                }
            }
        });

        btnequals.setOnClickListener(new View.OnClickListener() {


            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if(add)
                {
                    ed1.setText(res1+Float.parseFloat(ed1.getText()+"")+"" );
                }
                if(sub)
                {
                    ed1.setText(res1-Float.parseFloat(ed1.getText()+"")+"" );
                }
                if(mul)
                {
                    ed1.setText(res1*Float.parseFloat(ed1.getText()+"")+"" );
                }
                if(div)
                {
                    ed1.setText(res1/Float.parseFloat(ed1.getText()+"")+"" );
                }
                if(mod)
                {
                    ed1.setText(res1%Float.parseFloat(ed1.getText()+"")+"" );
                }
            }
        });

        btnac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Clear();
            }
        });





    }
}