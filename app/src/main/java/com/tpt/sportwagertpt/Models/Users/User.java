package com.tpt.sportwagertpt.Models.Users;

public class User {
    public long id;
    public String firstname;
    public String lastname;
    public String image;
    public String email;
    public String phone;
    public boolean status;
    public int betcredit;

    public User() {
    }

    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getImage() {
        return image;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public boolean isStatus() {
        return status;
    }

    public int getBetcredit() {
        return betcredit;
    }
}
