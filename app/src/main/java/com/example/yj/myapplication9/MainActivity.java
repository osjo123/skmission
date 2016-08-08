package com.example.yj.myapplication9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image =(ImageView)this.findViewById(R.id.image_chair);
        //setScaleType(ImageView.ScaleType.FIT_CENTER);
        Button launch1 = (Button)findViewById(R.id.button_image);
        launch1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(MainActivity.this, ImageActivity.class);
                // 첫번째 액티비티를 실행하기 위한 인텐트
                startActivity(intent);
                // 첫번째 액티비티를 실행합니다.
            }
        });

        Button launch2 = (Button)findViewById(R.id.button_graph);
        launch2.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(MainActivity.this, GraphActivity.class);
                // 두번째 액티비티를 실행하기 위한 인텐트
                startActivity(intent);
                // 두번째 액티비티를 실행합니다.
            }
        });
        Button launch3 = (Button)findViewById(R.id.button_mypage);
        launch3.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(MainActivity.this, MypageActivity.class);
                // 두번째 액티비티를 실행하기 위한 인텐트
                startActivity(intent);
                // 두번째 액티비티를 실행합니다.
            }
        });
    }
}
