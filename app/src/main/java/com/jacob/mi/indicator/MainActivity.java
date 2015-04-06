package com.jacob.mi.indicator;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends FragmentActivity{

    private ViewPager mViewPager;
    private PagerAdapter mPagerAdapter;
    private ViewPagerIndicator mViewPagerIndicator;
//    private List<String> mListTabs = Arrays.asList("短信", "收藏", "推荐","好友");
    private List<String> mListTabs = Arrays.asList("短信", "收藏", "推荐","好友","新闻","娱乐","财经","房产");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        mPagerAdapter = new PagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mPagerAdapter);


        mViewPagerIndicator = (ViewPagerIndicator) findViewById(R.id.viewpager_indicator);
        mViewPagerIndicator.setTabItems(mListTabs);
        mViewPagerIndicator.setViewPager(mViewPager,0);
        mViewPagerIndicator.setOnPageChangeListener(new ViewPagerIndicator.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i2) {

            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }


    private class PagerAdapter extends FragmentPagerAdapter{

        public PagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            return PagerFragment.newInstance(mListTabs.get(i));
        }

        @Override
        public int getCount() {
            return mListTabs.size();
        }
    }
}
