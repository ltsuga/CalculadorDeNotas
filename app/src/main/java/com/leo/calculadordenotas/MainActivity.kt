package com.leo.calculadordenotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = button
        button.setOnClickListener {
            calculate()
        }
    }

    private fun calculate() {

        try {
            val nota1 = Integer.parseInt(textNota1.text.toString())
            val nota2 = Integer.parseInt(textNota2.text.toString())
            val faltas = Integer.parseInt(textFaltas.text.toString())
            val media = (nota1 + nota2)/2

            if (faltas > 10 || media <5){
                textView.setText("Reprovado")
            }
            else{
                textView.setText("Aprovado")
            }

        }catch (e:Exception){

        }
    }
}