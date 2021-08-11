package com.tpt.sportwagertpt.Services.Football;

import android.app.Activity;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.tpt.sportwagertpt.Interfaces.Football.Football;
import com.tpt.sportwagertpt.Interfaces.Football.FootballList;
import com.tpt.sportwagertpt.Utils.ApiResponseUtils;
import com.tpt.sportwagertpt.Utils.Football.FootballOperations;
import com.tpt.sportwagertpt.Utils.Variables;
import com.tpt.sportwagertpt.Utils.VolleySingleton;

import org.json.JSONObject;

public class FootballService {
    private final Activity activity;
    private final FootballOperations footballOperations = new FootballOperations();

    public FootballService(Activity activity){
        this.activity = activity;
    }

    public void getAllMatches(int competitionID, final FootballList callback){
        JsonObjectRequest matchListRequest = new JsonObjectRequest(
                Request.Method.GET,
                Variables.getFootballGetSchedules(competitionID),
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        callback.handleMatchListResult(footballOperations.jsonMatchListToObject(response));
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        ApiResponseUtils.printError(error);
                    }
                }
        );
        VolleySingleton.getInstance(activity).getRequestQueue().add(matchListRequest);
    }

    public void getSpecificMatch(int competitionID, int matchID, final Football callback){
        JsonObjectRequest matchRequest = new JsonObjectRequest(
                Request.Method.GET,
                Variables.getFootballGetSpecificMatch(competitionID, matchID),
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        callback.handleMatchResult(footballOperations.jsonMatchToObject(response));
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        ApiResponseUtils.printError(error);
                    }
                }
        );
        VolleySingleton.getInstance(activity).getRequestQueue().add(matchRequest);
    }

    public void getMatchesByDate(int competitionID, String date, final FootballList callback){
        JsonObjectRequest matchListRequest = new JsonObjectRequest(
                Request.Method.GET,
                Variables.getFootballGetGamesByDates(competitionID, date),
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        callback.handleMatchListResult(footballOperations.jsonMatchListToObject(response));
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        ApiResponseUtils.printError(error);
                    }
                }
        );
        VolleySingleton.getInstance(activity).getRequestQueue().add(matchListRequest);
    }

    public void getMatchesFromDateToDate(int competitionID, String dateFrom, String dateTo, final FootballList callback){
        JsonObjectRequest matchListRequest = new JsonObjectRequest(
                Request.Method.GET,
                Variables.getFootballGetGamesByDatesFromToAnother(competitionID, dateFrom, dateTo),
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        callback.handleMatchListResult(footballOperations.jsonMatchListToObject(response));
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        ApiResponseUtils.printError(error);
                    }
                }
        );
        VolleySingleton.getInstance(activity).getRequestQueue().add(matchListRequest);
    }
}
