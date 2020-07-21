package com.elisvobs.skillar;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.widget.TabHost;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.elisvobs.skillar.adapter.SectionsPagerAdapter;
import com.elisvobs.skillar.fragment.GoalExeFragment;
import com.elisvobs.skillar.fragment.GoalNotesFragment;
import com.elisvobs.skillar.fragment.GoalTipsFragment;
import com.google.android.material.tabs.TabLayout;

public class GoalsActivity extends AppCompatActivity {

    TabHost host;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabbed);
        setTitle(R.string.goals);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setViewPager();
    }

    private void setViewPager() {
        //adapter for viewpager
        SectionsPagerAdapter adapter = new SectionsPagerAdapter(
                this, getSupportFragmentManager());
        //add fragments to adapter
        adapter.addFragment(new GoalNotesFragment());
        adapter.addFragment(new GoalTipsFragment());
        adapter.addFragment(new GoalExeFragment());
        //init viewpager
        ViewPager vp = findViewById(R.id.viewpager);
        //set adapter
        vp.setAdapter(adapter);
        //init tablayout
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(vp);
        tabLayout.setBackgroundColor(getResources().getColor(R.color.white));
        tabLayout.setTabTextColors(ColorStateList.valueOf(getResources().getColor(R.color.colorPrimary)));
        //pass the viewpager

        //set the tabs index & set text, icon 4 tabs
        tabLayout.getTabAt(0).setText("Notes");
        tabLayout.getTabAt(1).setText("Tips");
        tabLayout.getTabAt(2).setText("Exercises");
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, SkillsActivity.class));
        finish();
    }
}