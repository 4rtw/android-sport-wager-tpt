package com.tpt.sportwagertpt.Models.Football;

import java.util.Date;

public class Match {
    public int id;
    public Season season;
    public Date utcDate;
    public String status;
    public String stage;
    public Score score;
    public Odds odds;
    public TeamDetails homeTeam;
    public TeamDetails awayTeam;
    public Date lastUpdated;

    public Match() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Date getUtcDate() {
        return utcDate;
    }

    public void setUtcDate(Date utcDate) {
        this.utcDate = utcDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public Odds getOdds() {
        return odds;
    }

    public void setOdds(Odds odds) {
        this.odds = odds;
    }

    public TeamDetails getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(TeamDetails homeTeam) {
        this.homeTeam = homeTeam;
    }

    public TeamDetails getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(TeamDetails awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
