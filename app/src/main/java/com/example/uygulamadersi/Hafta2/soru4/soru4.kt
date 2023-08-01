package com.example.uygulamadersi.Hafta2.soru4

fun tersineListe(liste: Array<Int>): Array<Int> {
    return liste.reversed().toTypedArray()
}

fun main() {
    val listee = arrayOf(1, 2, 3, 4, 5)
    val tersliste = tersineListe(listee)
    println("Tersine çevrilmiş liste: ${tersliste.joinToString(", ")}")
}