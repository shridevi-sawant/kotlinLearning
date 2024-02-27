package com.redbus.kotlinlearning

// primary constructor
class Student(val name: String, val rollNo: Int) {
    // data/ properties

    var marks: Int = 0
    init {
        println("init block called for ${name.uppercase()}")
    }

    // secondary constructor
    constructor(name: String, rNo: Int, marks: Int) : this(name, rNo){
        this.marks = marks
    }

    // methods

    fun displayInfo(){
        println("Name: $name")
        println("Roll NO: $rollNo")
        println("Marks: $marks")
    }
}

// toString(), copy(), hash()
// no inheritance, cannot be abstract
data class Animal(val noOfLegs: Int, var eyeColor: String)

fun main() {

    val std1 = Student("john", 1)
    std1.displayInfo()

    val std2 = Student("merry", 2, 30)
    std2.displayInfo()

    val dog = Animal(4, "brown")
    print(dog)


}