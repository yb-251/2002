package com.example.team.haihua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.team.R;

public class WlActivity extends AppCompatActivity {
    private LinearLayout linOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wl);
        initView();
    }

    private void initView() {
        linOne = (LinearLayout) findViewById(R.id.lin_one);
      linOne.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              startActivity(new Intent(WlActivity.this,OnePkActivity.class));
          }
      });
    }
}