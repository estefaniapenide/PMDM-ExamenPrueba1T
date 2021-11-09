package com.example.penide_casanova_examen1t

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.penide_casanova_examen1t.databinding.ActivityEliminarBinding

class Eliminar : AppCompatActivity() {
    private lateinit var binding: ActivityEliminarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEliminarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.beliminar.textOn="ELIMINAR"

        binding.beliminar.setOnClickListener{

            if (binding.beliminar.isEnabled){
                binding.leertextocontador.setText("a")
            }else{
                binding.leertextocontador.setText("b")
            }
        }
    }
}