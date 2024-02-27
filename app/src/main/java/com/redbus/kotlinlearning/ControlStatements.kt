package com.redbus.kotlinlearning

/*
Conditional Statements
    - if, when

Looping
    - for
    - while
 */

fun main() {
    var number = 11

    //  if as statement
    if (number % 2 == 0){
        println("$number is Even")
    } else
        println("$number is Odd")


    // if as expression - no ternary operator

    val num1 = 11
    val num2 = 20

    val max = if (num1 > num2) {
        println("$num1 is bigger")
        num1
    }else {
        println("$num2 is bigger")
        num2
    }
    println("Max: $max")


    val marks = 89

    // as statement
    when (marks){
        100 -> println("EXCELLENT")
        in 75..100 -> println("Distinction")
        in 65..75 -> println("First Class")
        in 35..65 -> println("Second Class")
        else -> println("Failed")
    }

    // as expression

    val grade = when (marks){
        100 -> {

            "A++"
        }
        in 75..100 -> "A"
        in 65..75 -> "B+"
        in 35..65 -> "B"
        else -> "F"
    }

    println("GRade: $grade")

    // for loop - iterating over collection

    val name = "redBus india"
    val vowels = arrayOf('a', 'e', 'i', 'o', 'u') // Array - size is fixed
    var vCount = 0
    for (ch in name.lowercase()){
        if (ch in vowels) vCount++
    }

    println("Vowel Count: $vCount")

    // while - condition based

    var counter = 0

    while (counter < 3){
        counter++
        println("Counter: $counter")
    }

    do {
        counter--
        println("Counter decremented : $counter")
    }while (counter > 0)
}


