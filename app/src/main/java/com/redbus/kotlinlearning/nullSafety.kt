package com.redbus.kotlinlearning

fun main() {

    var userid: String? = "demo" // nullable reference
    var city = "bangalore" // non-nullable

    //userid = null


    // 1. explicit null check
    if (userid != null){ // smart-check
        println(" No of chars: ${userid.length}")
    }else {
        println("No userid")
    }

    // 2. safe-call operator ?.

    println("No of chars: ${userid?.length}")
    println("ASCII value of first char: ${userid?.first()?.code}")

    // 3. elvis operator ?: - converting nullable to non-nullable

    val loginName = userid ?: "admin"


    // 4. assertion operator !! - forceful accessing the value

    //userid = null
    val firstCh = getFirstChar(userid)

    println("${firstCh!!.code}")

    doSum(10, 20)
}


fun getFirstChar(str: String?): Char? {

    return str?.first()
}

fun doSum(a: Int, b: Int){
    println("$a + $b = ${a+b}")
}