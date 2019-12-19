package com.elisvobs.skillar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ProblemsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problems);
        setTitle(R.string.problem);
    }
}