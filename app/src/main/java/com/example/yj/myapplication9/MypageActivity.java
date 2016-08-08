package com.example.yj.myapplication9;


import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by YJ on 2016-08-06.
 */
public class MypageActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setElevation(0);
        getSupportActionBar().setTitle("마이페이지");

        ListView listview1 ;
        ListView listview2 ;
        ListViewAdapter adapter1;
        ListViewAdapter2 adapter2;

        // Adapter 생성
        adapter1 = new ListViewAdapter() ;
        adapter2 = new ListViewAdapter2() ;

        // 리스트뷰 참조 및 Adapter달기
        listview1 = (ListView) findViewById(R.id.list_mypage);
        listview2 = (ListView) findViewById(R.id.list_mypage_setting);
        listview1.setAdapter(adapter1);
        listview2.setAdapter(adapter2);


        // 첫 번째 아이템 추가.
        adapter1.addItem(ContextCompat.getDrawable(this, R.drawable.user_icon),
                "내 프로필") ;
        // 두 번째 아이템 추가.
        adapter1.addItem(ContextCompat.getDrawable(this, R.drawable.list_icon),
                "내 기록보기") ;
        // 세 번째 아이템 추가.

        adapter2.addItem(ContextCompat.getDrawable(this, R.drawable.bell_icon),
                "알림설정") ;

        adapter2.addItem(ContextCompat.getDrawable(this, R.drawable.sound_icon),
                "소리") ;

        adapter2.addItem(ContextCompat.getDrawable(this, R.drawable.vibration_icon),
                "진동") ;

    }

    @Override
    public boolean onOptionsItemSelected(android.view.MenuItem item)
    {
        switch(item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

