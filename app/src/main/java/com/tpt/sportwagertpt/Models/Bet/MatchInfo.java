package com.tpt.sportwagertpt.Models.Bet;

public class MatchInfo {

    public int competition;
    public int match_id;
    public String away_team;
    public String home_team;

    public MatchInfo() {
    }

    public int getCompetition() {
        return competition;
    }

    public void setCompetition(int competition) {
        this.competition = competition;
    }

    public int getMatch_id() {
        return match_id;
    }

    public void setMatch_id(int match_id) {
        this.match_id = match_id;
    }

    public String getAway_team() {
        return away_team;
    }

    public void setAway_team(String away_team) {
        this.away_team = away_team;
    }

    public String getHome_team() {
        return home_team;
    }

    public void setHome_team(String home_team) {
        this.home_team = home_team;
    }
}
