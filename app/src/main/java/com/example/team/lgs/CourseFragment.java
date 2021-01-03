package com.example.team.lgs;

import androidx.viewpager.widget.ViewPager;

import com.example.team.R;
import com.example.team.base.BaseFragment;
import com.example.team.interfaces.IBasePresenter;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;

public class CourseFragment extends BaseFragment {

    @BindView(R.id.tablayout)
    TabLayout tablayout;
    @BindView(R.id.viewpager)
    ViewPager viewpager;

    @Override
    protected int getLayout() {
        return R.layout.fragment_course;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }
}