package com.example.team.lgs;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewpager.widget.ViewPager;

import com.example.team.R;
import com.example.team.base.BaseActivity;
import com.example.team.interfaces.IBasePresenter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class CourseActivity extends BaseActivity {

    @BindView(R.id.text)
    TextView text;
    @BindView(R.id.rv_set)
    RecyclerView rvSet;
    private List<SetBean> list;
    private SetAdapter setAdapter;
    
    @Override
    protected int getLayout() {
        return R.layout.activity_course;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        list = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            list.add(new SetBean(R.mipmap.jifeng_set,"钢琴钢琴钢琴钢琴","99.9","20课","99"));
        }

        rvSet.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

        setAdapter = new SetAdapter(this, list);

        rvSet.setAdapter(setAdapter);
    }

    @Override
    protected void initData() {

    }
}