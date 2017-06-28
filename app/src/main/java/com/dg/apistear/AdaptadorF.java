package com.dg.apistear;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by cvc23 on 27/06/2017.
 */

public class AdaptadorF extends FragmentPagerAdapter {

    ArrayList<Fragment> fragments;

    public AdaptadorF(FragmentManager fm) {
        super(fm);
    }

    public AdaptadorF(FragmentManager fm, ArrayList<Fragment> fragments){
        super(fm);
        this.fragments=fragments;
    }


    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "pagina "+(position+1);
    }
}