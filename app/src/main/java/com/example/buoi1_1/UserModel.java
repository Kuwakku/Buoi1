package com.example.buoi1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.Serializable;

// alt insert
// ctrl alt l
public class UserModel implements Serializable {

    private String userName, address;

    public UserModel() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserModel(String userName, String address) {
        this.userName = userName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserModel{" + "userName='" + userName + '\'' + ", address='" + address + '\'' + '}';
    }
}