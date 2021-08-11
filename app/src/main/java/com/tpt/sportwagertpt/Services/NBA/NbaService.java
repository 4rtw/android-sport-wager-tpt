package com.tpt.sportwagertpt.Services.NBA;

import android.app.Activity;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.tpt.sportwagertpt.Interfaces.Nba.NbaMatch;
import com.tpt.sportwagertpt.Interfaces.Nba.NbaMatchList;
import com.tpt.sportwagertpt.Utils.ApiResponseUtils;
import com.tpt.sportwagertpt.Utils.Nba.NbaOperations;
import com.tpt.sportwagertpt.Utils.Variables;
import com.tpt.sportwagertpt.Utils.VolleySingleton;

import org.json.JSONObject;


public class NbaService {

    private final Activity activity;
    private final NbaOperations operations = new NbaOperations();

    public NbaService(Activity activity){
        this.activity = activity;
    }

    public void getMatches(final NbaMatchList callback){
        JsonObjectRequest matchesListRequest = new JsonObjectRequest(
                Request.Method.GET,
                Variables.getNbaGetSchedules(),
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        callback.handleMatchListResult(operations.jsonMatchListToObject(response));
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        ApiResponseUtils.printError(error);
                    }
                }
        );
        VolleySingleton.getInstance(activity).getRequestQueue().add(matchesListRequest);
    }

    public void getMatchesByDate(String date ,final NbaMatchList callback){
        JsonObjectRequest matchesListRequest = new JsonObjectRequest(
                Request.Method.GET,
                Variables.getNbaGetGamesByDates(date),
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        callback.handleMatchListResult(operations.jsonMatchListToObject(response));
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        ApiResponseUtils.printError(error);
                    }
                }
        );
        VolleySingleton.getInstance(activity).getRequestQueue().add(matchesListRequest);
    }

    public void getSpecificMatch(int gameID, final NbaMatch callback){
        JsonObjectRequest matchRequest = new JsonObjectRequest(
                Request.Method.GET,
                Variables.getNbaGetSpecificMatch(gameID),
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        callback.handleMatchResult(operations.jsonMatchToObject(response));
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        ApiResponseUtils.printError(error);
                    }
                }
        );
    }

}
