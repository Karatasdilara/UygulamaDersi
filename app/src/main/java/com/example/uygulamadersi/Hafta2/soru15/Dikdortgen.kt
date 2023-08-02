package com.example.uygulamadersi.Hafta2.soru15

class Dikdortgen( val uzunKenar: Double,  val kisaKenar: Double) : Shape {
    override fun alanHesapla(): Double {
        return uzunKenar * kisaKenar
    }
}