package com.springboot.sharebook.security.exceptions;

import org.springframework.security.authentication.AuthenticationServiceException;

/**
 * Created by alejandro on 4/05/17.
 */
public class AuthMethodNotSupportedException extends AuthenticationServiceException {
    private static final long serialVersionUID = 3705043083010304496L;

    public AuthMethodNotSupportedException(String msg) {
        super(msg);
    }
}