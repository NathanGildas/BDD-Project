package com.example.utils;

import java.util.UUID;

public class TokenUtils {

    public static String generateToken() {
        return UUID.randomUUID().toString();
    }
}
