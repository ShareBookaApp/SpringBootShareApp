package com.springboot.sharebook.security.auth.jwt.extractor;

/**
 * Created by alejandro on 4/05/17.
 */
public interface TokenExtractor {
    public String extract(String payload);
}
