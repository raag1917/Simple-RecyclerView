package com.raag.simplerecyclerview

/*
* Diseño y desarrollo:
* Ramiro Abad Gómez
* Android Developer
* */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.raag.simplerecyclerview.adapter.MainAdapter
import com.raag.simplerecyclerview.data.Names
import com.raag.simplerecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityMainBinding.inflate(layoutInflater).apply{
        setContentView(root)

            //lista que contine los elementos a mostrar en el recyclrview y es del tipo de la dataclass Names
            val list = mutableListOf(
                Names("Chris", "Abad"),
                Names("Clark", "Abad"),
                Names("Deckar", "Abad"),
                Names("Etham", "Abad"),
                Names("Steve", "Abad"),
                Names("Bruce", "Abad"),
                Names("Tony", "Abad"),
                Names("Marck", "Abad"),
                Names("Owen", "Abad"),
                Names("Smith", "Abad")
            )

            //método para arrancar el recycler dependiente del adaptador creado
            recyclerView.adapter = MainAdapter(this@MainActivity, list)

            /*
            * No se incluye el layoutManager en el MainActivity, dado que fue definido
            * en la layout bajo la propiedad app:layoutManager
            */
        }
    }
}