package com.example.judaicapp.screens.others.rav_chat.objects;

public class User {
    private String name,password,phone,gender;
    private int totalStrike;

    public User() {
    }

    public User(String name, String password, String phone, String gender, int totalStrike) {
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.gender = gender;
        this.totalStrike = totalStrike;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getTotalStrike() {
        return totalStrike;
    }

    public void setTotalStrike(int totalStrike) {
        this.totalStrike = totalStrike;
    }
}