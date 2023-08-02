package com.example.uygulamadersi.Hafta2.soru13


fun main() {
    val hashmap2 = hashMapOf("a" to 1, "b" to 5, "c" to 2, "d" to 3)
    maxKeyValue(hashmap2)
}


fun maxKeyValue (hashmap:HashMap<String,Int>){
    val maxValue = hashMapOf<String,Int>()
    val max = hashmap.values.max()

    for (i in hashmap){
        if (i.value== max){
            maxValue.put(i.key,i.value)
        }
    }

    println(maxValue)
}
