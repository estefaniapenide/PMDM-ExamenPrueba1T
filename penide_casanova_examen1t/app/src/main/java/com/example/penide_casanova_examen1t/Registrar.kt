package com.example.penide_casanova_examen1t

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.penide_casanova_examen1t.databinding.ActivityRegistrarBinding

class Registrar : AppCompatActivity() {

    private lateinit var binding: ActivityRegistrarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRegistrarBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}