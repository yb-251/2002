package com.example.team.lihaha.fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.team.R;
import com.example.team.lihaha.adpter.DingDanAdpter;
import com.example.team.lihaha.base.BaseFragment;
import com.example.team.lihaha.base.BasePresenter;
import com.example.team.lihaha.bean.DingDanBean;

import java.util.ArrayList;

import butterknife.BindView;

public class MyFragment extends BaseFragment {
    @BindView(R.id.rcy)
    RecyclerView rcy;

    @Override
    protected int getLayout() {
        return R.layout.fragment_my;
    }

    @Override
    protected void initView() {
        rcy.setLayoutManager(new LinearLayoutManager(getActivity()));
        ArrayList<DingDanBean> dingDanBeans = new ArrayList<>();
        dingDanBeans.add(new DingDanBean("123456789","钢琴一对一赔练课程","2020.12.08","500"));
        DingDanAdpter dingDanAdpter = new DingDanAdpter(getActivity(),dingDanBeans);
        rcy.setAdapter(dingDanAdpter);

    }

    @Override
    protected BasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initData() {

    }

    @Override
    public void showTips(String tips) {

    }
}
