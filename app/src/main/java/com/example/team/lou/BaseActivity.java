package com.example.team.lou;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initView();
        initData();

        Utils.makeStatusBarTransparent(this);
        Utils.setAndroidNativeLightStatusBar(this,true);

    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int getLayoutId();
}
