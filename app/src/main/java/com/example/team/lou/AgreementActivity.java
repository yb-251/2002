package com.example.team.lou;

import android.content.Intent;
import android.view.View;

import com.example.team.R;

public class AgreementActivity extends BaseActivity{
    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

        findViewById(R.id.textView9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        findViewById(R.id.textView10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(AgreementActivity.this,CurriculumActivity.class));

            }
        });



    }


    @Override
    protected int getLayoutId() {
        return R.layout.activity_agreement_layout;
    }
}
