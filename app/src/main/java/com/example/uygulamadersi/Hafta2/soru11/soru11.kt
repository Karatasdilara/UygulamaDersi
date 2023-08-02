package com.example.uygulamadersi.Hafta2.soru11

fun <T> elemanSayisi(arrayList: ArrayList<T>): HashMap<T, Int> {
    val sayac = HashMap<T, Int>()

    for (eleman in arrayList) {
        sayac[eleman] = sayac.getOrDefault(eleman, 0) + 1
    }

    return sayac
}

fun main() {
    val arrayList = arrayListOf("a", "a", "b", "b", "b", "c", "d")

    val sayac = elemanSayisi(arrayList)
    println("Eleman Sayısı: $sayac")
}