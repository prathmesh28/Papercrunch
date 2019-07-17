package com.papercrunch.appit.IOS.IosActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.papercrunch.appit.Android.AndroidActivities.Androidactivity;
import com.papercrunch.appit.Android.AndroidFregments.Andrtest1;
import com.papercrunch.appit.Android.AndroidFregments.Andrtest2;
import com.papercrunch.appit.Android.AndroidFregments.Andrtest3;
import com.papercrunch.appit.Android.AndroidFregments.Andrtest4;
import com.papercrunch.appit.Android.AndroidFregments.Andrtest5;
import com.papercrunch.appit.Android.AndroidFregments.Andrtest6;
import com.papercrunch.appit.Android.AndroidFregments.Andrtest7;
import com.papercrunch.appit.Android.AndroidFregments.Andrtest8;
import com.papercrunch.appit.IOS.IosFregments.Iostest1;
import com.papercrunch.appit.IOS.IosFregments.Iostest10;
import com.papercrunch.appit.IOS.IosFregments.Iostest11;
import com.papercrunch.appit.IOS.IosFregments.Iostest12;
import com.papercrunch.appit.IOS.IosFregments.Iostest2;
import com.papercrunch.appit.IOS.IosFregments.Iostest3;
import com.papercrunch.appit.IOS.IosFregments.Iostest4;
import com.papercrunch.appit.IOS.IosFregments.Iostest5;
import com.papercrunch.appit.IOS.IosFregments.Iostest6;
import com.papercrunch.appit.IOS.IosFregments.Iostest7;
import com.papercrunch.appit.IOS.IosFregments.Iostest8;
import com.papercrunch.appit.IOS.IosFregments.Iostest9;
import com.papercrunch.appit.R;

import java.util.ArrayList;
import java.util.List;

public class Iosactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("IOS");
        setContentView(R.layout.activity_iosactivity);

        ViewPager viewPager = (ViewPager) findViewById(R.id.ios_main_pager);
        Iosactivity.ViewPagerAdapter adapter = new Iosactivity.ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new Iostest1(), "Day 1");
        adapter.addFragment(new Iostest2(), "Day 2");
        adapter.addFragment(new Iostest3(), "Day 3");
        adapter.addFragment(new Iostest4(), "Day 4");
        adapter.addFragment(new Iostest5(), "Day 5");
        adapter.addFragment(new Iostest6(), "Day 6");
        adapter.addFragment(new Iostest7(), "Day 7");
        adapter.addFragment(new Iostest8(), "Day 8");
        adapter.addFragment(new Iostest9(), "Day 9");
        adapter.addFragment(new Iostest10(), "Day 10");
        adapter.addFragment(new Iostest11(), "Day 11");
        adapter.addFragment(new Iostest12(), "Day 12");


        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.ios_main_tabs);
        tabLayout.setupWithViewPager(viewPager);


    }


    // Adapter for the viewpager using FragmentPagerAdapter
    class ViewPagerAdapter extends FragmentPagerAdapter {
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
