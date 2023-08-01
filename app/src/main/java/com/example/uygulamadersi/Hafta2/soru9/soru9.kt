package com.example.uygulamadersi.Hafta2.soru9

fun cıkartma(set1: Set<Int>, set2: Set<Int>): Set<Int> {
    return set1.subtract(set2)
}

fun main() {
    val set1 = setOf(1, 2, 3, 4, 5)
    val set2 = setOf(3, 4, 5, 6, 7)

    val sonuc = cıkartma(set1, set2)
    println("Sonuç: $sonuc")
}