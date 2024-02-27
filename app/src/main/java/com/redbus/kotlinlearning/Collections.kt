package com.redbus.kotlinlearning

/*
List - dynamic
    mutableList
    List
Array - fixed
Map - dictionary
Set - unique
 */


fun main() {

    val numberList = mutableListOf<Int>(1,2,3,4,5) // mutable

    println(numberList)

    numberList[0] = 10
    numberList.add(20)
    numberList.add(1, 30)

    println(numberList)

    // key  as Index
    val contacts = mutableMapOf<String, Int>()
    contacts["john"] = 100 // add
    contacts["merry"] = 200
    contacts["john"] = 300 // updates

    println(contacts)

    val data = listOf(10, 20, 10, 20, 10, 30, 20, 40)

    // remove duplicates

    val uniqData = data.toSet()
    println(uniqData)

}