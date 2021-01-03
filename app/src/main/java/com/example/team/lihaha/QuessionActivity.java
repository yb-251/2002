package com.example.team.lihaha;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.team.R;
import com.example.team.lihaha.adpter.QuessionAdpter;
import com.example.team.lihaha.base.QuessionBean;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class QuessionActivity extends AppCompatActivity {

    @BindView(R.id.quession_rcy)
    RecyclerView quessionRcy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quession);
        ButterKnife.bind(this);
        initRcy();
    }

    private void initRcy() {
        ArrayList<QuessionBean> quessionBeans = new ArrayList<>();
        quessionBeans.add(new QuessionBean("什么是土星","ahahahahahahahhahahahahahahahahahahahahahhahahahahahahahahahahahahaha"));
        quessionBeans.add(new QuessionBean("什么是土星","ahahahahahahahhahahahahahahahahahahahahahhahahahahahahahahahahahahaha"));
        quessionBeans.add(new QuessionBean("什么是土星","ahahahahahahahhahahahahahahahahahahahahahhahahahahahahahahahahahahaha"));
        quessionBeans.add(new QuessionBean("什么是土星","ahahahahahahahhahahahahahahahahahahahahahhahahahahahahahahahahahahaha"));
        quessionBeans.add(new QuessionBean("什么是土星","ahahahahahahahhahahahahahahahahahahahahahhahahahahahahahahahahahahaha"));
        quessionRcy.setLayoutManager(new LinearLayoutManager(this));
        quessionRcy.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        //创建爱你适配器
        QuessionAdpter quessionAdpter = new QuessionAdpter(this,quessionBeans);
        //绑定
        quessionRcy.setAdapter(quessionAdpter);
    }
}