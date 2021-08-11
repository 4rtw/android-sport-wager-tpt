package com.tpt.sportwagertpt.Utils.Football;

import android.util.Log;

import com.google.gson.Gson;
import com.tpt.sportwagertpt.Interfaces.Football.Competition;
import com.tpt.sportwagertpt.Utils.LogTags;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompetitionOperations {
    Gson gson = new Gson();

    public List<Competition> jsonCompetitionListToObject(JSONObject json){
        List<Competition> competitionList = new ArrayList<>();
        try{
            JSONObject data = (JSONObject) json.get("data");
            competitionList = Arrays.asList(this.gson.fromJson(String.valueOf(data), Competition[].class));
        }
        catch (Exception e){
            Log.i(LogTags.apiError, e.getMessage());
        }
        return competitionList;
    }
}
