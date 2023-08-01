package com.example.uygulamadersi.Hafta2.soru3

fun birlestirilmisListe(liste1: Array<Int>, liste2: Array<Int>): List<Int> {
    val sonucListe = ArrayList<Int>(liste1.size + liste2.size)
    sonucListe.addAll(liste1)
    sonucListe.addAll(liste2)
    return sonucListe
}

fun main() {
    val liste1 = arrayOf(5, 1, 3)
    val liste2 = arrayOf(2, 4, 6)

    val sonListe = birlestirilmisListe(liste1, liste2)
    println("Birleştirilmiş liste: $sonListe")
}