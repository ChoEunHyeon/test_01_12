package com.example.cho.test_12_02;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Samsung on 2016-12-09.
 */

public class Magazine_ViewPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> magazine_fragments = new ArrayList<>();
    ArrayList<String> magazine_tabTitles = new ArrayList<>();

    public void addFragments(Fragment fragments, String titles){
        this.magazine_fragments.add(fragments);
        this.magazine_tabTitles.add(titles);
    }

    public Magazine_ViewPagerAdapter(FragmentManager magazine_fragment_manager)
    {
        super(magazine_fragment_manager);
    }

    @Override
    public Fragment getItem(int position) { return magazine_fragments.get(position); }

    @Override
    public int getCount() {
        return magazine_fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return magazine_tabTitles.get(position);
    }

}
