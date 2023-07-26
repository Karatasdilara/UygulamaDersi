package com.example.uygulamadersi.soru4

import java.util.Scanner

fun main() {
    val sayilar = ArrayList<Int>()

    for (i in 1..5) {
        print("Sayı $i: ")
        val sayi = readLine()?.toIntOrNull()
       if (sayi != null) {
            sayilar.add(sayi)
        } else {
            println("Geçerli bir sayı girmediniz.")
            return
        }
    }

    fun toplamHesapla(liste: ArrayList<Int>): Int {
        var toplam = 0
        for (sayi in liste) {
            toplam += sayi
        }
        return toplam
    }

    val toplam = toplamHesapla(sayilar)
    println("Girilen sayıların toplamı: $toplam")
}