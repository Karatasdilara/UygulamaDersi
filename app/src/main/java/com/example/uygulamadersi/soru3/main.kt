package com.example.uygulamadersi.soru3

fun main (){
    val kedi =Kedi ()
    kedi.sesCikar()
    val hayvan1: Hayvan = Kedi()
    val hayvan2: Hayvan = Köpek()
    val barinak = HayvanBarinagi()
    barinak.sesCikar(hayvan1)
    barinak.sesCikar(hayvan2)
}