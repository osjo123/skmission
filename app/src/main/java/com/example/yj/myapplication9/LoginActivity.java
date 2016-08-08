package com.example.yj.myapplication9;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by YJ on 2016-08-07.
 */
public class LoginActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageView image =(ImageView)this.findViewById(R.id.image_login);
        //setScaleType(ImageView.ScaleType.FIT_CENTER);
        Button launch1 = (Button)findViewById(R.id.button_guest);
        launch1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                // 첫번째 액티비티를 실행하기 위한 인텐트
                startActivity(intent);
                // 첫번째 액티비티를 실행합니다.
            }
        });
    }

    }
