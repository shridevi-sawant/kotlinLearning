package com.redbus.kotlinlearning

data class Point(var x: Int, var y: Int) {
    operator fun plus(p: Point): Point{
        return Point(x + p.x, y+p.y)
    }


}

fun main() {

    val p1 = Point(10, 10)
    val p2 = Point(5, 5 )

    val p3 = p1 + p2 // p1.plus(p2)
    println(p3)

    // Scoping functions -

    var name: String? = "abcd"

//    println(name?.length)
//    println(name?.uppercase())
//    println(name?.first())

    // let,run, with, apply, also - scoping func

    // nullable references - let, run
    name?.let {
        println(it.length)
        println(it.uppercase())
        println(it.first())
    }

    name?.run {
        println(length)
        println(uppercase())
        println(first())
    }

    // non-nullable refernce - with

    val data = listOf(1,2,3,4)

    with(data){
        println(this)
        println(size)
        println(first())

    }

    // apply(), also() -  object creation

    val p4 = Point(0, 0).also {
        println(it)
    }

   // println(p4)

    val p5 = Point(0, 0).apply {
        x = 100
        y = 100
    }

    println(p5)
}