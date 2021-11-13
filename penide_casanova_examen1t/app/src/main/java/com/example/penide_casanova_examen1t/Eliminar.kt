package com.example.penide_casanova_examen1t

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import androidx.core.view.isInvisible
import com.example.penide_casanova_examen1t.databinding.ActivityEliminarBinding


class Eliminar : AppCompatActivity() {

    private lateinit var binding: ActivityEliminarBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEliminarBinding.inflate(layoutInflater)
        setContentView(binding.root)



        var recibir:Intent = getIntent()
        var texto = recibir.getStringExtra(Intent.EXTRA_TEXT)



        binding.leertextocontador.setText(texto)

        //Puse el toogleButton en el main como on por defecto, al pulsarlo hago que desaparezacn el texto y el botón
        binding.beliminar.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked) {
                binding.leertextocontador.visibility= View.GONE
                binding.beliminar.visibility=View.GONE
            }

        }




    }
}