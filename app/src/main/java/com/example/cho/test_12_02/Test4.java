package com.example.cho.test_12_02;

/**
 * Created by Samsung on 2016-12-08.
 */

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class Test4 extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout magazine_tabLayout;
    ViewPager magazine_viewPager;
    Magazine_ViewPagerAdapter magazine_viewPagerAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.magazine_basis);

        toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        magazine_tabLayout = (TabLayout) findViewById(R.id.magazine_tab_layout);
        magazine_viewPager = (ViewPager) findViewById(R.id.magazine_viewPager);
        magazine_viewPagerAdapter = new Magazine_ViewPagerAdapter(getSupportFragmentManager());
        magazine_viewPagerAdapter.addFragments(new News(), getResources().getString(R.string.mgz_tab_news));
        magazine_viewPagerAdapter.addFragments(new Student(), getResources().getString(R.string.mgz_tab_student));
        magazine_viewPagerAdapter.addFragments(new Instructor(), getResources().getString(R.string.mgz_tab_instructor));
        magazine_viewPagerAdapter.addFragments(new Group(), getResources().getString(R.string.mgz_tab_group));
        magazine_viewPagerAdapter.addFragments(new CMS(), getResources().getString(R.string.mgz_tab_CMS));
        magazine_viewPager.setAdapter(magazine_viewPagerAdapter);
        magazine_tabLayout.setupWithViewPager(magazine_viewPager);
        magazine_viewPager.setCurrentItem(0, true);
    }
}
