package com.zspt.app.modulelogin.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by yuequan on 2017/10/16.
 */

public class PagerAdapter extends FragmentPagerAdapter {
    private List<Fragment>mFragments;

    public PagerAdapter(FragmentManager fm, List<Fragment>fragments) {
        super(fm);
        this.mFragments=fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}
