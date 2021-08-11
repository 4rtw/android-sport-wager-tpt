package com.tpt.sportwagertpt.Services.Football;

import android.app.Activity;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.tpt.sportwagertpt.Interfaces.Football.Stats;
import com.tpt.sportwagertpt.Utils.ApiResponseUtils;
import com.tpt.sportwagertpt.Utils.Football.StatsOperations;
import com.tpt.sportwagertpt.Utils.Variables;
import com.tpt.sportwagertpt.Utils.VolleySingleton;

import org.json.JSONObject;

public class StatsService {

    private final Activity activity;
    private final StatsOperations statsOperations = new StatsOperations();

    public StatsService(Activity activity) {
        this.activity = activity;
    }

    public void getCompetitionStats(int competitionID, final Stats callback){
        JsonObjectRequest competitionStatsRequest = new JsonObjectRequest(
                Request.Method.GET,
                Variables.getFootballGetStats(competitionID),
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        callback.handleStatsListResult(statsOperations.jsonStatListToObject(response));
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        ApiResponseUtils.printError(error);
                    }
                }
        );
        VolleySingleton.getInstance(activity).getRequestQueue().add(competitionStatsRequest);
    }
}
