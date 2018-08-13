package com.blogspot.blogsetyaaji.kotlinmvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.blogspot.blogsetyaaji.kotlinmvp.LoginActivity.LoginActivity
import com.blogspot.blogsetyaaji.kotlinmvp.MainActivity.MainActivity
import kotlinx.android.synthetic.main.activity_menu.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.startActivity

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btnmtksegitiga.onClick { startActivity<MainActivity>() }
        btnloginexp.onClick { startActivity<LoginActivity>() }
    }
}
