package com.example.uygulamadersi.Hafta2.soru2

fun TekSayilar(liste: Array<Int>): List<Int> {
    return liste.filter { it % 2 != 0 }
}

fun main() {
    val Array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val sonuc = TekSayilar(Array)
    println("Tek sayılar: $sonuc")
}