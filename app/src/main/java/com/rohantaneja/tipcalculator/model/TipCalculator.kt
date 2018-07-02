package com.rohantaneja.tipcalculator.model

import java.math.RoundingMode

class TipCalculator {

    fun calculateTip(billAmount: Double, tipPercentage: Int): TipCalculation {

        val tipAmount = billAmount * (tipPercentage.toDouble() / 100)
                .toBigDecimal()
                .setScale(2, RoundingMode.HALF_UP)
                .toDouble()

        val grandTotal = billAmount + tipAmount;

        return TipCalculation(billAmount, tipPercentage, tipAmount, grandTotal)
    }
}