package com.example.team.lou;

import android.widget.ImageView;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.team.R;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class LiveOneToOneActivity extends BaseActivity {

    private List<String> list;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {




        ImageView imageView = findViewById(R.id.imageView10);
        Utils.loadRoundImage(this,R.mipmap.head,imageView);


        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        list = new ArrayList<>();


        for (int i = 0; i <6 ; i++) {

            list.add("");

        }

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        recyclerView.setAdapter(new ImgAdapter(R.layout.activity_live_one_to_one_item,list));





    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_live_one_to_one_layout;
    }

    class ImgAdapter extends BaseQuickAdapter<String, BaseViewHolder>{

        public ImgAdapter(int layoutResId, @Nullable List<String> data) {
            super(layoutResId, data);
        }

        @Override
        protected void convert(@NotNull BaseViewHolder baseViewHolder, String s) {
            ImageView imageView = baseViewHolder.findView(R.id.head_img);

            Utils.loadRoundImage(getContext(),R.mipmap.chaoyue,imageView);

        }
    }

}
