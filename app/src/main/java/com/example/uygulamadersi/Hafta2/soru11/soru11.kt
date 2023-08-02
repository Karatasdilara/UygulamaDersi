package com.example.uygulamadersi.Hafta2.soru11


fun main() {
    val liste = listOf(1,2,2,3,3,3,4,5,5)
    val has = HashMap<Int,Int>()
    for (i in liste){
        if (!has.keys.contains(i)){
            has.put(i,liste.filter {it == i}.count())
        }
    }
    println(has)


}
