package yeom.example.cho.test_12_02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * Created by Samsung on 2016-12-09.
 */

public class Group extends Fragment{

    View view;
    ImageView imgView1;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.group_scroll, container, false);
        imgView1 = (ImageView) view.findViewById(R.id.img1);
        imgView1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent redirect = new Intent(getActivity(),Group01.class);
                getActivity().startActivity(redirect);
            }
        });

        return view;
    }

    /**
     * Created by Samsung on 2016-12-09.
     */

    public static class CMS extends Fragment {

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
}
