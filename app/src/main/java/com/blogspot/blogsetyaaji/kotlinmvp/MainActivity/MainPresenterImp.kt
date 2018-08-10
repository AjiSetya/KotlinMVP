package com.blogspot.blogsetyaaji.kotlinmvp.MainActivity

// presenter ini akan diterapkan ke activity langsung
// activity akan dimasukkan sebagai constructor viewmodel agar activity dapat mengakses fungsi pada class ini
// inherit ke MainPresenter untuk menggunakan fungsi tambahData
class MainPresenterImp(viewmodel : MainView) : MainPresenter {

    // deklarasi modelview
    var modelview : MainView? = null

    init {
        // memasukkan MainView ke dalam class ini
        modelview = viewmodel
    }

    // pesan dari activity diproses
    override fun tambahData(alas: String, tinggi: String) {

        // jika pesan tidak kosong
        if (alas.isNotEmpty() && tinggi.isNotEmpty()){

            // proses data
            var a = alas.toDouble()
            var t = tinggi.toDouble()
            var hasil = a*t/2

            // kirim pesan ke model
            var model = MainModel(hasil.toString())

            // menggunakan fungsi sukses dari MainView
            // memasukkan pesan ke model untuk nanti ditampilkan di activity oleh view
            modelview?.sukses(model)
        } else {
            modelview?.error()
        }
    }
}