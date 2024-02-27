package com.redbus.kotlinlearning


// type - (Int, Int)->Int
fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun divide(a: Int, b:Int): Int{
    return a / b
}

/*
functional programming - function as data type

*/

fun main() {
    var mathOperation : (Int, Int) -> Int

    mathOperation = ::multiply
    var result = mathOperation(10, 20)
    println("Product = $result")

    mathOperation = ::divide // :: - function referencing operator
    result = mathOperation(10,2)
    println("Division = $result")

    doOperation(100, 200, ::multiply)

    val addLambda = { a: Int, b: Int ->
        a + b
    }

    result = addLambda(20, 30)
    println("Addition = $result")

    doOperation(10, 5, { a, b ->
        println("Doing subtraction")
        a - b
    })
}

// Higher-order function
fun doOperation(arg1: Int, arg2: Int, operation: (Int, Int)->Int ){

    val result = operation(arg1, arg2)
    println("Operation result: $result")
}

// Annonymous function - lambda