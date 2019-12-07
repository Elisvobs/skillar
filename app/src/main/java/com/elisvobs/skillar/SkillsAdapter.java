package com.elisvobs.skillar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SkillsAdapter extends RecyclerView.Adapter<SkillsAdapter.SkillsViewHolder> {
    List<Skill> skills;

    public SkillsAdapter(List<Skill> skills) {
        this.skills = skills;
    }

    public static class SkillsViewHolder extends RecyclerView.ViewHolder {
        TextView skill;

        public SkillsViewHolder(@NonNull View itemView) {
            super(itemView);
            skill = itemView.findViewById(R.id.text_skill);
        }
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
    }

    @Override
    public int getItemCount() {
        return skills.size();
    }
}