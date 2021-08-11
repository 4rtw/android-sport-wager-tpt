package com.tpt.sportwagertpt.Utils;

import java.util.Date;

public class DateOperators {

    public static String getDateForUrl(Date date){

        String year = String.valueOf(date.getYear());
        String month = String.valueOf(date.getMonth());
        String day = String.valueOf(date.getDay());

        return year + "-" + month + "-" +day;
    }
}
