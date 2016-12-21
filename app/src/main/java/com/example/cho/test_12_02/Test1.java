package com.example.cho.test_12_02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by User on 2016-11-15.
 */

public class Test1 extends Fragment {
    public Test1(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.home_to_info, container, false);

        Button button = (Button)view.findViewById(R.id.buttons_3);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent redirect = new Intent(getActivity(),Samuchc.class);
                getActivity().startActivity(redirect);
            }
        });

        Button button1 = (Button)view.findViewById(R.id.buttons_2);
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent redirect = new Intent(getActivity(),Supum.class);
                getActivity().startActivity(redirect);
            }
        });

        Button button2 = (Button)view.findViewById(R.id.buttons_4);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent redirect = new Intent(getActivity(),Yenmeangjang.class);
                getActivity().startActivity(redirect);
            }
        });

        return view;
    }

}
