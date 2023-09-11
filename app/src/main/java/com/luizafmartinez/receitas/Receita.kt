package com.luizafmartinez.receitas

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Receita(
    val titulo: String,
    val IdImagem: Int,
    val tempoPreparo: String
) : Parcelable
