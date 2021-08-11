package com.tpt.sportwagertpt.Utils.Nba;
import android.util.Log;

import com.android.volley.VolleyError;
import com.google.gson.Gson;

import com.tpt.sportwagertpt.Models.NBA.Match;

import org.json.JSONArray;
import org.json.JSONObject;
import com.tpt.sportwagertpt.Utils.LogTags;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NbaOperations {
    Gson gson = new Gson();

    public List<Match> jsonMatchListToObject(JSONObject json){
        List<Match> matchList = new ArrayList<Match>();
        try{
            JSONObject data = (JSONObject) json.get("data");
            JSONArray insideData = (JSONArray) data.get("data");
            matchList = Arrays.asList(this.gson.fromJson(String.valueOf(insideData), Match[].class));
        }
        catch (Exception e){
            Log.i(LogTags.apiError, e.getMessage());
        }

        return matchList;
    }

    public Match jsonMatchToObject(JSONObject json){
        Match match = new Match();
        try{
            JSONObject data = (JSONObject) json.get("data");
            match = this.gson.fromJson(String.valueOf(data), Match.class);
        }
        catch (Exception e){
            Log.i(LogTags.apiError, e.getMessage());
        }
        return match;
    }
}
