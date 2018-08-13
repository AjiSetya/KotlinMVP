package com.blogspot.blogsetyaaji.kotlinmvp.LoginActivity.Model;

// Interface untuk model user
// menyimpan fungsi abstrak untuk class model User
public interface IUser {

    String getEmail();
    String getPassword();
    boolean isValidData();
}
