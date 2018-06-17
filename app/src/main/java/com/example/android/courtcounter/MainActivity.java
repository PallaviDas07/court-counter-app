package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA =0;
    int scoreTeamB =0;

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
    public void add1forteamA(View v) {
        scoreTeamA = scoreTeamA+1;
        displayForTeamA(scoreTeamA);
    }

    public void add2forteamA(View v) {
        scoreTeamA = scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }
    public void add3forteamA(View v) {
        scoreTeamA = scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void add1forteamB(View v) {
        scoreTeamB = scoreTeamB+1;
        displayForTeamB(scoreTeamB);
    }

    public void add2forteamB(View v) {
        scoreTeamB = scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }
    public void add3forteamB(View v) {
        scoreTeamB = scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }
    public void reset(View v) {
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }
}
