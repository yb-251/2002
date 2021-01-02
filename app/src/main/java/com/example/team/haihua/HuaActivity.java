package com.example.team.haihua;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.team.R;
import com.example.team.haihua.adapters.SecendImageAdapter;
import com.example.team.haihua.bean.SecendImage;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HuaActivity extends AppCompatActivity {

    @BindView(R.id.gRecycle)
    RecyclerView gRecycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hua);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        gRecycle.setLayoutManager(new LinearLayoutManager(this));
        List<SecendImage> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            SecendImage image = new SecendImage();
            image.setUrl("https://cz-video-view.oss-cn-beijing.aliyuncs.com/20191204/98fcadb6ccc2775231b25dfda40a0894.mp4");
            image.setAgeHour("9小时以前");
            image.setEx("小练习——第一节");
            image.setWeek("节奏练习");
            list.add(image);
        }

        SecendImageAdapter adapter = new SecendImageAdapter(this, list);
        gRecycle.setAdapter(adapter);

        adapter.setOnCliItemJump(new SecendImageAdapter.OnCliItemJump() {
            @Override
            public void onCliJump(int pos) {
                startActivity(new Intent(HuaActivity.this,JobCardActivity.class));
            }
        });
    }
}