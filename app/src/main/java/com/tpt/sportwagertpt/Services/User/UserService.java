package com.tpt.sportwagertpt.Services.User;

import android.app.Activity;

public class UserService {

    private final Activity activity;

    public UserService(Activity activity){
        this.activity = activity;
    }

    public void login(String email, String password){

    }

    public void logout(String email){}

    public void getUserDetails(long userId){}

    public void refreshToken(String refreshToken){}


}
