package com.example.uygulamadersi.Hafta2.soru5

fun tekrarEdenleriBulma(liste: Array<Int>): HashSet<Int> {
    val tekOlanlar = HashSet<Int>()
    val tekrarEdenler = HashSet<Int>()

    for (eleman in liste) {
        if (!tekOlanlar.add(eleman)) {
            tekrarEdenler.add(eleman)
        }
    }

    return tekrarEdenler
}

fun main() {
    val dizi = arrayOf(1,1,1,1,1, 2, 3, 4, 4, 5)
    val tekrarEdenSet = tekrarEdenleriBulma(dizi)
    println("Tekrar eden elemanlar: $tekrarEdenSet")
}