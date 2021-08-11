package com.tpt.sportwagertpt.Models.Users;

public class Token {
    public String access_token;
    public String refresh_token;

    public Token() {
    }

    public String getAccess_token() {
        return access_token;
    }

    public String getRefresh_token() {
        return refresh_token;
    }
}
