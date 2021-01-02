package com.example.team.lihaha.adpter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.example.team.R;
import com.example.team.lihaha.base.BaseAdapter;
import com.example.team.lihaha.bean.DingDanBean;

import java.util.List;

import butterknife.BindView;

public class DingDanAdpter extends BaseAdapter<DingDanBean> {
    @BindView(R.id.ddphone)
    TextView ddphone;
    @BindView(R.id.phone)
    TextView phone;
    @BindView(R.id.ok)
    TextView ok;
    @BindView(R.id.name)
    TextView name;
    @BindView(R.id.xdtime)
    TextView xdtime;
    @BindView(R.id.time)
    TextView time;
    @BindView(R.id.price)
    TextView price;

    public DingDanAdpter(Context context, List<DingDanBean> data) {
        super(context, data);
    }

    @Override
    protected int getLayout() {
        return R.layout.adpter_dingdan;
    }

    @Override
    protected void bindData(DingDanBean data, VH vh) {
        TextView phone = (TextView) vh.getViewById(R.id.phone);
        TextView name = (TextView) vh.getViewById(R.id.name);
        TextView time = (TextView) vh.getViewById(R.id.time);
        TextView price = (TextView) vh.getViewById(R.id.price);

        phone.setText(data.getPhone());
        name.setText(data.getName());
        time.setText(data.getTime());
        price.setText(data.getPrice());
    }
}
