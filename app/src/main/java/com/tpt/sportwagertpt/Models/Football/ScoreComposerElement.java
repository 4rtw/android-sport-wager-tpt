package com.tpt.sportwagertpt.Models.Football;

public class ScoreComposerElement {

    public TeamDetails homeTeam;
    public TeamDetails awayTeam;

    public ScoreComposerElement() {
    }

    public Object getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(TeamDetails homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Object getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(TeamDetails awayTeam) {
        this.awayTeam = awayTeam;
    }
}
