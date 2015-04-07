# MiUIIndicator
这是一个仿照MIUI的页面指示器，配合ViewPager使用，视觉效果很不错。

#Author
 Wangjia55(wangjia5509@gmail.com）
### Blog:
  http://blog.csdn.net/wangjia55

#效果图：
![icon](https://github.com/wangjia55/MiUIIndicator/blob/master/screen_shot1.png)
![icon](https://github.com/wangjia55/MiUIIndicator/blob/master/screen_shot2.png)

#使用方法也非常简单
        mPagerAdapter = new PagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mPagerAdapter);
        List<String> mListTabs = Arrays.asList("短信", "收藏", "推荐","好友","新闻","娱乐","财经","房产");
        mViewPagerIndicator = (ViewPagerIndicator) findViewById(R.id.viewpager_indicator);
        mViewPagerIndicator.setTabItems(mListTabs);
        mViewPagerIndicator.setViewPager(mViewPager,0);
        
#LICENSE
  Copyright (c) 2015 WangJia55 <wangjia5509@gmail.com>
  Permission is hereby granted, free of charge, to any person obtaining a copy
  of this software and associated documentation files (the "Software"), to deal
  in the Software without restriction, including without limitation the rights
  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
  copies of the Software, and to permit persons to whom the Software is
  furnished to do so, subject to the following conditions:
  The above copyright notice and this permission notice shall be included in
  all copies or substantial portions of the Software.

