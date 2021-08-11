package com.tpt.sportwagertpt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.tpt.sportwagertpt.Interfaces.Nba.NbaMatchList;
import com.tpt.sportwagertpt.Models.NBA.Match;
import com.tpt.sportwagertpt.Services.NBA.NbaService;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    NbaService nbaService;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_SportWagerTPTNoActionBar);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        this.nbaService = new NbaService(this);
        this.textView = (TextView) findViewById(R.id.helloWorld);
        testService();
    }

    private void testService(){
        this.nbaService.getMatches(new NbaMatchList() {
            @Override
            public void handleMatchListResult(List<Match> matchList) {
                textView.setText(matchList.toString());
            }
        });
    }
}