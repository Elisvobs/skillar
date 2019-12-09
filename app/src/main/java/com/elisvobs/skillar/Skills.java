package com.elisvobs.skillar;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Skills extends AppCompatActivity {
    private List<Skill> skills;
    SkillsAdapter skillsAdapter;
    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Life Skills");

        mRecyclerView = findViewById(R.id.skills_list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(skillsAdapter);

        initSkills();
    }

    private void initSkills() {
        skills = new ArrayList<>();
        skills.add(new Skill("Goal Setting"));
        skills.add(new Skill("Problem Solving"));
        skills.add(new Skill("Creative Thinking"));
        skills.add(new Skill("Negotiation"));
        skills.add(new Skill("Interpersonal Communication"));
        skills.add(new Skill("Self Awareness"));
        skills.add(new Skill("Stress Management"));
        skills.add(new Skill("Conflict Management"));
        skills.add(new Skill("Self Awareness"));
        skills.add(new Skill("Self Awareness"));
        skills.add(new Skill("Self Awareness"));
        skills.add(new Skill("Self Awareness"));
        skills.add(new Skill("Self Awareness"));
        skills.add(new Skill("Self Awareness"));
        skills.add(new Skill("Self Awareness"));
        skills.add(new Skill("Self Awareness"));
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