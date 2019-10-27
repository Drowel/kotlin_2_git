package com.drow.kotlin_2.task1

// Определить есть ли в строке заглавные буквы. Метод должен вернуть true или false (Kotlin/Java)

fun main() {
    val myString = "lsa;kdghsdlfghlkjds aslkdj p"

    fun isUpper(string: String): Boolean {
        for (ch in myString) {
            if (ch.isUpperCase()) {
                return true
            }
        }
        return false
    }
    println(isUpper(myString))

}