package com.jacob.mi.indicator;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import java.util.List;

/**
 * Created by jacob-wj on 2015/4/5.
 */
public class ViewPagerIndicator extends LinearLayout implements ViewPager.OnPageChangeListener {
    private ViewPager mViewPager;
    private List<String> mListTabs;

    public ViewPagerIndicator(Context context) {
        super(context);
    }

    public ViewPagerIndicator(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewPagerIndicator(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }



    public void setViewPager(ViewPager viewPager){
        this.mViewPager = viewPager;
    }

    @Override
    public void onPageScrolled(int i, float v, int i2) {

    }

    @Override
    public void onPageSelected(int i) {

    }

    @Override
    public void onPageScrollStateChanged(int i) {

    }

    public void setTabItems(List<String> listTabs) {
        mListTabs = listTabs;
    }
}
