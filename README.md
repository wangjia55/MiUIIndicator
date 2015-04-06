# MiUIIndicator
这是一个仿照MIUI的页面指示器，配合ViewPager使用，视觉效果很不错。

#效果图：
![icon](https://github.com/wangjia55/MiUIIndicator/blob/master/screen_shot1.png)</br>
![icon](https://github.com/wangjia55/MiUIIndicator/blob/master/screen_shot1.png)

#使用方法也非常简单
        mPagerAdapter = new PagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mPagerAdapter);
        List<String> mListTabs = Arrays.asList("短信", "收藏", "推荐","好友","新闻","娱乐","财经","房产");
        mViewPagerIndicator = (ViewPagerIndicator) findViewById(R.id.viewpager_indicator);
        mViewPagerIndicator.setTabItems(mListTabs);
        mViewPagerIndicator.setViewPager(mViewPager,0);

