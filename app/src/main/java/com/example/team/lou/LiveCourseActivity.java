package com.example.team.lou;

import android.content.Intent;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.team.R;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class LiveCourseActivity extends BaseActivity {
    @Override
    protected void initData() {

    }

    List<Integer> list;

    @Override
    protected void initView() {

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        final RecyclerView recyclerView2 = findViewById(R.id.recyclerView2);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));



        recyclerView.setLayoutManager(linearLayoutManager);

        list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {

            list.add(i);
        }
        Log.e("i", "ffff");

        List<MessageBean> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            MessageBean messageBean = new MessageBean();


            if (i % 2 == 0) {

                messageBean.setMsg("超越妹妹真好康");
                messageBean.setName("美丽人生");

            } else {

                messageBean.setMsg("我来了");
                messageBean.setName("超级玛丽");



            }

            list2.add(messageBean);



        }

        ImgAdapter imgAdapter = new ImgAdapter(R.layout.activity_live_course_item, list);
        recyclerView.setAdapter(imgAdapter);


        imgAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(@NonNull BaseQuickAdapter<?, ?> adapter, @NonNull View view, int position) {
                startActivity(new Intent(LiveCourseActivity.this,LiveOneToOneActivity.class));
            }
        });


        MessageAdapter messageAdapter = new MessageAdapter(R.layout.activity_live_course_msg_item, list2);
        recyclerView2.setAdapter(messageAdapter);

        TimerTask mTimerTask = new TimerTask() {
            @Override
            public void run() {
                recyclerView2.smoothScrollBy(0, 10);//写一个定时任务轮训调用RecyclerView的smoothScrollBy(int dx,int dy)方法，使recyclerView定时滚动
            }
        };


        Timer timer = new Timer();
        timer.scheduleAtFixedRate(mTimerTask,new Date(),300 );


    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_live_course_layout;
    }

    class ImgAdapter extends BaseQuickAdapter<Integer, BaseViewHolder> {

        public ImgAdapter(int layoutResId, @Nullable List<Integer> data) {
            super(layoutResId, data);
        }

        @Override
        protected void convert(@NotNull BaseViewHolder baseViewHolder, Integer integer) {

            ConstraintLayout.LayoutParams lp = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
            if (baseViewHolder.getAdapterPosition() == list.size() - 1) {
                lp.setMargins(0, 0, 0, 0);
            } else {
                lp.setMargins(0, 0, -20, 0);
            }

            baseViewHolder.getView(R.id.cons).setLayoutParams(lp);


        }
    }

    class MessageAdapter extends BaseQuickAdapter<MessageBean, BaseViewHolder> {

        public MessageAdapter(int layoutResId, @Nullable List<MessageBean> data) {
            super(layoutResId, data);
        }

        @Override
        protected void convert(@NotNull BaseViewHolder baseViewHolder, MessageBean s) {

            baseViewHolder.setText(R.id.text_msg, s.getMsg());
            baseViewHolder.setText(R.id.text_name, s.getName());


        }

        //重写此方法，使recyclerView可以一直滑动
        @Override
        public int getItemCount() {

            return Integer.MAX_VALUE;
        }

        //重写getItem以免出现无限滑动时当position大于data的size时获得对象为空
        @Nullable
        @Override
        public MessageBean getItem(int position) {
            int newPosition = position % getData().size();
            return getData().get(newPosition);
        }

        //重写此方法，因为BaseQuickAdapter里绘制view时会调用此方法判断，position减去getHeaderLayoutCount小于data.size()时才会调用调用cover方法绘制我们自定义的view
        @Override
        public int getItemViewType(int position) {
            int count = getHeaderLayoutCount() + getData().size();
            //刚开始进入包含该类的activity时,count为0。就会出现0%0的情况，这会抛出异常，所以我们要在下面做一下判断
            if (count <= 0) {
                count = 1;
            }
            int newPosition = position % count;
            Log.d("TEST", "newPosition：" + newPosition);
            return super.getItemViewType(newPosition);
        }

    }

}
