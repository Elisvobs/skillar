package com.elisvobs.skillar.ui.home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.elisvobs.skillar.R;
import com.elisvobs.skillar.adapter.SkillsAdapter;
import com.elisvobs.skillar.model.Skill;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private HomeViewModel homeViewModel;
    private SkillsAdapter skillsAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = new ViewModelProvider(this)
                .get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home,
                container, false);
        Context context = root.getContext();

        lifeSkills(root, context);

        return root;
    }

    private void lifeSkills(View root, Context context) {
        final RecyclerView mRecyclerView = root.findViewById(R.id.skills_list);
        final List<Skill> skills = new ArrayList<>();

        skills.add(new Skill(R.string.goals, R.drawable.ic_menu_send));
        skills.add(new Skill(R.string.problem, R.drawable.ic_menu_send));
        skills.add(new Skill(R.string.creative, R.drawable.ic_menu_send));
        skills.add(new Skill(R.string.leadership, R.drawable.ic_menu_send));
        skills.add(new Skill(R.string.communications, R.drawable.ic_menu_send));
        skills.add(new Skill(R.string.assertiveness, R.drawable.ic_menu_send));
        skills.add(new Skill(R.string.conflict, R.drawable.ic_menu_send));
        skills.add(new Skill(R.string.team, R.drawable.ic_menu_send));
        skills.add(new Skill(R.string.stress, R.drawable.ic_menu_send));
        skills.add(new Skill(R.string.awareness, R.drawable.ic_menu_send));
        skills.add(new Skill(R.string.negotiation, R.drawable.ic_menu_send));
        skills.add(new Skill(R.string.time, R.drawable.ic_menu_send));
        skills.add(new Skill(R.string.decision, R.drawable.ic_menu_send));
        skills.add(new Skill(R.string.relationships, R.drawable.ic_menu_send));
        skills.add(new Skill(R.string.pressure, R.drawable.ic_menu_send));
        skills.add(new Skill(R.string.substance, R.drawable.ic_menu_send));
//        skills.add(new Skill(R.string.critical, R.drawable.ic_menu_send));

        skillsAdapter = new SkillsAdapter(skills);
        mRecyclerView.setAdapter(skillsAdapter);
    }

    @Override
    public void onResume() {
        super.onResume();
        skillsAdapter.notifyDataSetChanged();
    }

}