package com.tpt.sportwagertpt.Utils.User;

import android.util.Log;

import com.google.gson.Gson;
import com.tpt.sportwagertpt.Models.Football.Match;
import com.tpt.sportwagertpt.Models.Users.User;
import com.tpt.sportwagertpt.Utils.LogTags;

import org.json.JSONObject;

import java.util.Arrays;

public class UserOperators {
    Gson gson = new Gson();

    public User jsonUserToObject(JSONObject json){
        User user = new User();
        try{
            JSONObject data = (JSONObject) json.get("data");
            user = this.gson.fromJson(String.valueOf(data), User.class);
        }
        catch (Exception e){
            Log.i(LogTags.apiError, e.getMessage());
        }
        return user;
    }
}
