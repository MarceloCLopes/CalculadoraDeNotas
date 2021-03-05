package com.mclsolutions.calculadoradenotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular = btnCalcular
        val resultado = textResultado

        calcular.setOnClickListener {

            val nota1 = Integer.parseInt(editNota1.text.toString())
            val nota2 = Integer.parseInt(editNota2.text.toString())
            val media = (nota1 + nota2) / 2
            val faltas = Integer.parseInt(editNumeroFaltas.text.toString())

            if (media >= 6 && faltas <= 10){
                resultado.text = "Aluno Aprovado\nNota final: $media\nFaltas: $faltas"
            } else{
                resultado.text ="Aluno Reprovado\nNota final: $media\nFaltas: $faltas"
            }
        }
    }
}