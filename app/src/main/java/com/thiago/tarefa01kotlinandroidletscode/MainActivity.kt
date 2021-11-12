package com.thiago.tarefa01kotlinandroidletscode

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import java.time.ZonedDateTime
import java.util.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("CutPasteId", "SetTextI18n")
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoNome = findViewById<Button>(R.id.nome)
        botaoNome.setOnClickListener {
            val texto = findViewById<TextView>(R.id.texto_loren)
            texto.text = TEXTO_NOME
        }

        val botaoOqFaco = findViewById<Button>(R.id.oqfaco)
        botaoOqFaco.setOnClickListener {
            val texto = findViewById<TextView>(R.id.texto_loren)
            texto.text = TEXTO_O_QUE_FACO
        }

        val botaoIdade = findViewById<Button>(R.id.idade)
        botaoIdade.setOnClickListener {
            val texto = findViewById<TextView>(R.id.texto_loren)
            val idade = ZonedDateTime.now().year - 1986
            texto.text = "Nasci em 1986, entáo possuo $idade anos"
        }

        val botaoLoren = findViewById<Button>(R.id.loren)
        botaoLoren.setOnClickListener {
            val texto = findViewById<TextView>(R.id.texto_loren)
            texto.text = TEXTO_LOREN
        }
    }

    companion object {
        val TEXTO_O_QUE_FACO = "Sou formado em Ciências Econômicas e estudante de Engenharia de " +
                "Programação, além disso sou programador java backend"

        val TEXTO_NOME = "Meu nome é Thiago de Oliveira Magdalena"

        val TEXTO_LOREN = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque enim" +
                " nibh, iaculis sit amet viverra sit amet, placerat lacinia erat. Mauris vitae felis purus. " +
                "Quisque ullamcorper dapibus arcu. Pellentesque sodales, urna a lacinia ornare, augue odio finibus elit, " +
                "non egestas nisl massa sed odio. Suspendisse et ullamcorper enim. Aliquam tincidunt neque ac ligula" +
                " molestie, id fringilla nibh maximus. Cras felis purus, finibus eu dignissim eleifend, elementum quis mauris." +
                " Donec aliquam rhoncus mauris quis hendrerit. In vitae mi arcu. Vivamus euismod imperdiet eros. " +
                "Duis porta varius libero, eget dignissim neque aliquam et. Curabitur et interdum ex, vel tempus metus. " +
                "Aliquam quis quam eget tellus hendrerit ultricies. Donec turpis velit, pulvinar" +
                " efficitur malesuada non, lobortis eu magna. Etiam a lobortis felis.\n" +
                "\n" +
                "Pellentesque porttitor semper venenatis. Phasellus semper pellentesque orci eu ultrices. " +
                "Morbi fringilla ante laoreet, rhoncus ex id, vehicula ligula. Curabitur pulvinar dui quam, " +
                "quis bibendum quam pellentesque vel. Nulla pretium felis sit amet neque dictum, id blandit" +
                " elit efficitur. Pellentesque a placerat ex. Suspendisse scelerisque convallis consectetur. " +
                "Phasellus ullamcorper vehicula nibh eu pretium. Proin vel erat ut ligula ullamcorper aliquet." +
                " Etiam ultricies neque ac lorem auctor, et blandit libero consectetur. Mauris turpis eros," +
                " auctor eget auctor vitae, molestie vel nisi."
    }
}