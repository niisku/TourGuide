package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Niina on 29.5.2017.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;

    }

    //Number of fragments (4)
    @Override
    public int getCount() {
        return 4;
    }

    //Checks in which fragment the user is (based on the position) +
    //shows that position's fragment
    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new MoveFragment();
        } else if (position == 1) {
            return new SeeFragment();
        } else if (position == 2) {
            return new EatFragment();
        } else {
            return new PlayFragment();
        }
    }


    //Checks the position + return that fragment's title
    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0) {
            return mContext.getString(R.string.move_title);
        }
        if (position == 1) {
            return mContext.getString(R.string.see_title);
        }
        if (position == 2) {
            return mContext.getString(R.string.eat_title);
        } else {
            return mContext.getString(R.string.play_title);
        }
    }
}
