package com.example.uygulamadersi.Hafta2.soru8

fun listeyiSeteDonustur(liste: List<Int>): Set<Int> {
    return liste.toSet()
}

fun main() {
    val listem = listOf(1, 2, 2, 3, 4, 4, 5)
    val setim = listeyiSeteDonustur(listem)
    println("Set: $setim")
}