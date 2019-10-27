package com.drow.kotlin_2.task4

import org.omg.CORBA.Object

// Определить является ли введенное значение палиндромом. Метод должен вернуть true или false.
// На вход могут подаваться как строки, так и целые числа (число нужно преобразовать в строку) (Kotlin/Java)


fun main(){
 //   println("Type something: ")
    val anyString = "123333"

    fun isPalindrom(string: String): String {
            var revers = string.reversed()
        var i = 0
     loop@      for (ch in string){
                if (ch != revers[i]) {
                    return "Its NOT palindrom"
                    break@loop
                } else {
                    i++
                }
            }
        return "Its palindrom"
        }
    println(isPalindrom(anyString))
    }
