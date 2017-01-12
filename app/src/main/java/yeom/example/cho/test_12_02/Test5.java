package yeom.example.cho.test_12_02;

import android.annotation.TargetApi;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.widget.Button;

/**
 * Created by User on 2016-11-15.
 */

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.Toast;

public class Test5 extends Fragment {

    private ImageButton imgbtn_mh;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.mh, container, false);

        imgbtn_mh =(ImageButton)v.findViewById(R.id.mh_imgBtn);
        imgbtn_mh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getActivity(), "아! 홈페이지로 이동합니다", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://gscamp.smpon.kr/theme3/index.php"));
                startActivity(intent);
            }
        });
        return v;


    }
}