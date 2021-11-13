package com.example.penide_casanova_examen1t

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.penide_casanova_examen1t.databinding.ActivityRegistrarBinding

class Registrar : AppCompatActivity() {

    private lateinit var binding: ActivityRegistrarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRegistrarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var nombre = binding.teNombre.text.toString()
        var apellido1= binding.teApellido1.text.toString()
        var apellido2= binding.teApellido2.text.toString()
        var sexo=binding.radioGroup.checkedRadioButtonId
        var s:String
        var empleado=binding.radioGroup2.checkedRadioButtonId
        var e:String
        var fecha = binding.etdIncorporacion.text.toString()

        if(sexo==binding.rbMujer.id){
            s="Mujer"
        }else if(sexo==binding.rbHombre.id){
            s="Hombre"
        }else if(sexo==-1){
            s=""
        }

        if(empleado==binding.rbProgramador.id){
            e="Programador"
        }else if(sexo==binding.rbHombre.id){
            e="Hombre"
        }else if(sexo==-1){
            e=""
        }

        binding.bRegistrar.setOnClickListener{

        }





    }
}