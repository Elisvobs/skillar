package com.elisvobs.skillar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.elisvobs.skillar.adapter.SkillsAdapter;
import com.elisvobs.skillar.model.Skill;
import com.elisvobs.skillar.util.DataManager;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class SkillsActivity extends AppCompatActivity {
    private SkillsAdapter skillsAdapter;
    private boolean isFabOpen = false;
    private Animation fab_open, fab_close, rotate_forward, rotate_backward;
    private FloatingActionButton fab, fab1, fab2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);
        setTitle(R.string.skillz);

        skills();

        fab = findViewById(R.id.fab);
        fab1 = findViewById(R.id.fab1);
        fab2 = findViewById(R.id.fab2);

        fab_open = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open);
        fab_close = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_close);
        rotate_forward = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_forward);
        rotate_backward = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_backward);
    }

    private void skills() {
        final RecyclerView mRecyclerView = findViewById(R.id.skills_list);
        final List<Skill> skills = DataManager.getInstance().getSkills();

        skillsAdapter = new SkillsAdapter(skills);
        mRecyclerView.setAdapter(skillsAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.fab:
                animateFab();
                break;
            case R.id.fab1:
//                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.fab2:
                break;
        }
    }

    private void animateFab() {
        if (isFabOpen) {
            fab.startAnimation(rotate_backward);
            fab1.startAnimation(fab_close);
            fab2.startAnimation(fab_close);

            fab1.setClickable(false);
            fab2.setClickable(false);

            isFabOpen = false;
        } else {
            fab.startAnimation(rotate_forward);
            fab1.startAnimation(fab_open);
            fab2.startAnimation(fab_open);

            fab1.setClickable(true);
            fab2.setClickable(true);

            isFabOpen = true;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        skillsAdapter.notifyDataSetChanged();
    }

}