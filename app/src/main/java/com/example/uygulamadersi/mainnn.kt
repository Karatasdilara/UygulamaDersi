package com.example.uygulamadersi


fun main() {
    val elma = Elma("Kırmızı Elma", 7, "C vitamini")
    println("Adı: ${elma.ad}")
    println("Tatlılık Derecesi: ${elma.tatlilik}")
    println("Vitamin Değeri: ${elma.vitaminDegeri}")
    println("Yenebilir mi? ${elma.yiyebilir()}")
}