package com.example.uygulamadersi.Hafta2.soru10

fun <A, B> kesisimBul(map1: Map<A, B>, map2: Map<A, B>): Map<A, B> {
    val kesisim = HashMap<A, B>()

    for ((anahtar, deger) in map1) {
        if (map2.containsKey(anahtar) && map2[anahtar] == deger) {
            kesisim[anahtar] = deger
        }
    }

    return kesisim
}

fun main() {
    val map1 = hashMapOf("a" to 1, "b" to 2, "c" to 3)
    val map2 = hashMapOf("b" to 2, "c" to 3, "d" to 4)

    val kesisim = kesisimBul(map1, map2)
    println("Kesişim: $kesisim")
}