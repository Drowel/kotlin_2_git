package com.drow.kotlin_2.task2

// Вывести количество заглавных букв в строке. Метод должен вернуть число заглавных букв (Kotlin/Java)

fun main(){
    val myString = "lsa;kdghsdlfghlkjds NNN aslkdj D"

    fun upperCount(string: String): Int {
        var count = 0
        for (ch in myString) {
            if (ch.isUpperCase()) {
                count++
            }
        }
        return count
    }
    println(upperCount(myString))
}