package com.example.team.lihaha.adpter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.team.R;
import com.example.team.lihaha.base.BaseAdapter;
import com.example.team.lihaha.base.QuessionBean;

import java.util.List;

public class QuessionAdpter extends BaseAdapter<QuessionBean> {
    public QuessionAdpter(Context context, List data) {
        super(context, data);
    }

    @Override
    protected int getLayout() {
        return R.layout.adpter_quession;
    }

    @Override
    protected void bindData(QuessionBean data, VH vh) {
        TextView name = (TextView) vh.getViewById(R.id.what);
        TextView content = (TextView) vh.getViewById(R.id.que_content);
        ImageView img = (ImageView) vh.getViewById(R.id.jiantou);
        name.setText(data.getName());
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                content.setText(data.getContent());
            }
        });

    }


}
