package com.example.uygulamadersi.Hafta2.soru14


interface Cizilebilir {
    fun ciz()
}

fun main() {
    val kalem = Kalem()
    val silgi = Silgi()

    kalem.ciz() // Çıktı: Kalem ile çizildi.
    silgi.ciz() // Çıktı: Silgi ile silindi.
}