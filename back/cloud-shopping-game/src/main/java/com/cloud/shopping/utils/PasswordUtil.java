package com.cloud.shopping.utils;

import org.springframework.util.DigestUtils;

public class PasswordUtil {

    private static final String SALT = "gp30#?>2a";

    public static String pwd2Md5(String paswword) {
        return DigestUtils.md5DigestAsHex((paswword + SALT).getBytes());
    }

}