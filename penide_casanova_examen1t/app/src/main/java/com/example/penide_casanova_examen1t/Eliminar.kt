package com.example.penide_casanova_examen1t

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import androidx.core.view.isInvisible
import com.example.penide_casanova_examen1t.databinding.ActivityEliminarBinding


class Eliminar : AppCompatActivity() {

    private lateinit var binding: ActivityEliminarBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEliminarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //binding.beliminar.textOn="ELIMINAR"

        var recibir:Intent = getIntent()
        var texto = recibir.getStringExtra(Intent.EXTRA_TEXT)



        binding.leertextocontador.setText(texto)

        //????
        binding.beliminar.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked) {
                binding.leertextocontador.isInvisible
                binding.beliminar.isInvisible
            }

        }




    }
}