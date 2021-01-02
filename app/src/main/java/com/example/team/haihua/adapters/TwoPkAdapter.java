package com.example.team.haihua.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.team.R;

import java.util.List;

public class TwoPkAdapter extends RecyclerView.Adapter<TwoPkAdapter.ViewHolder> {
    private List<String> list;
    private Context mContext;

    public TwoPkAdapter(List<String> list, Context mContext) {
        this.list = list;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public TwoPkAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.adapter_twopk, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TwoPkAdapter.ViewHolder holder, int position) {
        holder.nameGirl.setText(list.get(position));
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
        TextView nameGirl;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameGirl = itemView.findViewById(R.id.name_girl);
        }
    }
    private SecendImageAdapter.OnCliItemJump onCliItemJump;

    public void setOnCliItemJump(SecendImageAdapter.OnCliItemJump onCliItemJump) {
        this.onCliItemJump = onCliItemJump;
    }

    public interface OnCliItemJump{
        void onCliJump(int pos);
    }
}
