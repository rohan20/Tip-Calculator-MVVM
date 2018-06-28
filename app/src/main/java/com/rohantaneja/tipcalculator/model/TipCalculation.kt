package com.rohantaneja.tipcalculator.model

data class TipCalculation(
        val billAmount: Double = 0.00,
        val tipPercentage: Int = 0,
        val tipAmount: Double = 0.00,
        val grandTotalAmount: Double = 0.00
)