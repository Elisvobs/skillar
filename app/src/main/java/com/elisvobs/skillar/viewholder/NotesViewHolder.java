package com.elisvobs.skillar.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.elisvobs.skillar.R;

public class NotesViewHolder extends RecyclerView.ViewHolder {
    public TextView title, note;

    public NotesViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.titleText);
        note = itemView.findViewById(R.id.noteText);
    }
}
