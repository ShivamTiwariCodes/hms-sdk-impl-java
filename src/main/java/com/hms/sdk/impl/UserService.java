package com.hms.sdk.impl;

import com.hms.sdk.core.IUserService;

public class UserService implements IUserService {

    @Override
    public void updateUser(String s, Object o) {
        System.out.println("Updated user with value : " + s);
    }
}
