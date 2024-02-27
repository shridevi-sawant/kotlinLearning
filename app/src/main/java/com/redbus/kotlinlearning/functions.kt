package com.redbus.kotlinlearning

fun add(a: Int, b: Int): Int{
    return a + b
}

fun add(a: Double, b: Double): Double{
    return a + b
}

fun displayInfo(name: String, age: Int, city: String){
    println("Name: $name")
    println("Age: $age")
    println("City: $city")
}

// default argument
 fun calculateEMI(amount: Int, rate: Int = 10, duration: Int = 12){

}

// variable- length args/ variadic
fun joinStr(vararg names: String): String{
    var result = ""
    for (n in names){
        result += n
    }

    return result
}

fun main() {
    var result = add(10, 20)
    println("Sum : $result")

    // named arguments
    displayInfo(city = "Pune", name = "john", age = 20)
    calculateEMI(1000)
    calculateEMI(1000, 20)
    calculateEMI(1000, duration = 24)

    val joined = joinStr("john", "merry", "robert")
    println(joined)
}