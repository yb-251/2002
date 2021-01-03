package com.example.team.lou;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.team.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class CouponActivity extends BaseActivity {

    RecyclerView recyclerView;

    @Override
    protected void initData() {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("1");
        }
        recyclerView.setAdapter(new CouponListAdapter(R.layout.coupon_list_item, list));

    }

    @Override
    protected void initView() {

        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_coupon_list_layout;
    }

    class CouponListAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

        public CouponListAdapter(int layoutResId, @org.jetbrains.annotations.Nullable List<String> data) {
            super(layoutResId, data);
        }

        @Override
        protected void convert(@NotNull BaseViewHolder baseViewHolder, String s) {

        }
    }

}
