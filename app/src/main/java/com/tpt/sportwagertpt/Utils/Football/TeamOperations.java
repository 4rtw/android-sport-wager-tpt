package com.tpt.sportwagertpt.Utils.Football;

import android.util.Log;

import com.google.gson.Gson;
import com.tpt.sportwagertpt.Models.Football.TeamDetails;
import com.tpt.sportwagertpt.Utils.LogTags;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TeamOperations {
    Gson gson = new Gson();

    public List<TeamDetails> jsonTeamListToObject(JSONObject json){
        List<TeamDetails> teamDetailsList = new ArrayList<>();
        try{
            JSONObject data = (JSONObject) json.get("data");
            teamDetailsList = Arrays.asList(this.gson.fromJson(String.valueOf(data), TeamDetails[].class));
        }
        catch (Exception e){
            Log.i(LogTags.apiError, e.getMessage());
        }
        return teamDetailsList;
    }

    public TeamDetails jsonTeamToObject(JSONObject json){
        TeamDetails teamDetails = new TeamDetails();
        try{
            JSONObject data = (JSONObject) json.get("data");
            teamDetails = this.gson.fromJson(String.valueOf(data), TeamDetails.class);
        }
        catch (Exception e){
            Log.i(LogTags.apiError, e.getMessage());
        }
        return teamDetails;
    }
}
