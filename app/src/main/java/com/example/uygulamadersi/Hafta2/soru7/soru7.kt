package com.example.uygulamadersi.Hafta2.soru7

fun elemanlariKopyala(alinanKume: HashSet<Int>, hedefKume: HashSet<Int>) {
    hedefKume.addAll(alinanKume)
}

fun main() {
    val alinanKume = hashSetOf(2,4,6,8)
    val hedefKume = hashSetOf(3,5,7,9)

    elemanlariKopyala(alinanKume, hedefKume)

    println("Hedef Küme (Sonra): $hedefKume")
}