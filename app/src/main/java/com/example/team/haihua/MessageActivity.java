package com.example.team.haihua;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.team.R;
import com.example.team.haihua.adapters.MessageAdapter;
import com.example.team.haihua.adapters.SecendImageAdapter;
import com.example.team.haihua.bean.GiftMessage;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

//TODO    消息内容
public class MessageActivity extends AppCompatActivity {

    @BindView(R.id.ll_mess)
    LinearLayout llMess;
    private List<GiftMessage> list;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        ButterKnife.bind(this);
        initView();
        initData();
    }

    protected void initView(){
        list = new ArrayList();
        GiftMessage m = new GiftMessage();
        for (int i = 0; i < 5; i++){
            m.setName("已有1497304位用户赢得精美好礼");
            m.setGift("你拆到心仪礼品了吗");
            m.setCan("点击查看");
            m.setTime("11-21 06:27");
            list.add(m);
        }
    }

    protected void initData() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.message, null);

        RecyclerView rlv_message = inflate.findViewById(R.id.rlv_message);
        rlv_message.setLayoutManager(new LinearLayoutManager(this));
        MessageAdapter messageAdapter = new MessageAdapter(this, list);
        rlv_message.setAdapter(messageAdapter);
        llMess.addView(inflate);


        messageAdapter.setOnCliItemJump(new SecendImageAdapter.OnCliItemJump() {
            @Override
            public void onCliJump(int pos) {
                Toast.makeText(MessageActivity.this, "嗯", Toast.LENGTH_SHORT).show();
            }
        });
    }
}