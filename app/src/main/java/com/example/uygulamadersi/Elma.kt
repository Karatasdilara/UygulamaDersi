package com.example.uygulamadersi

class Elma(ad: String, tatlilik: Int, val vitaminDegeri: String) : Meyve(ad, tatlilik) {


    fun yiyebilir(): String {
        return "true"
    }
}
