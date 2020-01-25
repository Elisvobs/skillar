package com.elisvobs.skillar.ui.positive;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.elisvobs.skillar.R;

public class PositiveFragment extends Fragment {

    private PositiveViewModel mPositiveViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mPositiveViewModel =
                ViewModelProviders.of(this).get(PositiveViewModel.class);
        View root = inflater.inflate(R.layout.fragment_positive, container, false);

        return root;
    }
}