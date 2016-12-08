package com.example.cho.test_12_02;

/**
 * Created by Samsung on 2016-12-08.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Test4 extends Fragment {
    String[] m_names = {"2016 Spring", "2016 Summer", "2016 Fall", "2016 Winter"};

    int[] m_flags = {R.drawable.spring, R.drawable.summer, R.drawable.fall, R.drawable.winter};

    RecyclerView recyclerView;
    RecyclerAdapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Magazine> arrayList = new ArrayList<>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.magazine_main, container, false);
        Context context = view.getContext();
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        int count = 0;
        for (String Name : m_names) {
            arrayList.add(new Magazine(Name, m_flags[count]));
            count++;
        }

        adapter = new RecyclerAdapter(arrayList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
