package com.example.team.lou;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bigkoo.pickerview.adapter.ArrayWheelAdapter;
import com.contrarywind.listener.OnItemSelectedListener;
import com.contrarywind.view.WheelView;
import com.example.team.R;

import java.util.ArrayList;
import java.util.List;

public class BookOneToOneActivity extends BaseActivity {


    @Override
    protected void initData() {




    }

    @Override
    protected void initView() {

        WheelView wheelView = findViewById(R.id.wheel_view);
        WheelView wheelView2 = findViewById(R.id.wheel_view2);
        WheelView wheelView3 = findViewById(R.id.wheel_view3);
        WheelView wheelView4 = findViewById(R.id.wheel_view4);

        setWheelView(wheelView);
        setWheelView(wheelView2);
        setWheelView(wheelView3);
        setWheelView(wheelView4);




    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_book_one_to_one_layout;
    }

    private void setWheelView(WheelView wheelView) {

        wheelView.setCyclic(false);

        final List<String> mOptionsItems = new ArrayList<>();
        for (int i = 0; i < 24; i++) {

            if (i < 10) {
                mOptionsItems.add("0" + i + ":00");
                mOptionsItems.add("0" + i + ":30");
            } else {
                mOptionsItems.add(i + ":00");
                mOptionsItems.add(i + ":30");
            }

        }


        wheelView.setDividerColor(Color.parseColor("#00000000"));

        wheelView.setItemsVisibleCount(12);

        wheelView.setLineSpacingMultiplier(100);

        wheelView.setTextSize(12);

        wheelView.setTextColorCenter(Color.parseColor("#000000"));

        wheelView.setTextColorOut(Color.parseColor("#333333"));


        wheelView.setAdapter(new ArrayWheelAdapter(mOptionsItems));

        wheelView.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(int index) {
                Toast.makeText(BookOneToOneActivity.this, "" + mOptionsItems.get(index), Toast.LENGTH_SHORT).show();
            }
        });


    }






}
