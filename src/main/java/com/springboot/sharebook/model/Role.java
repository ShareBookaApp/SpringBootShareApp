package com.springboot.sharebook.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by alejandro on 24/03/17.
 */
public enum Role {
    ADMIN, PREMIUM_MEMBER,MEMBER;

    public String authority() {
        return "ROLE_" + this.name();
    }
}