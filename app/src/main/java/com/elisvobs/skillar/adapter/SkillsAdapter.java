package com.elisvobs.skillar.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.elisvobs.skillar.GoalsActivity;
import com.elisvobs.skillar.ProblemsActivity;
import com.elisvobs.skillar.R;
import com.elisvobs.skillar.model.Skill;

import java.util.List;

public class SkillsAdapter extends RecyclerView.Adapter<SkillsAdapter.SkillsViewHolder>  {
    private List<Skill> skills;

    public SkillsAdapter(List<Skill> skills) {
        this.skills = skills;
    }

    public static class SkillsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView skill;
        ImageView image;
        private final Context context;

         SkillsViewHolder(@NonNull View itemView) {
            super(itemView);
            skill = itemView.findViewById(R.id.text_skill);
            image = itemView.findViewById(R.id.skill_image);
            context = itemView.getContext();
            itemView.setClickable(true);
            itemView.setOnClickListener(this);
        }

       @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            switch (getAdapterPosition()) {
                case 0:
                   intent = new Intent(context, GoalsActivity.class);
                    break;
                case 1:
                    intent = new Intent(context, ProblemsActivity.class);
                    break;
                case 2:
//                    intent = new Intent(context, Creative.class);
                    break;
                case 3:
//                    intent = new Intent(context, Leaders.class);
                    break;
                case 4:
//                    intent = new Intent(context, Comms.class);
                    break;
                case 5:
//                    intent = new Intent(context, Asserts.class);
                    break;
                case 6:
//                    intent = new Intent(context, Conflicts.class);
                    break;
                case 7:
//                    intent = new Intent(context, Teams.class);
                    break;
                case 8:
//                    intent = new Intent(context, Stresses.class);
                    break;
                case 9:
//                    intent = new Intent(context, Awareness.class);
                    break;
                case 10:
//                    intent = new Intent(context, Negotiation.class);
                    break;
                case 11:
//                    intent = new Intent(context, TimeMgmt.class);
                    break;
                case 12:
//                    intent = new Intent(context, Decisions.class);
                    break;
                case 13:
//                    intent = new Intent(context, Relations.class);
                    break;
                case 14:
//                    intent = new Intent(context, Pressures.class);
                    break;
                case 15:
//                    intent = new Intent(context, Substances.class);
                    break;

            }

           context.startActivity(intent);
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