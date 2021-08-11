package com.tpt.sportwagertpt.Utils.Football;

import android.util.Log;

import com.google.gson.Gson;
import com.tpt.sportwagertpt.Models.Football.TeamStats;
import com.tpt.sportwagertpt.Utils.LogTags;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StatsOperations {
    Gson gson = new Gson();

    public List<TeamStats> jsonStatListToObject(JSONObject json){
        List<TeamStats> teamStatsList = new ArrayList<>();
        try{
            JSONObject data = (JSONObject) json.get("data");
            teamStatsList = Arrays.asList(this.gson.fromJson(String.valueOf(data), TeamStats[].class));
        }
        catch (Exception e){
            Log.i(LogTags.apiError, e.getMessage());
        }
        return teamStatsList;
    }
}
