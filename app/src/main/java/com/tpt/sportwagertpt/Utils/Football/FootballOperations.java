package com.tpt.sportwagertpt.Utils.Football;

import android.util.Log;

import com.google.gson.Gson;
import com.tpt.sportwagertpt.Models.Football.Match;
import com.tpt.sportwagertpt.Utils.LogTags;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FootballOperations {
    Gson gson = new Gson();

    public List<Match> jsonMatchListToObject(JSONObject json){
        List<Match> matchList = new ArrayList<>();
        try{
            JSONObject data = (JSONObject) json.get("data");
            matchList = Arrays.asList(this.gson.fromJson(String.valueOf(data), Match[].class));
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
