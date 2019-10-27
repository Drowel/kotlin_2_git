package com.drow.kotlin_2.task3

import java.lang.StringBuilder

// Поменять в строке заглавные буквы на строчные и наоборот. Метод должен вернуть новую строку (Kotlin/Java)

fun main() {
    val myString = "lsa;kdghsdlfghlkjds NNN aslkdj D"

    fun upperSwitch(string: String): String {
        //  val oldString = StringBuilder(string)
        val newString = StringBuilder()
        for (ch in string) {
            if (ch.isUpperCase()) {
                newString.append(ch.toLowerCase())
            } else {
                newString.append(ch.toUpperCase())
            }
        }
        return newString.toString()
    }
    println(upperSwitch(myString))
}