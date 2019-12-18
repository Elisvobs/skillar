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
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Life Skills");

        initSkills();
    }

    private void initSkills() {
        List<Skill> skills = new ArrayList<>();
        skills.add(new Skill("Goal Setting"));
        skills.add(new Skill("Problem Solving"));
        skills.add(new Skill("Creative Thinking"));
        skills.add(new Skill("Leadership"));
        skills.add(new Skill("Interpersonal Communication"));
        skills.add(new Skill("Assertiveness"));
        skills.add(new Skill("Conflict Management"));
        skills.add(new Skill("Teamwork"));
        skills.add(new Skill("Stress Management"));
        skills.add(new Skill("Self Awareness"));
        skills.add(new Skill("Negotiation"));
        skills.add(new Skill("Time Management"));
        skills.add(new Skill("Decision Making"));
        skills.add(new Skill("Managing Relationships"));
        skills.add(new Skill("Peer Pressure"));
        skills.add(new Skill("Substance Abuse"));

        final RecyclerView mRecyclerView = findViewById(R.id.skills_list);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        mRecyclerView.setLayoutManager(layoutManager);
        skillsAdapter = new SkillsAdapter(skills);
        mRecyclerView.setAdapter(skillsAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
//        skillsAdapter.notifyDataSetChanged();
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