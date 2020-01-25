package com.elisvobs.skillar.ui.learn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.elisvobs.skillar.R;

public class LearnFragment extends Fragment {

    private LearnViewModel mLearnViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mLearnViewModel =
                ViewModelProviders.of(this).get(LearnViewModel.class);
        View root = inflater.inflate(R.layout.fragment_learn, container, false);

        return root;
    }
}