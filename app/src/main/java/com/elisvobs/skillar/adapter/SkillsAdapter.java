package com.elisvobs.skillar.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.elisvobs.skillar.R;
import com.elisvobs.skillar.model.Skill;
import com.elisvobs.skillar.viewholder.SkillsViewHolder;

import java.util.List;

public class SkillsAdapter extends RecyclerView.Adapter<SkillsViewHolder>  {
    private List<Skill> skills;

    public SkillsAdapter(List<Skill> skills) {
        this.skills = skills;
    }

    @NonNull
    @Override
    public SkillsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.skill_list, parent, false);
        return new SkillsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SkillsViewHolder holder, int position) {
        holder.skill.setText(skills.get(position).skill);
        holder.image.setImageResource(skills.get(position).image);
    }

    @Override
    public int getItemCount() {
        return skills.size();
    }
}