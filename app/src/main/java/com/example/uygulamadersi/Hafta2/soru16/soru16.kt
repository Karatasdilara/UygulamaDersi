package com.example.uygulamadersi.Hafta2.soru16

interface Calisan {
    fun maasHesapla(): Int
}

fun main() {
    val mudur = Mudur(10000)
    println("Müdür Maaşı: ${mudur.maasHesapla()}")

    val memur = Memur(8000)
    println("Memur Maaşı: ${memur.maasHesapla()}")
}