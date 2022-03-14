package ru.netology

fun main() {
    val likes = 42

    val likesCount: String = if ((likes == 1) || ((likes % 10) == 1 && likes != 11)) "человеку" else "людям"

    println("Понравилось $likes $likesCount")

}