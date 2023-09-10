package com.luizafmartinez.receitas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvReceitas: RecyclerView
    private lateinit var receitasAdapter: ReceitasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        receitasAdapter = ReceitasAdapter()
        rvReceitas = findViewById(R.id.rv_receitas)
        rvReceitas.adapter = receitasAdapter



    }
}