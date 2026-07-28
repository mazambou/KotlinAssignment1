package com.example.kotlinassignment1

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.util.Log
//---------------------------------------------------------------
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // A. Sum integers from 1 to a specified maximum
        Log.d("Assignment1", "Sum to 10 = ${sumUpTo(10)}")

        // B. Iterative factorial
        Log.d("Assignment1", "Factorial of 5 = ${factorial(5)}")

        // C. Lambda factorial
        Log.d("Assignment1", "Lambda factorial of 5 = ${factorialLambda(5)}")

        // D. Recursive factorial
        Log.d("Assignment1", "Recursive factorial of 5 = ${factorialRecursive(5)}")
    }
}
//------------------------------------------------------------

 // A. function that adds (sums) integers starting at 1 up to a specified maximum

fun sumUpTo(max: Int): Int {
    var sum = 0

    for (number in 1..max) {
        sum += number
    }

    return sum
}


 // B. iterative function that finds the factorial of a specified integer.

fun factorial(number: Int): Long {

    var result = 1L

    for (i in 1..number) {
        result *= i
    }

    return result
}


 //C. function in B. using a lambda expression.

val factorialLambda: (Int) -> Long = { number ->

    var result = 1L

    for (i in 1..number) {
        result *= i
    }

    result
}


 //D. Recursive factorial function.

fun factorialRecursive(number: Int): Long {

    return if (number <= 1)
        1
    else
        number * factorialRecursive(number - 1)
}