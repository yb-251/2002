package com.example.team.lihaha;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.team.R;
import com.example.team.lihaha.adpter.ReComAdpter;
import com.example.team.lihaha.adpter.ReHotAdpter;
import com.example.team.lihaha.bean.DataBeans;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RegistionActivity extends AppCompatActivity {

    @BindView(R.id.re_banner)
    ImageView reBanner;
    @BindView(R.id.re_rehot)
    RecyclerView reRehot;
    @BindView(R.id.re_recommend)
    RecyclerView reRecommend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registion);
        ButterKnife.bind(this);
        initRcy();
    }

    private void initRcy() {
        //创建集合

        ArrayList<DataBeans> dataBeans = new ArrayList<>();
        dataBeans.add(new DataBeans(R.mipmap.shou_img,"钢琴直播课","12.5日一起来参加吧！"));
        dataBeans.add(new DataBeans(R.mipmap.shou_img,"钢琴直播课","12.5日一起来参加吧！"));
        dataBeans.add(new DataBeans(R.mipmap.shou_img,"钢琴直播课","12.5日一起来参加吧！"));
        //设置布局
        reRehot.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        ReHotAdpter reHotAdpter = new ReHotAdpter(this,dataBeans);
        reRehot.setAdapter(reHotAdpter);

        //设置布局
        reRecommend.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        ReComAdpter reComAdpter = new ReComAdpter(this,dataBeans);
        reRecommend.setAdapter(reComAdpter);

    }
}