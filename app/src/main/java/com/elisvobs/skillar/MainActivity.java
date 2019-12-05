package com.elisvobs.skillar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.skills:
                startActivity(new Intent(this, Skills.class));
                break;
            case R.id.fin:
//                startActivity(new Intent(this, Financial.class));
                break;
            case R.id.positive:
//                startActivity(new Intent(this, Positive.class));
                break;
            case R.id.healthy:
//                startActivity(new Intent(this, Healthy.class));
                break;
            case R.id.learner:
//                startActivity(new Intent(this, Learner.class));
                break;
            case R.id.advisor:
//                startActivity(new Intent(this, Advisor.class));
                break;
            case R.id.wiser:
//                startActivity(new Intent(this, Wiser.class));
                break;
            case R.id.volunteer:
//                startActivity(new Intent(this, Volunteer.class));
                break;
            case R.id.groomed:
//                startActivity(new Intent(this, Groomed.class));
                break;
            case R.id.mentor:
//                startActivity(new Intent(this, Mentor.class));
                break;
            case R.id.trained:
//                startActivity(new Intent(this, Trained.class));
                break;
            case R.id.card:
//                startActivity(new Intent(this, Card.class));
                break;
        }
    }
}