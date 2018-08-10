package com.blogspot.blogsetyaaji.kotlinmvp.MainActivity

// berfungsi untuk menampilkan pesan ke view lewat actiivty
// fungsi2 di dalam interface ini adalah fungsi abstrak
interface MainView {

    // pesan sukses yang membawa data pesan dari model
    fun sukses(hasil : MainModel)
    fun error()
}