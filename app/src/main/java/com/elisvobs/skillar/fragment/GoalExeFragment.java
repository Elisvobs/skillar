package com.elisvobs.skillar.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.elisvobs.skillar.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GoalExeFragment extends Fragment {

    public GoalExeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_goal_exe, container, false);
        return root;
    }
}
