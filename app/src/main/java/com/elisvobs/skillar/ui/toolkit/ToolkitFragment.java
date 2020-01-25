package com.elisvobs.skillar.ui.toolkit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.elisvobs.skillar.R;

public class ToolkitFragment extends Fragment {

    private ToolkitViewModel mToolkitViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mToolkitViewModel =
                ViewModelProviders.of(this).get(ToolkitViewModel.class);
        View root = inflater.inflate(R.layout.fragment_toolkit, container, false);

        return root;
    }
}