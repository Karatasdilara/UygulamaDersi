package com.example.uygulamadersi.soru2

fun main(){
    val gitar = Gitar()
    gitar.sesCikar()
    val piyano = Piyano()
    piyano.sesCikar()
    val muzikDersi = MüzikDersi()

    muzikDersi.cal(gitar)
}