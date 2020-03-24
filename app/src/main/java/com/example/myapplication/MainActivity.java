package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout = new LinearLayout(this);

        Button bt = new Button(this);

        bt.setText("Button 1");
        linearLayout.addView(bt);

        Button bt1 = new Button(this);

        bt1.setText("Button 2");
        linearLayout.addView(bt1);

        Button bt2 = new Button(this);
        bt2.setText("Button 3");
        linearLayout.addView(bt2);

        setContentView(linearLayout);




        //setContentView(R.layout.activity_main);
    }
}
