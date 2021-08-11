package com.tpt.sportwagertpt.Utils;

import android.app.Activity;

public class LogTags {
    public static String apiMessage = "apiMessage";
    public static String apiError = "apiError";
    public static String test = "test";
    public static String activity(Activity activity){
        return "activity-" + activity.getComponentName();
    }
    public static String fragment(Activity activity){
        return "fragment-" + activity.getComponentName();
    }
}
