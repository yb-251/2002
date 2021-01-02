package com.example.team.lihaha.adpter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.team.R;
import com.example.team.lihaha.base.BaseAdapter;
import com.example.team.lihaha.bean.DataBeans;

import java.util.List;

public class ReHotAdpter extends BaseAdapter<DataBeans> {
    public ReHotAdpter(Context context, List<DataBeans> data) {
        super(context, data);
    }

    @Override
    protected int getLayout() {
        return R.layout.adpter_rehot;
    }

    @Override
    protected void bindData(DataBeans data, VH vh) {
        ImageView img = (ImageView) vh.getViewById(R.id.rehot_img);
        TextView tvcontent = (TextView) vh.getViewById(R.id.txt_tag);
        TextView tvtitle = (TextView) vh.getViewById(R.id.tv_text);
        Glide.with(context).load(data.getImg()).into(img);
        tvcontent.setText(data.getContent());
        tvtitle.setText(data.getTitle());

    }
}
