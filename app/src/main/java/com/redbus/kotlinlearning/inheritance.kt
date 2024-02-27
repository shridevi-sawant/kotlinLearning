package com.redbus.kotlinlearning

open  class Employee(var name: String, val empId: Int, var salary: Int){

    init {
        empCount++
    }
    open fun displayInfo(){
        println("""
            Name: $name
            Emp ID: $empId
            Salary: $salary
        """.trimIndent())
    }

    // static
    companion object {
        // type properties/methods
        var empCount = 0
    }
}

class Developer(empName: String, id: Int, salary: Int, var skill : String):
    Employee(empName, id, salary) {

      override fun displayInfo() {
            super.displayInfo()
          println("Skills: $skill")
      }
}

fun main() {

    val emp1 = Employee("john", 1, 1000)
    val emp2 = Developer("merry", 2, 2000, "Kotlin")

    emp1.displayInfo()
    emp2.displayInfo()

    println("Count: ${Employee.empCount}")
    emp1.addBonus(100)

    val name = "Redbus"
    println(name.removeFirstLast())
}

/*
Single A ->B

multilevel  A->B->C

multiple A,B->C - Not supported Java/kotlin

Hierarchical
    A->B, A->C
 */

// extension methods
fun Employee.addBonus(bonus: Int){

    this.salary += bonus
}

fun String.removeFirstLast(): String{
    return this.substring(1, this.lastIndex-1)
}

/*

private
public
protected
internal

 */