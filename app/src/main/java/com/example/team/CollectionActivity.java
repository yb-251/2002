package com.example.team;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class CollectionActivity extends AppCompatActivity {

    private ImageView img_back;
    private TextView txt_title;
    private TabLayout tab;
    private ViewPager viewpager;
    private ArrayList<String> titles;
    private ArrayList<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);
        txt_title.setText("收藏");
        initView();
    }

    private void initView() {
        img_back = (ImageView) findViewById(R.id.img_back);
        txt_title = (TextView) findViewById(R.id.txt_title);
        tab = (TabLayout) findViewById(R.id.tab);
        viewpager = (ViewPager) findViewById(R.id.viewpager);

        titles = new ArrayList<>();
        titles.add("全部");
        titles.add("课程");
        titles.add("活动");
        titles.add("商品");
        fragments = new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            fragments.add(new AllFragment());
        }

        viewpager.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return titles.get(position);
            }
        });
        tab.setupWithViewPager(viewpager);

    }
}