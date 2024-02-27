package com.redbus.kotlinlearning

import java.lang.ArithmeticException
import java.security.InvalidParameterException

fun main() {
    val num1 = 10
    var divisor = 2
    var res = doDivision(num1, divisor)
    println(" $num1 / $divisor = $res ")

    divisor = 0
    res = doDivision(num1, divisor)
    println(" $num1 / $divisor = $res ")

    try {
        startGame(-10)
    }catch (err: Exception){
        println("Game not started: ${err.localizedMessage}")
    }
}

fun doDivision(number: Int, divisor: Int): Int {
//    try {
//        val result = number / divisor
//        return result
//    }catch (err: ArithmeticException){
//        return 0
//    }catch (err: Exception){
//        return 0
//    }

    // try as expression
    return  try {
        number / divisor
    }catch (err: ArithmeticException){
        println("Got error: ${err.localizedMessage}")
        0
    }catch (err: Exception){
        0
    }
}

fun startGame(level: Int) {

    if (level < 0) {
        throw InvalidParameterException("Invalid game level")
    }

    println("Game started ...")
}