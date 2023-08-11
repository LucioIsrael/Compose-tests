package com.example.aluvery.extensions

import android.icu.text.NumberFormat
import java.math.BigDecimal
import java.util.Locale

fun BigDecimal.toBrazilianCurrency(): String {
    return NumberFormat
        .getCurrencyInstance(Locale("pt", "br"))
        .format(this)
}