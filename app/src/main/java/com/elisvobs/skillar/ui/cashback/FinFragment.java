package com.elisvobs.skillar.ui.cashback;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.elisvobs.skillar.R;

public class FinFragment extends Fragment {

    private FinViewModel mFinViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mFinViewModel =
                ViewModelProviders.of(this).get(FinViewModel.class);
        View root = inflater.inflate(R.layout.fragment_cashback, container, false);
        return root;
    }
}