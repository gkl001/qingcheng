package com.jk.model;

import java.io.Serializable;

public class UserModel implements Serializable {
    private static final long serialVersionUID = 15L;
    private Integer id;

    private String username;

    private String userpass;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass == null ? null : userpass.trim();
    }
}