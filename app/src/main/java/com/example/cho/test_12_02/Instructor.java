package com.example.cho.test_12_02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Samsung on 2016-12-09.
 */

public class Instructor extends Fragment{

    View view;
    ImageView imgView1;
    ImageView imgView2;
    ImageView imgView3;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.instructor_scroll, container, false);
        imgView1 = (ImageView) view.findViewById(R.id.imgi1);
        imgView1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent redirect = new Intent(getActivity(),Instructor01.class);
                getActivity().startActivity(redirect);
            }
        });
        imgView2 = (ImageView) view.findViewById(R.id.imgi2);
        imgView2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent redirect = new Intent(getActivity(),Instructor02.class);
                getActivity().startActivity(redirect);
            }
        });
        imgView3 = (ImageView) view.findViewById(R.id.img3);
        imgView3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent redirect = new Intent(getActivity(),Instructor03.class);
                getActivity().startActivity(redirect);
            }
        });
        return view;
    }
}
