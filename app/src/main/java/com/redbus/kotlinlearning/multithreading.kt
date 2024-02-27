package com.redbus.kotlinlearning

import kotlin.concurrent.thread

fun main() {

    println("Main executed by : ${Thread.currentThread().name}")

    val t1 = thread(start = false) {
        // task to be performed in a new thread
        println("Task started.. ${Thread.currentThread().name}")

        Thread.sleep(2000)
        println("Task over")
    }

    t1.start()

    doDownloads()

    println("---DONE---")
}

fun doDownloads(){

    for (i in 0..1_00_000){
        thread {
            Thread.sleep(1000)
            print(".")
        }
    }
}

/*
Thread
    - allocates stack, registry
 */

/*
    Coroutines - Efficient concurrent execution
 */