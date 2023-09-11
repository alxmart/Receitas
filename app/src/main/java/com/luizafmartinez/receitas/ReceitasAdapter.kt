package com.luizafmartinez.receitas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

//Tipos: ReceitaAdapter e Adapter

class ReceitasAdapter(
    private val onClick: (Receita) -> Unit
) : Adapter<ReceitasAdapter.ReceitasViewHolder>() {

    private var listaReceitas = emptyList<Receita>()

    fun atualizarLista(lista: List<Receita>) {
        listaReceitas = lista
        notifyDataSetChanged()
    }
    // View -> Super classe
    //Button, CardView, ImageView, TextView....

    inner class ReceitasViewHolder(
        private val itemView: View
    ) : ViewHolder( itemView ) {

        var clItem : ConstraintLayout = itemView.findViewById(R.id.cl_item)
        var imageReceita: ImageView = itemView.findViewById(R.id.image_receita)
        var textTempo:    TextView  = itemView.findViewById(R.id.text_preparo)
        var textTitulo:   TextView  = itemView.findViewById(R.id.text_titulo)

        fun bind( receita: Receita) {
            textTitulo.text = receita.titulo
            textTempo.text = receita.tempoPreparo
            imageReceita.setImageDrawable(
                ContextCompat.getDrawable(
                    itemView.context, receita.IdImagem
                )
            )
            clItem.setOnClickListener {
                onClick(receita)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReceitasViewHolder {
      //Inflate:converter xml em objeto do tipo View
      val inflater = LayoutInflater.from( parent.context )
      val itemView = inflater.inflate(
            R.layout.item_receita, parent, false
      )
      return ReceitasViewHolder( itemView )
    }

    override fun onBindViewHolder(holder: ReceitasViewHolder, position: Int) {
        val receita = listaReceitas[position]
        holder.bind( receita )
    }

    override fun getItemCount(): Int {
        return listaReceitas.size
    }

}