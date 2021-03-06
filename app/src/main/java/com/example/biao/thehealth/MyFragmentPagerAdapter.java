package com.example.biao.thehealth;

/**
 * Created by Biao on 2017/3/31.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.biao.thehealth.mould.MouldFragment;
import com.example.biao.thehealth.commun.CommunFragment;
import com.example.biao.thehealth.health.HealthFragment;
import com.example.biao.thehealth.talk.TalkFragment;
import com.example.biao.thehealth.user.UserFragment;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {


    private final int PAGER_COUNT = 5;

    private CommunFragment mMyCommunFragment = null;
    private HealthFragment mMyHealthFragment = null;
    private TalkFragment mMyTalkFragment = null;
    private MouldFragment mMyMouldFragment = null;
    private UserFragment mMyUserFragment = null;



    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
        mMyCommunFragment = new CommunFragment();
        mMyHealthFragment = new HealthFragment();
        mMyTalkFragment = new TalkFragment();
        mMyMouldFragment = new MouldFragment();
        mMyUserFragment = new UserFragment();
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case BottomNvgViewPageAct.PAGE_ONE:
                fragment = mMyCommunFragment;
                break;
            case BottomNvgViewPageAct.PAGE_TWO:
                fragment = mMyHealthFragment;
                break;
            case BottomNvgViewPageAct.PAGE_THREE:
                fragment = mMyTalkFragment;
                break;
            case BottomNvgViewPageAct.PAGE_FOUR:
                fragment = mMyMouldFragment;
                break;
            case BottomNvgViewPageAct.PAGE_FIVE:
                fragment = mMyUserFragment;
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return PAGER_COUNT;
    }
}