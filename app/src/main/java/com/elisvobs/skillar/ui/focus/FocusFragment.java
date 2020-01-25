package com.elisvobs.skillar.ui.focus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.elisvobs.skillar.R;

public class FocusFragment extends Fragment {

    private FocusViewModel mFocusViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mFocusViewModel =
                ViewModelProviders.of(this).get(FocusViewModel.class);
        View root = inflater.inflate(R.layout.fragment_focus, container, false);

        return root;
    }
}