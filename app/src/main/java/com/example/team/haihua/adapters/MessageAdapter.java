package com.example.team.haihua.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.team.R;
import com.example.team.haihua.bean.GiftMessage;

import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.ViewHolder> {
    private Context mContext;
    private List<GiftMessage> list;


    public MessageAdapter(Context mContext, List<GiftMessage> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(mContext, R.layout.item_message, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtGift.setText(list.get(position).getGift());
        holder.txtTime.setText(list.get(position).getTime());
        holder.txtName.setText(list.get(position).getName());
        holder.txtCan.setText(list.get(position).getCan());

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
        TextView txtTime;
        ImageView imgMusic;
        TextView txtName;
        TextView txtGift;
        TextView txtCan;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTime = itemView.findViewById(R.id.txt_time);
            imgMusic = itemView.findViewById(R.id.img_music);
            txtGift = itemView.findViewById(R.id.txt_gift);
            txtName = itemView.findViewById(R.id.txt_gift);
            txtCan = itemView.findViewById(R.id.txt_can);
        }
    }

    private SecendImageAdapter.OnCliItemJump onCliItemJump;

    public void setOnCliItemJump(SecendImageAdapter.OnCliItemJump onCliItemJump) {
        this.onCliItemJump = onCliItemJump;
    }

    public interface OnCliItemJump {
        void onCliJump(int pos);
    }
}
