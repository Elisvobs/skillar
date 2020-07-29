package com.elisvobs.skillar;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.elisvobs.skillar.adapter.SectionsPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class Problems extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabbed);
        setTitle(R.string.problem);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setViewPager();
    }

    private void setViewPager() {
        SectionsPagerAdapter adapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        adapter.addFragment(new Fragment());
        adapter.addFragment(new Fragment());
        adapter.addFragment(new Fragment());

        ViewPager vp = findViewById(R.id.viewpager);
        vp.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(vp);
        tabLayout.setBackgroundColor(getResources().getColor(R.color.white));
//        tabLayout.setTabTextColors();

        tabLayout.getTabAt(0).setText("Notes");
        tabLayout.getTabAt(1).setText("Activities");
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