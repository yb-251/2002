package com.example.team.lihaha;

import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.team.R;

public class LoginActivity extends AppCompatActivity {

    /**
     * 登录即代表同意《中国移动认证服务条款》和《用户协议》
     */
    private TextView mTvXieyi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        initFu();
    }

    private void initView() {
        mTvXieyi = (TextView) findViewById(R.id.tv_xieyi);
    }
    //富文本
    private void initFu() {
        String content = mTvXieyi.getText().toString();
        //第一个《》
        SpannableString spannableString = new SpannableString(content);
        int start=content.indexOf("《");
        int end=content.indexOf("》和")+1;
        //设置字体颜色
        spannableString.setSpan(new ForegroundColorSpan(Color.BLUE),start,end,Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
       /* //设置可点击并点击有颜色
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {

            }
        };
        spannableString.setSpan(clickableSpan,start,end, Spanned.SPAN_EXCLUSIVE_INCLUSIVE);*/
        //mTvXieyi.setMovementMethod(LinkMovementMethod.getInstance());
        //把修改后的设置给控件
        mTvXieyi.setText(spannableString);


        int star = content.indexOf("和《")+1;
        int endd = content.lastIndexOf("议》") + 2;
        spannableString.setSpan(new ForegroundColorSpan(Color.BLUE), star, endd, Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        //mTvXieyi.setMovementMethod(LinkMovementMethod.getInstance());
        mTvXieyi.setText(spannableString);


    }


}