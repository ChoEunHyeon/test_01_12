package com.example.cho.test_12_02;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Samsung on 2016-12-09.
 */

public class CMS extends Fragment {

    View view;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.cms_scroll, container, false);

        ImageButton button;

        button = (ImageButton) view.findViewById(R.id.imageButton_cms);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              //AlertDialogCreate();
                FragmentManager fm = getFragmentManager();
                CMS_dialog dialogFragment = new CMS_dialog ();
            //    dialogFragment.getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialogFragment.show(fm,"m");
            }
        });



        return view;
    }


/*
    public void AlertDialogCreate() {

        new AlertDialog.Builder(getActivity())
                .setIcon(R.mipmap.ic_launcher)
                .setTitle("Alert Dialog Box Title")
                .setMessage("Are you sure( Alert Dialog Message )")
                .setPositiveButton("OK", null)
                .setNegativeButton("Cancel", null);

    }*/
}


