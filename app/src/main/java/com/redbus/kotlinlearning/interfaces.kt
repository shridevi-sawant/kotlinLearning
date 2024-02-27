package com.redbus.kotlinlearning

open class BankAccount(var accNum: Int, var accName: String){

    var balance = 0
}

interface CreditInterface {
    val maxCreditAmount: Int

    fun credit(amount: Int): Boolean
}

interface DebitInterface {
    fun debit(amount: Int): Boolean
    fun doStuff() {
        println("***")
    }
}

class SavingAccount(accNum: Int, name: String):
    BankAccount(accNum, name), CreditInterface, DebitInterface {

    override val maxCreditAmount: Int = 1_00_000

    override fun credit(amount: Int): Boolean {
        if (amount > 0 && amount < maxCreditAmount) {
            this.balance += amount
            return true
        }
        return false
    }

    override fun debit(amount: Int): Boolean {
        if (amount < balance) {
            balance -= amount
            return true
        }
        return false
    }



}

class FDAccount(name: String, number: Int):
    BankAccount(number, name), CreditInterface {
    override val maxCreditAmount: Int = 10_00_000

    override fun credit(amount: Int): Boolean {
        if (amount>0 && amount < maxCreditAmount){
            balance += amount
            return true
        }
        return false
    }

}

fun main() {
    val acc1 = SavingAccount(1, "john")
    acc1.credit(1000)

    val acc2 = FDAccount("merry", 2)
    acc2.credit(10000)

    val acc3 = SavingAccount(3, "robert")
    acc3.credit(2000)

    val accList = listOf(acc1, acc2, acc3)

    for (acc in accList){

        if (acc is DebitInterface){ // interface as type
            acc.debit(100)
        }
    }
}