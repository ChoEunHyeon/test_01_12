package com.example.cho.test_12_02;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
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
        home_tabLayout.setupWithViewPager(home_viewPager);
        home_viewPager.setCurrentItem(1,true);
       setupTabIcons();
       home_tabLayout.getTabAt(1).getIcon().setColorFilter(0xff284415, PorterDuff.Mode.SRC_IN);

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


        home_tabLayout.getTabAt(0).setIcon(R.drawable.info);
        home_tabLayout.getTabAt(1).setIcon(R.drawable.book);
        home_tabLayout.getTabAt(2).setIcon(R.drawable.mh);
        for(int i=0;i<home_tabLayout.getChildCount();i++) {
            home_tabLayout.getChildAt(i).setPadding(10, 10, 10, 10);
        }


        home_tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.getIcon().clearColorFilter();
            }

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                 tab.getIcon().setColorFilter(0xff284415, PorterDuff.Mode.SRC_IN);

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }





}

