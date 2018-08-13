package com.blogspot.blogsetyaaji.kotlinmvp.LoginActivity.Presenter;

import com.blogspot.blogsetyaaji.kotlinmvp.LoginActivity.Model.User;
import com.blogspot.blogsetyaaji.kotlinmvp.LoginActivity.View.ILoginView;

// implement interface login presenter untuk bisa menggunakan fungsi di interface
public class LoginPresenter implements ILoginPresenter {

    ILoginView loginView;

    // membuat constructor dengan parameter view untuk dimasuki activity
    public LoginPresenter(ILoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void onLogin(String email, String password) {
        // masukkan email dan password ke user
        User user = new User(email, password);
        boolean isLoginSukses = user.isValidData();

        // menjalankan perintah isValidData di model user
        if (isLoginSukses)
            loginView.onLoginResult("Login Sukses");
        else
            loginView.onLoginResult("Login Gagal");
    }
}
