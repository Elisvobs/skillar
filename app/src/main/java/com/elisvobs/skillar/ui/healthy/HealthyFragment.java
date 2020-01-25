package com.elisvobs.skillar.ui.healthy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.elisvobs.skillar.R;

public class HealthyFragment extends Fragment {

    private HealthyViewModel mHealthyViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mHealthyViewModel =
                ViewModelProviders.of(this).get(HealthyViewModel.class);
        View root = inflater.inflate(R.layout.fragment_healthy, container, false);

        return root;
    }
}