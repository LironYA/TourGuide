package com.example.android.tourguide;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class PageFragment extends FragmentPagerAdapter {
    private final int PAGE_COUNT = 3;
    private String tabs[] = new String[]{"Sites", "Food", "About"};
    private Context context;

    public PageFragment(FragmentManager fragmentManager, Context context) {
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
            return new TelAvivSitesFragment();
        }
        if (position == 1) {
            return new TelAvivFoodFragment();
        } else {
            return new TelAvivAboutFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabs[position];
    }

}
