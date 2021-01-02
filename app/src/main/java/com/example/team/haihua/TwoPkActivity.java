package com.example.team.haihua;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.team.R;
import com.example.team.haihua.adapters.SecendImageAdapter;
import com.example.team.haihua.adapters.TwoPkAdapter;

import java.util.ArrayList;
import java.util.List;

public class TwoPkActivity extends AppCompatActivity {

    private RecyclerView twoRecycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_pk);
        initView();
    }

    private void initView() {
        twoRecycle = (RecyclerView) findViewById(R.id.two_recycle);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list.add("高圆圆");
        }
        twoRecycle.setLayoutManager(new LinearLayoutManager(this));
        TwoPkAdapter twoPkAdapter = new TwoPkAdapter(list, this);
        twoRecycle.setAdapter(twoPkAdapter);

        twoPkAdapter.setOnCliItemJump(new SecendImageAdapter.OnCliItemJump() {
            @Override
            public void onCliJump(int pos) {
                startActivity(new Intent(TwoPkActivity.this,MessageActivity.class));
            }
        });
    }
}