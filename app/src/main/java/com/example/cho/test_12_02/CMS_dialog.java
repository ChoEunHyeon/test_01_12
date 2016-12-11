package com.example.cho.test_12_02;


import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by User on 2016-12-12.
 */

public class CMS_dialog  extends DialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.cms_me, container, false);
     // getDialog().setTitle("a");
        getDialog().setCanceledOnTouchOutside(true);
        getDialog().getWindow().setBackgroundDrawable

                (new ColorDrawable(android.graphics.Color.TRANSPARENT));
        return rootView;
    }
}
