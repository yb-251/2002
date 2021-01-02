package com.example.team;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.team.lihaha.AboutActivity;
import com.example.team.lihaha.CommentActivity;
import com.example.team.lihaha.OrderActivity;
import com.example.team.lihaha.RegistTableActivity;
import com.example.team.lihaha.RegistionActivity;
import com.example.team.lihaha.WangLeLeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //制式看看界面
        initstart();
    }

    private void initstart() {
        startActivity(new Intent(this, WangLeLeActivity.class));
    }


}