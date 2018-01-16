package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public int scoreTeamA = 0;
    public int scoreTeamB = 0;

    public void teamAPoint3(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void teamAPoint2(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void teamAPoint1(View view) {
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }

    public void teamBPoint3(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void teamBPoint2(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void teamBPoint1(View view) {
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View view) {
        scoreTeamA=0;
        displayForTeamA(scoreTeamA);
        scoreTeamB=0;
        displayForTeamB(scoreTeamB);
    }
}
