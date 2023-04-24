fun main() {
    //STAGE 1

    println("Hello! My name is DICT_Bot. What is your name?")
    val name = readLine()
    println("Nice to meet you, $name!")

    //STAGE 2

    println("Let me guess your age.")
    println("Please enter the remainder when your age is divided by 3:")
    val remainder3 = readLine()?.toInt() ?: 0

    println("Please enter the remainder when your age is divided by 5:")
    val remainder5 = readLine()?.toInt() ?: 0

    println("Please enter the remainder when your age is divided by 7:")
    val remainder7 = readLine()?.toInt() ?: 0

    val age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
    println("I think you are $age years old!")

    //STAGE 3

    println("Please enter a positive number:")
    val num = readLine()?.toIntOrNull()

    if (num == null || num < 0) {
        println("Invalid input. Please enter a positive number.")
        return
    }

    for (i in 0..num) {
        println(i)
    }

    //STAGE 4

    var correct = false
    while (!correct) {
        println("What is the capital of Canada?")
        println("1. Toronto")
        println("2. Montreal")
        println("3. Ottawa")
        println("4. Vancouver")
        val answer = readLine()?.trim()

        if (answer == "3") {
            correct = true
            println("Congratulations, you answered correctly! Have a nice day!")
        } else {
            println("Please try again.")
        }
    }
}