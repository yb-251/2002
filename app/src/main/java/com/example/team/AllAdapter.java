package com.example.team;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class AllAdapter extends RecyclerView.Adapter {
    Context context;
    List<AllBean> data = new ArrayList<>();

    public AllAdapter(Context context, List<AllBean> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.all_item, parent, false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        Glide.with(context).load(data.get(position).getImg()).into(viewHolder.img_all);
        viewHolder.all_title.setText(data.get(position).getTitle());
        viewHolder.all_teacher.setText(data.get(position).getTeacher());
        viewHolder.all_hour.setText(data.get(position).getHour());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView img_all;
        public TextView all_title;
        public TextView all_teacher;
        public TextView all_hour;

        public ViewHolder(View rootView) {
            super(rootView);
            this.img_all = (ImageView) rootView.findViewById(R.id.img_all);
            this.all_title = (TextView) rootView.findViewById(R.id.all_title);
            this.all_teacher = (TextView) rootView.findViewById(R.id.all_teacher);
            this.all_hour = (TextView) rootView.findViewById(R.id.all_hour);
        }

    }
}
