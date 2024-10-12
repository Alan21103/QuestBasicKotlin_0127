package com.example.praktikum1

fun nullSafety() {
// neverNull has String type
    var neverNull: String = "This can't be null"

// Throws a complier error
// neverNull = null

// nullable has nullable String type
    var nullable: String? = "You can keep a null here"
// This is OK
    nullable = null

// Check for null in conditions
    if (neverNull == null) {
        println("InferredNoNull is null")
    } else {
        println("inferredNoNull is not null")
    }

// Safe call operator
    println(neverNull.length) // 18
    println(nullable?.length) // null

    // notNull doesn't accept null values
    fun strLength(notNull: String): Int{
        return notNull.length
    }

    println(strLength(neverNull)) // 18

}

fun main() {
    nullSafety()
}