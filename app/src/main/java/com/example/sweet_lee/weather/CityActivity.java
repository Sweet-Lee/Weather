package com.example.sweet_lee.weather;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CityActivity extends Activity {
    private Spinner province;
    private Spinner city;
    private TextView tvData;
    private Button btnConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        tvData=findViewById(R.id.city_now);
        Intent intent=getIntent();
        String value="当前城市:"+intent.getStringExtra("city");
        tvData.setText(value);

        province = findViewById(R.id.spinner_province);
        city = findViewById(R.id.spinner_city);
        btnConfirm = findViewById(R.id.btn_confirm);

        // 初始化数据
        initData();

        // 设置Adapter
        province.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, provinces));
        city.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item, cities.get(provinces.get(0))));

        // 监听province的item点击和btnConfirm的点击
        province.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // 根据点击的省，切换city的adapter
                String p = (String) adapterView.getItemAtPosition(i); // 获取点击的省的名称
                city.setAdapter(new ArrayAdapter<>(CityActivity.this,
                        android.R.layout.simple_list_item_1, cities.get(p)));
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // 什么都不做
            }
        });
        // 给button按钮设置onClick监听器，获取spinner的选项值
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String result = city.getSelectedItem().toString();
                Intent intent1=new Intent();
                intent1.putExtra("search",result);
                setResult(1001,intent1);
                finish();
               // Toast.makeText(CityActivity.this, result, Toast.LENGTH_SHORT).show();
            }
        });
    }
    private Map<String, String[]> cities;
    private List<String> provinces;
    // 初始化
    private void initData() {
        cities = new HashMap<>();
        provinces = Arrays.asList(getResources().getStringArray(R.array.province_arr));
        cities.put(provinces.get(0), new String[] {"南京","常州","苏州","扬州","徐州"});
        cities.put(provinces.get(1), new String[] {"合肥","滁州","芜湖","马鞍山"});
        cities.put(provinces.get(2), new String[] {"杭州","湖州","嘉兴","宁波","温州", "绍兴"});
    }

}
