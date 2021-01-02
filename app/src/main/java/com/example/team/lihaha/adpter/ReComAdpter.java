package com.example.team.lihaha.adpter;

import android.content.Context;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.team.R;
import com.example.team.lihaha.base.BaseAdapter;
import com.example.team.lihaha.bean.DataBeans;

import java.util.List;

public class ReComAdpter extends BaseAdapter<DataBeans> {
    public ReComAdpter(Context context, List<DataBeans> data) {
        super(context, data);
    }

    @Override
    protected int getLayout() {
        return R.layout.adpter_recom;
    }

    @Override
    protected void bindData(DataBeans data, VH vh) {
        TextView tvcontent = (TextView) vh.getViewById(R.id.recom__content);
        TextView tvtitle = (TextView) vh.getViewById(R.id.recom__text);
        tvcontent.setText(data.getContent());
        tvtitle.setText(data.getTitle());
    }
}
