package com.example.uygulamadersi.Hafta2.soru1

fun toplama(liste: Array<Int>): Int {
    var toplam = 0
    for (sayi in liste) {
        toplam += sayi
    }
    return toplam
}

fun main() {
    val topla = arrayOf(3, 7, 2, 8, 5)
    val sonuc = toplama(topla)
    println("Toplam: $sonuc")
}