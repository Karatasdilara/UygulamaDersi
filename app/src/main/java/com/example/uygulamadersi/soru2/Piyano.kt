package com.example.uygulamadersi.soru2

import com.example.uygulamadersi.soru2.MuzikAleti

class Piyano : MuzikAleti() {
    override open fun sesCikar(){
        println("piyano sesi")
    }
}