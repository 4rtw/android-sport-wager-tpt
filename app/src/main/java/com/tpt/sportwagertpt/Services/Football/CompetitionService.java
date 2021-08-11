package com.tpt.sportwagertpt.Services.Football;

import android.app.Activity;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.tpt.sportwagertpt.Interfaces.Football.Competition;
import com.tpt.sportwagertpt.Utils.ApiResponseUtils;
import com.tpt.sportwagertpt.Utils.Football.CompetitionOperations;
import com.tpt.sportwagertpt.Utils.Variables;
import com.tpt.sportwagertpt.Utils.VolleySingleton;

import org.json.JSONObject;

public class CompetitionService {
    private final Activity activity;
    private final CompetitionOperations competitionOperations = new CompetitionOperations();

    public CompetitionService(Activity activity){
        this.activity = activity;
    }

    public void getActiveCompetitions(final Competition callback){
        JsonObjectRequest activeCompetitionRequest = new JsonObjectRequest(
                Request.Method.GET,
                Variables.getFootballGetActiveCompetition(),
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        callback.handleCompetitionListResult(competitionOperations.jsonCompetitionListToObject(response));
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        ApiResponseUtils.printError(error);
                    }
                }
        );
        VolleySingleton.getInstance(this.activity).getRequestQueue().add(activeCompetitionRequest);
    }

    /* ??? On n'en aura peut etrepas besoin */
    public void getCompetitionsByArea(){}
}
