package ru.netology

fun main() {
    print("Число лайков: ")
    val likes = readln().toInt()

    val msgEnd = if (likes == 1 || likes % 10 == 1 && likes % 100 != 11) {
        "человеку"
    } else {
        "человекам"
    }

    println("Понравилось $likes $msgEnd")
}