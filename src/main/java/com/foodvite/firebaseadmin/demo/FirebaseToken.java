package com.foodvite.firebaseadmin.demo;

/**
 * Created by rupam.ghosh on 02/09/17.
 */
public class FirebaseToken {
    public String getToken() {
        return token;
    }

    public FirebaseToken(String token) {
        this.token = token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    private String token;
}
