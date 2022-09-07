package com.homeWorks.five.domain;

import com.homeWorks.five.base.BaseEntity;

public class User extends BaseEntity<Long> {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String phoneNumber;
    private String email;

}
