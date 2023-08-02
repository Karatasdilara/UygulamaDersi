package com.example.uygulamadersi.Hafta2.soru13

fun <K, V : Comparable<V>> enBuyukKeyValueBul(harita: HashMap<K, V>): Pair<K, V>? {
    var enBuyukDeger: V? = null
    var anahtarAit: K? = null

    for ((anahtar, deger) in harita) {
        if (enBuyukDeger == null || deger > enBuyukDeger) {
            enBuyukDeger = deger
            anahtarAit = anahtar
        }
    }

    return anahtarAit?.let { anahtar -> Pair(anahtar, enBuyukDeger!!) }
}

fun main() {
    val harita = hashMapOf("a" to 1, "b" to 5, "c" to 2, "d" to 3)

    val enBuyukKeyValue = enBuyukKeyValueBul(harita)

    if (enBuyukKeyValue != null) {
        val (anahtar, deger) = enBuyukKeyValue
        println("En büyük anahtar ve değer: $anahtar -> $deger")
    } else {
        println("Harita boş.")
    }
}