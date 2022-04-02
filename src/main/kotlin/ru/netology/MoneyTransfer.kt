package ru.netology

import kotlin.math.round

const val COMMISSION_PERCENT = 0.75
const val MIN_COMMISSION = 3500

fun main() {
    print("Сумма перевода в рублях: ")
    val amountKop = readln().toInt() * 100

    val commission = round(amountKop * COMMISSION_PERCENT / 100).toInt()
    val finalCommission = if (commission < MIN_COMMISSION) MIN_COMMISSION else commission

    println("Комиссия за перевод составляет ${finalCommission / 100} рублей ${finalCommission % 100} копеек")
}