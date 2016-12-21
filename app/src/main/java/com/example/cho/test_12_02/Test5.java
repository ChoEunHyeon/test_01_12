package com.example.cho.test_12_02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by User on 2016-11-15.
 */

public class Test5  extends Fragment {
    public Test5(){


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.home_to_more, container, false);

        Button button = (Button)view.findViewById(R.id.mh_button2);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent redirect = new Intent(getActivity(),MH.class);
                getActivity().startActivity(redirect);
            }
        });

        return view;
    }

}

