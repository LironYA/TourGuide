package com.example.android.tourguide;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class PageFragmentEilat extends FragmentPagerAdapter {
    private final int PAGE_COUNT = 3;
    private String tabs[] = new String[]{"Sites", "Food", "About"};
    private Context context;

    public PageFragmentEilat(FragmentManager fragmentManager, Context context) {
        super(fragmentManager);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new EilatSitesFragment();
        }
        if (position == 1) {
            return new EilatFoodFragment();
        } else {
            return new EilatAboutFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabs[position];
    }

}
