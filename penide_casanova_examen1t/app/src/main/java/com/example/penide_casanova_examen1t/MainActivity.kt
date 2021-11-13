package com.example.penide_casanova_examen1t

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.penide_casanova_examen1t.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var contador=0


        binding.bcontar.setOnClickListener{
            contador++
            binding.textocontador.setText("Contador $contador")
        }

        binding.benviar.setOnClickListener{
            val enviar = Intent(this, Eliminar::class.java)

            var textoPasar= binding.textocontador.text.toString()

            enviar.putExtra(Intent.EXTRA_TEXT,textoPasar)
            startActivity(enviar)

        }

        binding.bregistrar.setOnClickListener{

            val registrar = Intent(this, Registrar::class.java)
            startActivity(registrar)
        }
    }
}