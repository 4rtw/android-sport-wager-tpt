package com.tpt.sportwagertpt.Services.Football;

import android.app.Activity;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.tpt.sportwagertpt.Interfaces.Football.Team;
import com.tpt.sportwagertpt.Interfaces.Football.TeamList;
import com.tpt.sportwagertpt.Utils.ApiResponseUtils;
import com.tpt.sportwagertpt.Utils.Football.TeamOperations;
import com.tpt.sportwagertpt.Utils.Variables;
import com.tpt.sportwagertpt.Utils.VolleySingleton;

import org.json.JSONObject;

public class TeamsService {
    private final Activity activity;
    private final TeamOperations teamOperations = new TeamOperations();

    public TeamsService(Activity activity) {
        this.activity = activity;
    }

    public void getAllTeams(int competitionID, final TeamList callback){
        JsonObjectRequest teamListRequest = new JsonObjectRequest(
                Request.Method.GET,
                Variables.getFootballGetTeams(competitionID),
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        callback.handleTeamListResult(teamOperations.jsonTeamListToObject(response));
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        ApiResponseUtils.printError(error);
                    }
                }
        );
        VolleySingleton.getInstance(activity).getRequestQueue().add(teamListRequest);
    }

    public void getTeamByID(int competitionID, int teamID, final Team callback){
        JsonObjectRequest teamRequest = new JsonObjectRequest(
                Request.Method.GET,
                Variables.getFootballGetTeamsByID(competitionID, teamID),
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        callback.handleTeamResult(teamOperations.jsonTeamToObject(response));
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        ApiResponseUtils.printError(error);
                    }
                }
        );
        VolleySingleton.getInstance(activity).getRequestQueue().add(teamRequest);
    }
}
