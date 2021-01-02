package com.example.team.haihua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.team.R;

public class OnePkActivity extends AppCompatActivity {

    private Button btnOneJump;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_pk);
        initView();
    }

    private void initView() {
        btnOneJump = (Button) findViewById(R.id.btn_one_jump);
        btnOneJump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OnePkActivity.this,TwoPkActivity.class));
            }
        });
    }
}