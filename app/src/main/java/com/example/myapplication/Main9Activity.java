package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main9Activity extends AppCompatActivity implements View.OnClickListener { //OnClickListener 버튼에 이벤트 주기 위해서 명시

    //버튼 생성
    Button okButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);


        //해당 xml 실 버튼 가져옴
        okButton = findViewById(R.id.messenger_btn);
        //버튼 이벤트 명시
        okButton.setOnClickListener(this);
    }

    //토스트 메세지 처리 함수
    private void showToast(String message){
        //토스트 생성
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        //토스트 출력
        toast.show();
    }

    //버튼 이벤 함수
    @Override
    public void onClick(View v) {

        if(v == okButton){
            showToast("ok button click~~~");
        }
    }
}
