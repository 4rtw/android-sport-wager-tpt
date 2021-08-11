package com.tpt.sportwagertpt.Models.NBA;

import java.util.Date;

public class Match {
    public int gameID;
    public String awayTeam;
    public int awayTeamID;
    public double awayTeamMoneyLine;
    public int awayTeamScore;
    public Date dateTime;
    public Date day;
    public String homeTeam;
    public int homeTeamID;
    public double homeTeamMoneyLine;
    public int homeTeamScore;
    public boolean isBettingClosed;
    public Date lastUpdate;
    public int pointSpreadAwayTeamMoneyLine;
    public int pointSpreadHomeTeamMoneyLine;
    public int season;
    public int seasonType;
    public int stadiumID;
    public String status;

    public Match() {
    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int getAwayTeamID() {
        return awayTeamID;
    }

    public void setAwayTeamID(int awayTeamID) {
        this.awayTeamID = awayTeamID;
    }

    public double getAwayTeamMoneyLine() {
        return awayTeamMoneyLine;
    }

    public void setAwayTeamMoneyLine(double awayTeamMoneyLine) {
        this.awayTeamMoneyLine = awayTeamMoneyLine;
    }

    public int getAwayTeamScore() {
        return awayTeamScore;
    }

    public void setAwayTeamScore(int awayTeamScore) {
        this.awayTeamScore = awayTeamScore;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public int getHomeTeamID() {
        return homeTeamID;
    }

    public void setHomeTeamID(int homeTeamID) {
        this.homeTeamID = homeTeamID;
    }

    public double getHomeTeamMoneyLine() {
        return homeTeamMoneyLine;
    }

    public void setHomeTeamMoneyLine(double homeTeamMoneyLine) {
        this.homeTeamMoneyLine = homeTeamMoneyLine;
    }

    public int getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(int homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    public boolean isBettingClosed() {
        return isBettingClosed;
    }

    public void setBettingClosed(boolean bettingClosed) {
        isBettingClosed = bettingClosed;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public int getPointSpreadAwayTeamMoneyLine() {
        return pointSpreadAwayTeamMoneyLine;
    }

    public void setPointSpreadAwayTeamMoneyLine(int pointSpreadAwayTeamMoneyLine) {
        this.pointSpreadAwayTeamMoneyLine = pointSpreadAwayTeamMoneyLine;
    }

    public int getPointSpreadHomeTeamMoneyLine() {
        return pointSpreadHomeTeamMoneyLine;
    }

    public void setPointSpreadHomeTeamMoneyLine(int pointSpreadHomeTeamMoneyLine) {
        this.pointSpreadHomeTeamMoneyLine = pointSpreadHomeTeamMoneyLine;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getSeasonType() {
        return seasonType;
    }

    public void setSeasonType(int seasonType) {
        this.seasonType = seasonType;
    }

    public int getStadiumID() {
        return stadiumID;
    }

    public void setStadiumID(int stadiumID) {
        this.stadiumID = stadiumID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
