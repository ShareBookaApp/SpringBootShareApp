package com.springboot.sharebook.security.model;

/**
 * Created by alejandro on 4/05/17.
 */
public enum Scopes {
    REFRESH_TOKEN;

    public String authority() {
        return "ROLE_" + this.name();
    }
}
