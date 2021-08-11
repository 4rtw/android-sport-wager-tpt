package com.tpt.sportwagertpt.Utils;

import android.util.Log;

import com.android.volley.VolleyError;

public class ApiResponseUtils {
    public static void printError(VolleyError error){
        Log.i(LogTags.apiError, error.getMessage());
    }
}
