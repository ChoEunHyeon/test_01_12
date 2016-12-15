package com.example.cho.test_12_02;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.support.design.widget.TabLayout;



/**
 * Created by cho on 2016-12-02.
 */

public class HomeActivity extends AppCompatActivity {

    private final long FINISH_INTERVAL_TIME = 2000; //종료
    private long backPressedTime = 0; //종료

    Toolbar toolbar;
    TabLayout home_tabLayout;
    LockableViewPager home_viewPager;
    Home_ViewPagerAdapter home_viewPagerAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_basis);

        toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        home_tabLayout = (TabLayout) findViewById(R.id.home_tab_layout);
        home_viewPager = (LockableViewPager) findViewById(R.id.home_viewPager);
        home_viewPager.setSwipeable(false);

        home_viewPagerAdapter = new Home_ViewPagerAdapter(getSupportFragmentManager());
        home_viewPagerAdapter.addFragments(new Test1(), "");
        home_viewPagerAdapter.addFragments(new Test2(), "");
        home_viewPagerAdapter.addFragments(new Test5(), "");

        //home_viewPagerAdapter.addFragments(new Test4(), getResources().getString(R.string.home_to_more));
        home_viewPager.setAdapter(home_viewPagerAdapter);
        home_viewPager.setCurrentItem(1, true);
        setUpTabs(home_viewPager);
        //  setupTabIcons();
        //    home_tabLayout.getTabAt(1).getIcon().setColorFilter(0xff284415, PorterDuff.Mode.SRC_IN);


    }


    @Override
    public void onBackPressed() {
        long tempTime = System.currentTimeMillis();
        long intervalTime = tempTime - backPressedTime;

        if (0 <= intervalTime && FINISH_INTERVAL_TIME >= intervalTime) {
            //         super.onBackPressed();
            moveTaskToBack(true);
            finish();
            android.os.Process.killProcess(android.os.Process.myPid());
        } else {
            backPressedTime = tempTime;
            Toast.makeText(getApplicationContext(), "'뒤로' 버튼을 한번 더 누르면 빠져나갑니다. ", Toast.LENGTH_SHORT).show();
        }
    }

    //2번 연속으로 누르면 종료
    private void setupTabIcons() {
        final TabLayout tabs = (TabLayout) findViewById(R.id.home_tab_layout);

    }


    private void setUpTabs(ViewPager viewPager) {

        final TabLayout tabs = (TabLayout) findViewById(R.id.home_tab_layout);
        if (tabs != null) {
            tabs.setupWithViewPager(viewPager);
            int tabCount = home_viewPagerAdapter.getCount();

            for (int i = 0; i < tabCount; i++) {
                TabLayout.Tab tab = tabs.getTabAt(i);

                if (tab != null) {
                    if (i == 0) {
                        ImageView myCustomIcon = (ImageView) LayoutInflater.from(tabs.getContext()).inflate(R.layout.icon1, null);
                        tab.setCustomView(myCustomIcon);
                        //   setupTabIcons();
                    } else if (i == 1) {
                        ImageView myCustomIcon = (ImageView) LayoutInflater.from(tabs.getContext()).inflate(R.layout.icon2, null);
                        tab.setCustomView(myCustomIcon);
                    } else {
                        ImageView myCustomIcon = (ImageView) LayoutInflater.from(tabs.getContext()).inflate(R.layout.icon3, null);
                        tab.setCustomView(myCustomIcon);
                    }
                }
            }

        }

        TabLayout.Tab tab = tabs.getTabAt(1);


    }

/*
    protected void pressedinfo() {
        ImageView iv = (ImageView) findViewById(R.id.tab0);
        iv.setImageResource(R.drawable.pinfo);

    }
*/
}