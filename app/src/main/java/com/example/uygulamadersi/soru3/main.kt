package com.example.uygulamadersi.soru3

import com.example.uygulamadersi.soru2.MüzikDersi

fun main (){
    val kedi =Kedi ()
    kedi.sesCikar()
    val hayvan1: Hayvan = Kedi()
    val hayvan2: Hayvan = Köpek()
    val barinak = HayvanBarınagı()
    barinak.sesCikar(hayvan1)
    barinak.sesCikar(hayvan2)
}