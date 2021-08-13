package com.avatar.demo;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;


import com.avatar.demo.adapter.ForegroundAdapter;
import com.avatar.demo.banner3d.SensorLayout;
import com.avatar.demo.bean.Banner3D;
import com.avatar.demo.widget.AutoPlayViewPager;

import java.util.ArrayList;
import java.util.List;

public class Banner3DActivity extends AppCompatActivity {

    private AutoPlayViewPager viewPager;
    private ImageView background;
    private SensorLayout sensorLayout;

    private List<Banner3D> list;
    private ForegroundAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner_3d);
        initView();
        initBannerData();
        initViewpager();
        addPageChangeLister();
    }

    private void initBannerData() {
        list=new ArrayList<>();
        Banner3D item=new Banner3D(R.drawable.background1,R.drawable.mid1,R.drawable.foreground1);
        list.add(item);
        item=new Banner3D(R.drawable.background2,R.drawable.mid2,R.drawable.foreground2);
        list.add(item);
        item=new Banner3D(R.drawable.background3,R.drawable.mid3,R.drawable.foreground3);
        list.add(item);
    }

    private void initView() {
        viewPager = findViewById(R.id.avp_foreground);
        background = findViewById(R.id.iv_background);
        sensorLayout = findViewById(R.id.sensor_layout);
    }

    private void initViewpager() {
        background.setImageResource(list.get(0).getBackground());
        adapter=new ForegroundAdapter(this,list);
        viewPager.setAdapter(adapter);
    }

    private void addPageChangeLister() {
        viewPager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener(){
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                background.setImageResource(list.get(position).getBackground());
            }
        });
    }
}