package yeom.example.cho.test_12_02;

/**
 * Created by Samsung on 2016-12-08.
 */

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import yeom.example.cho.test_12_02.a.CMS;


public class Test4 extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout magazine_tabLayout;
    TabLayout home_tabLayout;
    ViewPager magazine_viewPager;
    ViewPager home_viewPager;
    Magazine_ViewPagerAdapter magazine_viewPagerAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.magazine_basis);

        toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        magazine_tabLayout = (TabLayout) findViewById(R.id.magazine_tab_layout);
        //home_tabLayout = (TabLayout) findViewById(R.id.home_tab_layout);
        //home_viewPager = (ViewPager) findViewById(R.id.home_viewPager);

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
        //home_tabLayout.setupWithViewPager(home_viewPager);
    }
}
