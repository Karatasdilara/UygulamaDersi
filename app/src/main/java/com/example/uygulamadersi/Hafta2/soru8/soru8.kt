package com.example.uygulamadersi.Hafta2.soru8

fun listeyiSeteDonustur(liste: List<Int>): Set<Int> {
    return liste.toSet()
}

fun main() {
    val listeHali = listOf(1, 2, 2, 3, 4, 4, 5)
    val setHali = listeyiSeteDonustur(listeHali)
    println("Set: $setHali")
}