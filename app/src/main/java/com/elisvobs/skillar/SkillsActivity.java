package com.elisvobs.skillar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.elisvobs.skillar.adapter.SkillsAdapter;
import com.elisvobs.skillar.model.Skill;
import com.elisvobs.skillar.util.DataManager;

import java.util.List;

public class SkillsActivity extends AppCompatActivity {
    private SkillsAdapter skillsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);
        setTitle(R.string.skillz);

        skills();
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
}
