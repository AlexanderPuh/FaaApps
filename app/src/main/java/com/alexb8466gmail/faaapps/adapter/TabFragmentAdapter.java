package com.alexb8466gmail.faaapps.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.alexb8466gmail.faaapps.R;
import com.alexb8466gmail.faaapps.fragment.AbstractTabFragment;
import com.alexb8466gmail.faaapps.fragment.BirthdayFragment;
import com.alexb8466gmail.faaapps.fragment.ExampleFragment;
import com.alexb8466gmail.faaapps.fragment.HistoryFragment;
import com.alexb8466gmail.faaapps.fragment.IdeasFragment;
import com.alexb8466gmail.faaapps.fragment.ToDoFragment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 17.01.2017.
 */

public class TabFragmentAdapter extends FragmentPagerAdapter

{


    private Map<Integer, AbstractTabFragment> tabs;
    private Context context;

    public TabFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);

this.context=context;
        initTabsMap(context);

    }



    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }



    @Override
    public Fragment getItem(int position) {

        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }
    private void initTabsMap(Context context) {
        tabs=new HashMap<>();
        tabs.put(0, HistoryFragment.getInstance(context));
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, ToDoFragment.getInstance(context));
        tabs.put(3, BirthdayFragment.getInstance(context));
    }
}
