package com.example.lenovo.page;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyPageAdapter extends FragmentPagerAdapter {
    public MyPageAdapter(FragmentManager manager){
        super(manager);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new FirstFragment();
        }else if (position==1){
            return new SecondFragment();
        }else {
            return new ThridFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Title" + position;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
