import java.util.*
import kotlin.collections.ArrayList

/* 1-st 2-nd stage */

fun evenOdd(num: Int) {

    println("====== 1-2 ======")
    if (num % 2 == 0) {
        println("Even")
        println(num * 4)
    } else {
        println("Odd")
        println(num * 5)
    }
}

/* 3-d stage */

fun exercise3(num: Int) {

    println("====== 3 ======")
    if (num > 0) {
        println(num * (-1))
    } else {
        println(num)
    }
}

/* 4-th stage */

fun yearsOld(yearOfBirth: Int): Int {

    println("====== 4 ======")
    return java.time.Year.now().value - yearOfBirth
}

/* 5-th stage */

fun smallestNumInTheArr(numbers: Array<Int>) {

    println("====== 5 ======")
    var lowNum = numbers[1]
    for (i in numbers) {
        if (i < lowNum) {
            lowNum = i
        }
    }
    println(lowNum)

}

/* 6-th stage */

fun twoBiggestNumInTheArr(list: Array<Int>):ArrayList<Int> {

    println("====== 6 ======")
    val a = list.toMutableList() as ArrayList<Int>
    val b = ArrayList<Int>()
    b.add(a.max())
    a.remove(a.max())
    b.add(a.max())
    return b
}

/* 7-th stage */

fun sumPositiveAndNegativeNum(numbers: Array<Int>) {

    println("====== 7 ======")
    var numNegative = 0
    var numPositive = 0
    for (i in numbers) {
        if (i > 0) {
            numPositive += i
        } else {
            numNegative += i
        }
    }
    val numbersAns: Array<Int> = arrayOf(numPositive, numNegative)
    println(numbersAns.contentToString())
}

/* 8-th stage */

fun numberOfVowels(letters: Array<String>) {

    println("====== 8 ======")
    val vowels: Array<String> = arrayOf("a", "e", "i", "o", "u", "y")
    var numVowels = 0
    for (i in letters) {
        for (e in vowels) {
            if (i.equals(e)) {
                numVowels++
            }
        }
    }
    println(numVowels)
}

/* 9-th stage */

fun middleCharacters(string: String):String {

    println("====== 9 ======")
    val str : String = if (string.length % 2 == 0){
        string[string.length/2 - 1]+""+ string[string.length/2]
    }else{
        ""+string[string.length/2]
    }
    return str
}

/* 10-th stage */

fun multiplicationTable(N : Int) {

    println("====== 10 ======")
    val a = Array(N){IntArray(N){0}}
    var count: Int = 1
    for (i in a.indices){
        for (j in a[0].indices){
            a[i][j] = count * (j + 1)
        }
        count++
    }
    println(a.contentDeepToString())
}

/* Main */

fun main() {
    // -------1-------
    val result1and2 = evenOdd(4)
    println(result1and2)
    // -------3-------
    val result3 = exercise3(4)
    println(result3)
    // -------4-------
    val result4 = yearsOld(2002)
    println(result4)
    // -------5-------
    val arr: Array<Int> = arrayOf(34,15,88,2)
    val result5 = smallestNumInTheArr(arr)
    println(result5)
    // -------6-------
    val arr1: Array<Int> = arrayOf(34,15,88,2,123,22)
    val result6 = twoBiggestNumInTheArr(arr1)
    println(result6)
    // -------7-------
    val arr2: Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10,-11,-12,-13,-14,-15)
    val result7 = sumPositiveAndNegativeNum(arr2)
    println(result7)
    // -------8-------
    val arr3: Array<String> = arrayOf("a","b","c","s","e","y","u","g")
    val result8 = numberOfVowels(arr3)
    println(result8)
    // -------9-------
    val result9 = middleCharacters("student")
    println(result9)
    // -------10-------
    val result10 = multiplicationTable(3)
    println(result10)
}