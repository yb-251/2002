package com.example.team.lou;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.team.R;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CurriculumActivity extends BaseActivity implements OnItemClickListener {

    List<String> mList = new ArrayList<>();


    @Override
    protected void initData() {



    }

    @Override
    protected void initView() {

        RecyclerView recyclerView = findViewById(R.id.recyclerView3);
        RecyclerView recyclerView2 = findViewById(R.id.recyclerView4);

        findViewById(R.id.imageView14).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CurriculumActivity.this,UserInfoActivity.class));
            }
        });
        findViewById(R.id.imageView15).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CurriculumActivity.this,CouponActivity.class));
            }
        });
        findViewById(R.id.imageView13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CurriculumActivity.this,BookOneToOneActivity.class));
            }
        });
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);

        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView2.setLayoutManager(linearLayoutManager);

        for (int i = 0; i < 6; i++) {
            mList.add("1");

        }


        CurriculumCardAdapter adapter2 = new CurriculumCardAdapter(R.layout.activity_curriculum_recyc_item2,mList);

        CurriculumCardAdapter adapter = new CurriculumCardAdapter(R.layout.activity_curriculum_recyc_item,mList);
        recyclerView.setAdapter(adapter);
        recyclerView2.setAdapter(adapter2);

        adapter2.setOnItemClickListener(this);

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_curriculum_layout;
    }

    @Override
    public void onItemClick(@NonNull BaseQuickAdapter<?, ?> adapter, @NonNull View view, int position) {


        startActivity(new Intent(CurriculumActivity.this,LiveCourseActivity.class));

    }



    class CurriculumCardAdapter extends BaseQuickAdapter<String, BaseViewHolder>{

       public CurriculumCardAdapter(int layoutResId, @Nullable List<String> data) {
           super(layoutResId, data);
       }

       @Override
       protected void convert(@NotNull BaseViewHolder baseViewHolder, String s) {

           Log.e("tag","????");


           if (getLayoutId() == R.layout.activity_curriculum_recyc_item2) {

               ImageView view = baseViewHolder.getView(R.id.imageView17);

               Log.e("tag","tag");

               Utils.loadRoundImage(getContext(), R.mipmap.head, view);
           }


       }
   }

}
