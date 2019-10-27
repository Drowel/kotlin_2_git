package com.drow.kotlin_2.task5

// x^2(y - 8)/5 - (2x + 5)/y  = z
//Входные параметры задаются списком и в виде ключ-значение (HashMap)

fun main(){
    val myHashMap = hashMapOf<Int, Int>()
    myHashMap.put(1,2)
    myHashMap.put(2,4)
    myHashMap.put(3,6)

    fun process(hashMap: HashMap<Int,Int>){
       var x = 3
       var y = hashMap.getValue(x)
       var z = x*x*(y-8)/5-(2*x+5)/y
        println(z)
    }
    process(myHashMap)
}