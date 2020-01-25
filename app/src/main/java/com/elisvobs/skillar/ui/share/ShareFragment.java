package com.elisvobs.skillar.ui.share;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.elisvobs.skillar.R;

public class ShareFragment extends Fragment {
    private static final String SHARE_DESCRIPTION = "Download the skillar app to get equipped to live a fulfilling life on ";
    private static final String skillarUrl = "https://play.google.com/store/apps/details?id=";
    private ShareViewModel shareViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        shareViewModel =
                ViewModelProviders.of(this).get(ShareViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        Context context = root.getContext();
        Intent shareIntent = new Intent();
        String shareText = SHARE_DESCRIPTION + skillarUrl;
        shareIntent.setAction(Intent.ACTION_SEND).setType("text/plain")
                .putExtra(Intent.EXTRA_SUBJECT, "Skillar")
                .putExtra(Intent.EXTRA_TEXT, shareText);
        context.startActivity(shareIntent);
        return root;
    }

}