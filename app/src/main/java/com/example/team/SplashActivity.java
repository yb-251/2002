package com.example.team;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;


public class SplashActivity extends AppCompatActivity {

    private ViewPager splash_vp;
    private ArrayList<View> views;
    private SplashVpAdapter splashVpAdapter;
    private TextView jump;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initView();
    }

    private void initView() {
        splash_vp = findViewById(R.id.splash_vp);

        views = new ArrayList<>();
        View p1 = LayoutInflater.from(this).inflate(R.layout.page_one, null);
        View p2 = LayoutInflater.from(this).inflate(R.layout.page_two, null);
        View p3 = LayoutInflater.from(this).inflate(R.layout.page_three, null);
        views.add(p1);
        views.add(p2);
        views.add(p3);
        jump = p3.findViewById(R.id.jump);
        splashVpAdapter = new SplashVpAdapter(this, views);
        splash_vp.setAdapter(splashVpAdapter);

        jump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
            }
        });
    }
}