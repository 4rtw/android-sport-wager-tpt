package com.tpt.sportwagertpt.Utils;

public class Variables {
    private static final String url = "https://wager-tpt-2.herokuapp.com/api";
    private static final String autoUrl = "https://background-task-wager.herokuapp.com/api";
    private static final String backofficeSupportUrl = "https://backoffice-support-tpt.herokuapp.com/api";

    public static String getNbaGetSchedules() {
        return url + "/nba/schedules";
    }

    public static String getNbaGetGamesByDates(String date) {
        String nbaGetGamesByDates = url + "/nba/schedules/";
        return nbaGetGamesByDates + date;
    }

    public static String getNbaGetSpecificMatch(int matchID) {
        String nbaGetSpecificMatch = autoUrl + "/nba/specific_match/";
        return nbaGetSpecificMatch + matchID;
    }

    public static String getFootballGetSchedules(int competitionID) {
        String footballGetSchedules = url + "/foot/schedules/";
        return footballGetSchedules + competitionID;
    }

    public static String getFootballGetSpecificMatch(int competitionID, int matchID) {
        String footballGetSpecificMatch = autoUrl + "/foot/specific_match/";
        return footballGetSpecificMatch + competitionID + "/" + matchID;
    }

    public static String getFootballGetActiveCompetition() {
        return url + "/foot/active-competition";
    }

    public static String getFootballGetGamesByDates(int competitionID, String date) {
        String footballGetGamesByDates = url + "/foot/date/";
        return footballGetGamesByDates + competitionID + "/" + date;
    }

    public static String getFootballGetGamesByDatesFromToAnother(int competitionID, String date1, String date2) {
        String footballGetGamesByDatesFromToAnother = url + "/foot/date/";
        return footballGetGamesByDatesFromToAnother + competitionID + "/" + date1 + "/" + date2;
    }

    public static String getFootballGetTeams(int competitionID) {
        String footballGetTeams = url + "/foot/teams/competition/";
        return footballGetTeams + competitionID;
    }

    public static String getFootballGetTeamsByID(int competitionID, int teamID) {
        String footballGetTeamsByID = url + "/foot/teams/competition/";
        return footballGetTeamsByID + competitionID + "/" + teamID;
    }

    public static String getFootballGetStats(int competitionID) {
        String footballGetStats = url + "/foot/stats/competition/";
        return footballGetStats + "/" + competitionID;
    }

    public static String postLogin(){
        return url + "/authentications/login";
    }

    public static String postLogout(){
        return url + "/authentications/logout";
    }

    public static String getUser(long userID){
        return url + "/users/" + userID;
    }
}
