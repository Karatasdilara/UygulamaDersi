package com.example.uygulamadersi.Hafta2.soru9

fun main() {
    val liste1 = listOf(1, 2, 3, 4, 5)
    val liste2 = listOf(3, 4, 5, 6, 7)

    val liste2deOlmayanlar = liste1.filterNot { it in liste2 }

    println("Liste 2'de olmayanlar: $liste2deOlmayanlar")
}