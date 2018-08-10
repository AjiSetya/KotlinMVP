package com.blogspot.blogsetyaaji.kotlinmvp.MainActivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.blogspot.blogsetyaaji.kotlinmvp.R
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.noButton
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.toast
import org.jetbrains.anko.yesButton

// activity ini implement ke MainView untuk mengakses fungsi yang ada pada MainView
class MainActivity : AppCompatActivity(), MainView {

    // deklarasi MainPresenterImp
    lateinit var presenterImp: MainPresenterImp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // inisialisasi MainPresenterImp untuk mengakses fungsi tambahData
        presenterImp = MainPresenterImp(this)

        // ketika tombol diklik
        btnhitung.onClick {
            // menjalankan fungsi yang ada di presenter
            presenterImp.tambahData(edalas.text.toString(), edtinggi.text.toString())
        }
    }

    // fungsi ini membawa pesan yang ada dimodel untuk ditampilkan di alert
    override fun sukses(hasil: MainModel) {
        alert {
            title = hasil.txtmsg

            noButton {  }
            yesButton { dialog -> dialog.dismiss() }
        }.show()
    }

    // fungsi error kalau error terjadi
    override fun error() {
        toast("Lengkapi form")
    }
}
