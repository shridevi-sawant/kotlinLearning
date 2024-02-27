package com.redbus.kotlinlearning

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    // Coroutines - coroutine scope

    runBlocking {

        // fire & forget
        /*
        Dispatchers
            - main - mainthread
            - default - free thread from shared pool
            - io - from shared pool but if all threads are busy, thread is created on demand
            - unconfined - not restricted
         */
       val j1 = launch(Dispatchers.Default) {
            doDownload()
        }



        println("---DONE---")
        j1.join() // waits for job to finish
        println("Download over now start upload")

        // async - result from coroutine
        val defferedResult = async(Dispatchers.IO) {
            doUpload()
        }

        val uploadLocation = defferedResult.await()
        println("Uploaded content here : $uploadLocation")

        for (i in 0..1_00_000) {
            launch(Dispatchers.Default) {
                doStuff()
            }
        }
    }
}


suspend fun doStuff(){
    delay(1000)
    print(".")

}

suspend fun doDownload(){
    // 5 sec
    println("Download started: ${Thread.currentThread().name}")
    delay(5000)
    println("Download over: ${Thread.currentThread().name}")
}

suspend fun doUpload(): String{
    // 2 sec

    delay(2000)

    return "http://google.com/test"
}