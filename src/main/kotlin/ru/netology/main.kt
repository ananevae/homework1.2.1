package ru.netology

fun main() {
    val amount = 20000_00
    val commissionPerc = 0.0075
    val minComission = 35_00

    val commission = amount * commissionPerc
    val totalCommission = if (commission > minComission) commission.toInt() else minComission
    println("Total Commission: " + totalCommission / 100 + " руб. " + totalCommission % 100 + " коп.")
}
