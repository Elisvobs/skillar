package com.elisvobs.skillar;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SkillsAdapter extends RecyclerView.Adapter<SkillsAdapter.SkillsViewHolder>  {
    List<Skill> skills;

    public SkillsAdapter(List<Skill> skills) {
        this.skills = skills;
    }

    public static class SkillsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView skill;

        public SkillsViewHolder(@NonNull View itemView) {
            super(itemView);
            skill = itemView.findViewById(R.id.text_skill);
        }

       @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            switch (getAdapterPosition()) {
                case 0:
//                   intent = new Intent(view.getContext(), GoalsActivity.class);
                    break;
                case 1:
//                    intent = new Intent(view.getContext(), ProblemSolverActivity.class);
                    break;
            }

            view.getContext().startActivity(intent);
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