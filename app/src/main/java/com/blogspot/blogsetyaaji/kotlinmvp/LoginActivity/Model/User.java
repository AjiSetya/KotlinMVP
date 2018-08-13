package com.blogspot.blogsetyaaji.kotlinmvp.LoginActivity.Model;

import android.text.TextUtils;
import android.util.Patterns;

import java.util.regex.Pattern;

// class model data user
// implement ke interface user untuk menggunakan fungsi yang telah dibuat
public class User implements IUser {

    String email, password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isValidData() {
        // check data not empty
        // check email is matches pattern
        // check password lenght > 6

        return !TextUtils.isEmpty(getEmail()) &&
                !TextUtils.isEmpty(getPassword()) &&
                Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches() &&
                getPassword().length() >= 6;
    }
}
