package com.blogspot.blogsetyaaji.kotlinmvp.LoginActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.blogspot.blogsetyaaji.kotlinmvp.LoginActivity.Presenter.LoginPresenter;
import com.blogspot.blogsetyaaji.kotlinmvp.LoginActivity.View.ILoginView;
import com.blogspot.blogsetyaaji.kotlinmvp.R;

public class LoginActivity extends AppCompatActivity implements ILoginView {

    private EditText edemail, edpassword;
    private Button btnlogin;

    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // inisialisasi login presenter dan memasukkan activity ini untuk diimplementasikan dengan interface login view
        loginPresenter = new LoginPresenter(this);

        edemail = (EditText)findViewById(R.id.edemail);
        edpassword= (EditText)findViewById(R.id.edpassword);
        btnlogin = (Button)findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // mengirim email dan password ke presenter untuk diproses
                loginPresenter.onLogin(edemail.getText().toString(), edpassword.getText().toString());
            }
        });
    }

    @Override
    public void onLoginResult(String pesan) {
        // menampilkan pesan yang diambil dari interface view
        Toast.makeText(this, pesan, Toast.LENGTH_SHORT).show();
    }
}
