package ru.netology

import kotlin.math.round

const val PRICE = 100

fun main() {

    val musicLover = true

    print("Введите количество композиций: ")
    val quantity = readln().toInt()

    print("Сумма предыдущих покупок: ")
    val lastBuy = readln().toInt()

    val priceRub = quantity * PRICE

    // Скидка за предыдущие покупки
    val sellKop = if (lastBuy < 1001) {
        0
    } else if (lastBuy < 10_001) {
        10_000
    } else {
        ((priceRub * 0.05) * 100).toInt()
    }

    // Скидка "Меломан"
    val musicLoverSellKop = if (musicLover) {
        round((priceRub * 100 - sellKop) * 0.01).toInt()
    } else {
        0
    }

    // Сумма к оплате с учетом всех скидок
    val finalPriceKop = priceRub * 100 - sellKop - musicLoverSellKop

    println("Сумма покупки: ${finalPriceKop / 100} руб. ${finalPriceKop % 100} коп.")
    println("Ваша скидка: ${(sellKop + musicLoverSellKop) / 100} руб. ${(sellKop + musicLoverSellKop) % 100} коп.")

}