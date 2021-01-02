package com.example.team.haihua.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.team.R;
import com.example.team.haihua.HuaActivity;
import com.example.team.haihua.bean.SecendImage;

import java.util.List;

import cn.jzvd.JzvdStd;

public class SecendImageAdapter extends RecyclerView.Adapter<SecendImageAdapter.ViewHolder> {
    private Context mContext;
    private List<SecendImage> list;

    public SecendImageAdapter(Context mContext, List<SecendImage> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @NonNull
    @Override
    public SecendImageAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(mContext, R.layout.adapter_secend, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SecendImageAdapter.ViewHolder holder, int position) {
        holder.jzPlayer.setUp(list.get(position).getUrl(),"");
        holder.txt_ex.setText(list.get(position).getEx());
        holder.week.setText(list.get(position).getWeek());
        holder.house.setText(list.get(position).getAgeHour());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCliItemJump.onCliJump(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        JzvdStd jzPlayer;
        TextView txt_ex;
        TextView week;
        TextView house;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            jzPlayer = itemView.findViewById(R.id.jzPlayer);
            txt_ex = itemView.findViewById(R.id.txt_ex);
            week = itemView.findViewById(R.id.week);
            house = itemView.findViewById(R.id.house);
        }
    }
    private OnCliItemJump onCliItemJump;

    public void setOnCliItemJump(OnCliItemJump onCliItemJump) {
        this.onCliItemJump = onCliItemJump;
    }

    public interface OnCliItemJump{
        void onCliJump(int pos);
    }
}
