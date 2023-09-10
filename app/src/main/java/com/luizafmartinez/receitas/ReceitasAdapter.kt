package com.luizafmartinez.receitas

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

//Tipos: ReceitaAdapter e Adapter
class ReceitasAdapter : Adapter<ReceitasAdapter.ReceitasViewHolder>() {

    inner class ReceitasViewHolder(
        private val itemView: View
    ) : ViewHolder( itemView ) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReceitasViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ReceitasViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}