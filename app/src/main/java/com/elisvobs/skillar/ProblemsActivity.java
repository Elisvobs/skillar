package com.elisvobs.skillar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class ProblemsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problems);
        setTitle(R.string.problem);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setViewPager();
    }

    private void setViewPager() {
        //adapter for viewpager
        SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager());
        //add fragments to adapter
        adapter.addFragment(new Fragment());
        adapter.addFragment(new Fragment());
        //init viewpager
        ViewPager vp = findViewById(R.id.viewpager);
        //set adapter
        vp.setAdapter(adapter);
        //init tablayout
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(vp);
        tabLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
//        tabLayout.setTabTextColors();
        //pass the viewpager

        //set the tabs index & set text, icon 4 tabs
        tabLayout.getTabAt(0).setText("Page One");
        tabLayout.getTabAt(1).setText("Page Two");
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    class SectionsPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();

        public SectionsPagerAdapter(FragmentManager fm){
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment) {
            mFragmentList.add(fragment);
        }
    }

}