package com.elisvobs.skillar;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Skills extends AppCompatActivity {
    SkillsAdapter skillsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);
        setTitle(R.string.title_activity_skills);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        lifeSkills();
    }

    private void lifeSkills() {
        final List<Skill> skills = new ArrayList<>();
        skills.add(new Skill(R.string.goals));
        skills.add(new Skill(R.string.problem));
        skills.add(new Skill(R.string.creative));
        skills.add(new Skill(R.string.leadership));
        skills.add(new Skill(R.string.communications));
        skills.add(new Skill(R.string.assertiveness));
        skills.add(new Skill(R.string.conflict));
        skills.add(new Skill(R.string.team));
        skills.add(new Skill(R.string.stress));
        skills.add(new Skill(R.string.awareness));
        skills.add(new Skill(R.string.negotiation));
        skills.add(new Skill(R.string.time));
        skills.add(new Skill(R.string.decision));
        skills.add(new Skill(R.string.relationships));
        skills.add(new Skill(R.string.pressure));
        skills.add(new Skill(R.string.substance));

        final RecyclerView mRecyclerView = findViewById(R.id.skills_list);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        mRecyclerView.setLayoutManager(layoutManager);
        skillsAdapter = new SkillsAdapter(skills);
        mRecyclerView.setAdapter(skillsAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        skillsAdapter.notifyDataSetChanged();
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
}