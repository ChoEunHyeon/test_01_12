package com.example.cho.test_12_02;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.support.v4.app.*;

/**
 * Created by User on 2016-11-15.
 */

public class Test2  extends Fragment implements View.OnClickListener{
    private Context CurrentObj = getActivity();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.mgz_main, container, false);
        ((Button) view.findViewById(R.id.button)).setOnClickListener(this);
        return view;
    }
    public void onClick(View view) {
        Fragment fragment = new Fragment();
        FragmentManager fragmentManager = getFragmentManager();
    }

