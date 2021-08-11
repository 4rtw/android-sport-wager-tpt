package com.tpt.sportwagertpt.Models.Football;

public class Score {
    public String winner;
    public ScoreComposerElement fulltime;
    public ScoreComposerElement extraTime;
    public ScoreComposerElement penalties;

    public Score() {
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public ScoreComposerElement getFulltime() {
        return fulltime;
    }

    public void setFulltime(ScoreComposerElement fulltime) {
        this.fulltime = fulltime;
    }

    public ScoreComposerElement getExtraTime() {
        return extraTime;
    }

    public void setExtraTime(ScoreComposerElement extraTime) {
        this.extraTime = extraTime;
    }

    public ScoreComposerElement getPenalties() {
        return penalties;
    }

    public void setPenalties(ScoreComposerElement penalties) {
        this.penalties = penalties;
    }
}
