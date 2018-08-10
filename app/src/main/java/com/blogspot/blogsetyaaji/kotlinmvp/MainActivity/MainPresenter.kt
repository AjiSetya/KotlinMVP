package com.blogspot.blogsetyaaji.kotlinmvp.MainActivity

// interface menyimpan fungsi yang nanti akan digunakan
interface MainPresenter {

    // fungsi abstrak yang nanti kita gunakan
    fun tambahData(alas : String, tinggi : String)
}