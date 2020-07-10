package com.elisvobs.skillar.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.elisvobs.skillar.R;
import com.elisvobs.skillar.model.Note;
import com.elisvobs.skillar.viewholder.NotesViewHolder;

import java.util.List;

public class GoalNotesAdapter extends RecyclerView.Adapter<NotesViewHolder> {
    private List<Note> notes;


    public GoalNotesAdapter(List<Note> notes) {
        this.notes = notes;
    }

    @NonNull
    @Override
    public NotesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_fragment, parent,false);
        return new NotesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotesViewHolder holder, int position) {
        holder.title.setText(notes.get(position).title);
        holder.note.setText(notes.get(position).note);
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }
}
