package com.example.aluvery.sampleData

import com.example.aluvery.R
import com.example.aluvery.model.Product
import java.math.BigDecimal

val sampleProducts = listOf(
    Product(
        name = "Hamburguer",
        price = BigDecimal(30.50),
        image = R.drawable.burger
    ),
    Product(
        name = "Pizza TOP",
        price = BigDecimal(50.25),
        image = R.drawable.pizza
    ),
    Product(
        name = "Batata",
        price = BigDecimal(20.50),
        image = R.drawable.fries
    )
)