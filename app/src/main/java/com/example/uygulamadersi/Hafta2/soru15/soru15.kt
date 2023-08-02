package com.example.uygulamadersi.Hafta2.soru15

interface Shape {
    fun alanHesapla(): Double
}

fun main() {
    val dikdortgen = Dikdortgen(5.0, 3.0)
    println("Dikdörtgen Alanı: ${dikdortgen.alanHesapla()}")

    val daire = Daire(4.0)
    println("Daire Alanı: ${daire.alanHesapla()}")
}






