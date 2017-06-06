package com.example.android.tourguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // The content of the activity is from activity_main.xml
        setContentView(R.layout.activity_main);

        // Finds the view pager (viewpagerxml) that allows the user to swipe between different fragments
        // + names it 'viewPager'
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpagerxml);

        // Creates the adapter SimpleFragmentPagerAdapter, which tells which fragment & which title
        // is shown on each page + names it 'adapter'
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(this, getSupportFragmentManager());

        // Hooks the 'adapter' onto the 'viewPager'
        viewPager.setAdapter(adapter);

        // Finds the Tab Layout (tablayoutxml)
        // + names it 'tabLayout'
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayoutxml);

        // Hooks the 'viewPager' onto the 'tabLayout' -> Getting the titles to tabs from 'adapter/viewPager'
        tabLayout.setupWithViewPager(viewPager);
    }
}
