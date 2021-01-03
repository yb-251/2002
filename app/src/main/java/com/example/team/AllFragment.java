package com.example.team;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class AllFragment extends Fragment {


    private RecyclerView rlv_all;
    private AllAdapter allAdapter;

    public AllFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_all, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        rlv_all = getActivity().findViewById(R.id.rlv_all);
        rlv_all.setLayoutManager(new LinearLayoutManager(getActivity()));
        List<AllBean> list = new ArrayList<>();
        for (int i = 0; i <2 ; i++) {
            list.get(i).setImg(R.drawable.ic_launcher_background);
            list.get(i).setHour("200/小时");
            list.get(i).setTitle("钢琴一对一陪练课程");
            list.get(i).setTeacher("金月月老师");
        }
        allAdapter = new AllAdapter(getActivity(), list);
        rlv_all.setAdapter(allAdapter);
    }
}