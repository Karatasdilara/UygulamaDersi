package com.example.uygulamadersi.Hafta2.soru15

class Daire(val yariCap: Double) : Shape {
    override fun alanHesapla(): Double {
        return Math.PI * yariCap * yariCap
    }
}