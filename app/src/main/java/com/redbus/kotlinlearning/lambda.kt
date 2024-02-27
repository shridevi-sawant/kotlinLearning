package com.redbus.kotlinlearning

fun main() {

    val data = listOf(1,2,3,4,10, 378, 23,13,74, 92)

    // even numbers

    // trailing lambda
    val evenList = data.filter {
        it % 2 == 0
    }

    println("Even num: $evenList")

    // square of each number

   val squareList =  data.map {
        it * it
    }
    println("Squared: $squareList")

    // cumulative sum of all numbers

    val cumSum = data.reduce { sum, num ->
        sum + num
    }

    println("Cumulative Sum: $cumSum")

    val withFold = data.fold(10){ sum, num ->
        sum + num
    }

    println("Cumulative Sum: $withFold")

    data.forEach {
        println("Square of $it: ${it * it}")
    }

    val anotherData: List<Any> = listOf(1, 23.34, "demo", 'a', false)

    for (item in anotherData){
        when{
            item is String -> {
                // smart-cast
                println("String is ${item.uppercase()}")
            }
            item is Int -> println("Int: $item")
        }
    }

    anotherData.forEach {
        val uppered = (it as? String)?.uppercase() ?: "--"
        println("Uppered: $uppered")
    }
}