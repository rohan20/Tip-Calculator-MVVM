package com.rohantaneja.tipcalculator.model

class TipCalculator {

    fun calculateTip(billAmount: Double, tipPercentage: Int): TipCalculation {

        val tipAmount = billAmount * (tipPercentage / 100)
        val grandTotal = billAmount + tipAmount;

        return TipCalculation(billAmount, tipPercentage, tipAmount, grandTotal)
    }
}