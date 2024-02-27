package com.redbus.kotlinlearning

fun main() {

    var username = "demo"
    println("Username: $username") // String interpolation

    username = "redbus"
    println("Updated Username: $username")

    val pi = 3.142f  // immutable

    println("PI = $pi")

    val city: String

    city = "Bangalore"

    println("City: ${city.uppercase()}")

    println("converted : ${pi.toInt()}")

    var isEven = false
    val num = 12

    isEven = num % 2 == 0

    println("is $num even? $isEven")

    val grade = 'A'

    println("Ch : $grade, ASCII: ${grade.code}")

}