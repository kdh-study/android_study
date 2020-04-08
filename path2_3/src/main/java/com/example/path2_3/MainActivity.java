package com.example.path2_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        LinearLayout linear=new LinearLayout(this);

        Button bt=new Button(this);
        bt.setText("Button1");
        linear.addView(bt);

        Button bt2=new Button(this);
        bt2.setText("Button2");
        linear.addView(bt2);
        setContentView(linear);
    }
}
