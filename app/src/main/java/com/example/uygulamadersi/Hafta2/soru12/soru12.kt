package com.example.uygulamadersi.Hafta2.soru12

fun <V : Number> toplamHesapla(hashMap: HashMap<*, V>): Int {
    var toplam = 0

    for (deger in hashMap.values) {
        toplam += deger.toInt()
    }

    return toplam
}

fun main() {
    val hashMap = hashMapOf("a" to 1, "b" to 2, "c" to 3, "d" to 4)

    val toplam = toplamHesapla(hashMap)
    println("Toplam: $toplam")
}