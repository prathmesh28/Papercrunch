package com.papercrunch.appit.Android.AndroidActivities;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.papercrunch.appit.Android.AndroidFregments.Andrtest1;
import com.papercrunch.appit.Android.AndroidFregments.Andrtest10;
import com.papercrunch.appit.Android.AndroidFregments.Andrtest11;
import com.papercrunch.appit.Android.AndroidFregments.Andrtest12;
import com.papercrunch.appit.Android.AndroidFregments.Andrtest13;
import com.papercrunch.appit.Android.AndroidFregments.Andrtest2;
import com.papercrunch.appit.Android.AndroidFregments.Andrtest3;
import com.papercrunch.appit.Android.AndroidFregments.Andrtest4;
import com.papercrunch.appit.Android.AndroidFregments.Andrtest5;
import com.papercrunch.appit.Android.AndroidFregments.Andrtest6;
import com.papercrunch.appit.Android.AndroidFregments.Andrtest7;
import com.papercrunch.appit.Android.AndroidFregments.Andrtest8;
import com.papercrunch.appit.Android.AndroidFregments.Andrtest9;
import com.papercrunch.appit.R;

import java.util.ArrayList;
import java.util.List;

public class Androidactivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Android");
        setContentView(R.layout.activity_andr);

        ViewPager viewPager = (ViewPager) findViewById(R.id.android_main_pager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new Andrtest1(), "Day 1");
        adapter.addFragment(new Andrtest2(), "Day 2");
        adapter.addFragment(new Andrtest3(), "Day 3");
        adapter.addFragment(new Andrtest4(), "Day 4");
        adapter.addFragment(new Andrtest5(), "Day 5");
        adapter.addFragment(new Andrtest6(), "Day 6");
        adapter.addFragment(new Andrtest7(), "Day 7");
        adapter.addFragment(new Andrtest8(), "Day 8");
        adapter.addFragment(new Andrtest9(), "Day 9");
        adapter.addFragment(new Andrtest10(), "Day 10");
        adapter.addFragment(new Andrtest11(), "Day 11");
        adapter.addFragment(new Andrtest12(), "Day 12");
        adapter.addFragment(new Andrtest13(), "Day 13");


        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.android_main_tabs);
        tabLayout.setupWithViewPager(viewPager);


    }



    // Adapter for the viewpager using FragmentPagerAdapter
    public static class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }



        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
