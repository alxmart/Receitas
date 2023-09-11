package com.luizafmartinez.receitas

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class DetalhesActivity : AppCompatActivity() {

    private lateinit var btnVoltar: Button
    private lateinit var imageReceita: ImageView
    private lateinit var textTempo: TextView
    private lateinit var textTitulo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        btnVoltar = findViewById(R.id.btn_voltar)
        imageReceita = findViewById(R.id.image_detalhe_receita)
        textTitulo = findViewById(R.id.text_detalhe_titulo)
        textTempo = findViewById(R.id.text_detalhe_tempo)

        btnVoltar.setOnClickListener {
            finish()
        }

        val extras = intent.extras
        val receita = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                extras?.getParcelable("receita", Receita::class.java)
            } else {
                extras?.getParcelable("receita")
            }
            if (receita != null) {
                textTitulo.text = receita.titulo
                textTempo.text = receita.tempoPreparo
                imageReceita.setImageDrawable(
                    ContextCompat.getDrawable(
                        this, receita.IdImagem
                    )
                )
            }


        }
}