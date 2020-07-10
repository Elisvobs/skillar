package com.elisvobs.skillar.viewholder;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.elisvobs.skillar.GoalsActivity;
import com.elisvobs.skillar.ProblemsActivity;
import com.elisvobs.skillar.R;

public class SkillsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView skill;
    public ImageView image;
    private final Context context;

    public SkillsViewHolder(@NonNull View itemView) {
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
//                    intent = new Intent(context, Comm.class);
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
//                    intent = new Intent(context, Stress.class);
                break;
            case 9:
//                    intent = new Intent(context, Awareness.class);
                break;
            case 10:
//                    intent = new Intent(context, Negotiation.class);
                break;
            case 11:
//                    intent = new Intent(context, Time.class);
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
            case 16:
//                    intent = new Intent(context, Critical.class);
                break;
        }
        context.startActivity(intent);
    }
}