package com.redbus.kotlinlearning

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    val numbers = listOf(5, 10, null, 13, 34, null)

    // print all prime numbers

    val names = listOf("john", null, "merry", "elizabeth", null)

    // print longest name - reduce
    val longestName = names.reduce { str1, str2 ->
        val s1 = str1 ?: ""
        val s2 = str2 ?: ""

        if (s1.length > s2.length) s1 else s2
    }

    println(longestName)


}

