package com.example.uygulamadersi.Hafta2.soru6

fun bulunuyorMu(dizi: HashSet<Int>, eleman: Int): Boolean {
    return dizi.contains(eleman)
}

fun main() {
    val listem = hashSetOf(1, 2, 3, 4, 5)
    val aranan = 3

    val sonuc = bulunuyorMu(listem, aranan)
    println("$aranan kümenin içinde mi: $sonuc")
}