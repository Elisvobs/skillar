package com.elisvobs.skillar.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.elisvobs.skillar.R;
import com.elisvobs.skillar.adapter.GoalNotesAdapter;
import com.elisvobs.skillar.model.Note;
import com.elisvobs.skillar.util.DataManager;

import java.util.List;

public class GoalNotesFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_goal_notes, container, false);
        final RecyclerView recyclerView = root.findViewById(R.id.notesRecycler);
        final List<Note> notes = DataManager.getInstance().getNotes();
        final GoalNotesAdapter notesAdapter = new GoalNotesAdapter(notes);
        recyclerView.setAdapter(notesAdapter);
        return root;
    }
}
