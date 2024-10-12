package com.example.praktikum1

// Conditional Expression
// Conditional Expression adalah ekspresi yang mengembalikan nilai berdasarkan kondisi tertentu
// Conditional expresion menggunakan if-else, when, dan try-catch
fun ConditionalStatment(){
    println("=== Conditional Expression")

// If-Else
    val number = 10
    if (number > 0){
        println("Positive Number")
    }else {
        println("Negative Number")
    }

fun Perulangan() {
    println()
    println("=== Perulangan ===")

    for (i in 1..5) {
        println("Perulangan ke-$i")
    }

    val cars = listOf("Bmw", "Toyota", "Honda", "Audi")
    for (car in cars) {
        println("Car type: $car")
    }

    var x = 1
    while (x <= 5) {
        println("Perulangan ke-$x")
        x++
    }

    var y = 1
    do{
        println("Perulangan ke-$y")
        y++
    } while (y <= 5)
}



