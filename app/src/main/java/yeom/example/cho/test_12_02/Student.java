package yeom.example.cho.test_12_02;

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

public class Student extends Fragment{

    View view;
    ImageView imgView1;
    ImageView imgView2;
    ImageView imgView3;
    ImageView imgView4;
    ImageView imgView5;
    ImageView imgView6;
    ImageView imgView7;
    ImageView imgView8;
    ImageView imgView9;
    ImageView imgView10;
    ImageView imgView11;
    ImageView imgView12;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.student_scroll, container, false);
        imgView1 = (ImageView) view.findViewById(R.id.img1);
        imgView1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent redirect = new Intent(getActivity(),Student01.class);
                getActivity().startActivity(redirect);
            }
        });
        imgView2 = (ImageView) view.findViewById(R.id.img2);
        imgView2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent redirect = new Intent(getActivity(),Student02.class);
                getActivity().startActivity(redirect);
            }
        });
        imgView3 = (ImageView) view.findViewById(R.id.img3);
        imgView3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent redirect = new Intent(getActivity(), Student03.class);
                getActivity().startActivity(redirect);
            }
        });
        imgView4 = (ImageView) view.findViewById(R.id.img4);
        imgView4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent redirect = new Intent(getActivity(), Student04.class);
                getActivity().startActivity(redirect);
            }
        });
        imgView5 = (ImageView) view.findViewById(R.id.img5);
        imgView5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent redirect = new Intent(getActivity(), Student05.class);
                getActivity().startActivity(redirect);
            }
        });
        imgView6 = (ImageView) view.findViewById(R.id.img6);
        imgView6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent redirect = new Intent(getActivity(), Student06.class);
                getActivity().startActivity(redirect);
            }
        });
        imgView7 = (ImageView) view.findViewById(R.id.img7);
        imgView7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent redirect = new Intent(getActivity(),Student07.class);
                getActivity().startActivity(redirect);
            }
        });
        imgView8 = (ImageView) view.findViewById(R.id.img8);
        imgView8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent redirect = new Intent(getActivity(),Student08.class);
                getActivity().startActivity(redirect);
            }
        });
        imgView9 = (ImageView) view.findViewById(R.id.img9);
        imgView9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent redirect = new Intent(getActivity(),Student09.class);
                getActivity().startActivity(redirect);
            }
        });
        imgView10 = (ImageView) view.findViewById(R.id.img10);
        imgView10.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent redirect = new Intent(getActivity(),Student10.class);
                getActivity().startActivity(redirect);
            }
        });
        imgView11 = (ImageView) view.findViewById(R.id.img11);
        imgView11.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent redirect = new Intent(getActivity(),Student11.class);
                getActivity().startActivity(redirect);
            }
        });
        imgView12 = (ImageView) view.findViewById(R.id.img12);
        imgView12.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent redirect = new Intent(getActivity(),Student12.class);
                getActivity().startActivity(redirect);
            }
        });


        return view;
    }
}