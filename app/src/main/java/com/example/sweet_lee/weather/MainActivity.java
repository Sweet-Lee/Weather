package com.example.sweet_lee.weather;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;
    private ViewPager vp;
    private LinearLayout dotLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.iv_btn);
        textView = findViewById(R.id.tv_location);
        vp=findViewById(R.id.view_page);
        final String tv = textView.getText().toString();
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CityActivity.class);
                intent.putExtra("city", tv);
                startActivityForResult(intent,1000);
            }
        });
        initViewPage();
    }

    private void initViewPage() {
        List<View> list=new ArrayList<>();
        LayoutInflater If=getLayoutInflater();
        list.add(If.inflate(R.layout.viewpage1_home,null));
        list.add(If.inflate(R.layout.viewpage2_home,null));
        MyAdapter myAdapter=new MyAdapter(list);
        vp.setAdapter(myAdapter);
        //dotLayout=findViewById(R.id.layout_point);
        //vp.addOnPageChangeListener(new ViewPagerIndicator(this,vp,dotLayout,2));

    }

    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode==1000&&resultCode==1001){
            String result_value=data.getStringExtra("search");
            textView.setText(result_value);
        }

    }
}