package com.example.uygulamadersi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uygulamadersi.databinding.ActivityMainBinding
import com.example.uygulamadersi.databinding.OgrenciBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var ogrenciBinding: OgrenciBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ogrenciBinding = OgrenciBinding.inflate(layoutInflater)
        setContentView(ogrenciBinding.root)

        val editText = ogrenciBinding.editTextText
        val editNumber = ogrenciBinding.editTextNumber
        ogrenciBinding.button2.setOnClickListener {
            if (editText.text.isEmpty() || editNumber.text.isEmpty()){
                Snackbar.make(it,"Boş Alan",Snackbar.LENGTH_SHORT).show()
            }
        }
    }
}