package com.example.springboot;

import java.util.Date;

public class User {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private Date birthday;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Date getBirthday() {
        return birthday;
    }

}
