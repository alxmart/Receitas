package com.luizafmartinez.receitas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvReceitas: RecyclerView
    private lateinit var receitasAdapter: ReceitasAdapter
    private val listaReceitas = listOf(
        Receita("ESCONDIDINHO DE CAMARÃO",R.drawable.carne1,"25 min"),
        Receita("PANQUECA DE CARNE",R.drawable.carne2,"45 min"),
        Receita("ESCONDIDINHO DE CARNE SECA",R.drawable.carne4,"55 min"),
        Receita("ROCAMBOLE DE CARNE MOÍDA",R.drawable.carne3,"1hora"),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        receitasAdapter = ReceitasAdapter()
        rvReceitas = findViewById(R.id.rv_receitas)
        rvReceitas.adapter = receitasAdapter



    }
}