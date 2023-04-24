fun main() {

    val scan = java.util.Scanner(System.`in`)
    println("Wants to start Coffee Machine Y or N?")
    val confirmation = scan.next()
    if (confirmation == "Y" || confirmation == "y") {
        println("""
        Starting to make a coffee
        Grinding coffee beans
        Boiling water
        Mixing boiled water with crushed coffee beans
        Pouring coffee into the cup
        Pouring some milk into the cup
        Coffee Machine is ready!
        """.trimIndent()
        )
        val start = CoffeeMachine()
        start.start()
    } else {
        println("Shutting Down...")
    }
}

//main class of operation of the coffee machine
class CoffeeMachine {

    private var amountOfWater = 400
    private var amountOfMilk = 540
    private var amountOfCoffeeBeans = 120
    private var amountOfCups = 9
    private var amountOfMoney = 550
    private var status = true

    //menu
    fun start() {

        val scan = java.util.Scanner(System.`in`)
        while (status) {
            println("Write action (buy, fill, take, remaining, exit):")
            when (scan.next()) {
                "buy" -> buyCoffee()
                "fill" -> fillIngredients()
                "take" -> takeMoney()
                "remaining" -> getIngredients()
                "exit" -> status = false
            }
        }
    }

    //ingredientStatus
    private fun getIngredients() {
        println("\n| Current Status: |")
        println("--- Available Water on coffee machine: $amountOfWater")
        println("--- Available Milk on coffee machine: $amountOfMilk")
        println("--- Available Coffee Beans on coffee machine: $amountOfCoffeeBeans")
        println("--- Available Cups on coffee machine: $amountOfCups")
        println("--- Available Money on coffee machine: $amountOfMoney")
    }

    //coffeeShoppingMenu
    private fun buyCoffee() {
        val scan = java.util.Scanner(System.`in`)
        println("What do you want to buy?\n--- 1 - Espresso\n--- 2 - Latte\n--- 3 - Cappuccino\n--- 0 - Back to menu")
        val num = scan.nextInt()
        if (num == 0) {
            start()
        }
        if (num == 1) {
            espresso()
        }
        if (num == 2) {
            latte()
        }
        if (num == 3) {
            cappuccino()
        }
    }

    //replenishmentOfIngredients
    private fun fillIngredients() {
        val scan = java.util.Scanner(System.`in`)
        println("Write how many ml of water you want to add:")
        val addWater = scan.nextInt()
        amountOfWater += addWater
        println("Write how many ml of milk you want to add:")
        val addMilk = scan.nextInt()
        amountOfMilk += addMilk
        println("Write how many grams of coffee beans you want to add:")
        val addCoffeeBeans = scan.nextInt()
        amountOfCoffeeBeans += addCoffeeBeans
        println("Write how many cups of coffee you want to add:")
        val addCups = scan.nextInt()
        amountOfCups += addCups
        getIngredients()
        start()
    }

    //withdrawing money from a machine
    private fun takeMoney() {
        println("I gave you $amountOfMoney")
        amountOfMoney -= amountOfMoney
        start()
    }

    //Espresso
    private fun espresso() {
        if (amountOfWater >= 250 && amountOfCoffeeBeans >= 16 && amountOfCups >= 1) {
            amountOfMoney += 4
            println("\nMaking Espresso...")
            println("Taking 1 Cup.")
            amountOfCups -= 1
            println("Taking 16gm of Coffee Beans.")
            amountOfCoffeeBeans -= 16
            println("Taking 250ml of Water.")
            amountOfWater -= 250
            println("Your Espresso if READY!")
        } else {
            println("Available Cups $amountOfCups")
            println("Available Water(ml) $amountOfWater")
            println("Available Milk(ml) $amountOfMilk")
            println("Available Coffee Power(Gram) $amountOfCoffeeBeans")
            println("Some Items Are Not Available, Please Fill before Making Coffee.")
        }
        start()
    }

    //Latte
    private fun latte() {
        if (amountOfWater >= 350 && amountOfMilk >= 75 && amountOfCoffeeBeans >= 20) {
            amountOfMoney += 7
            println("\nMaking Latte...")
            println("Taking 1 Cup.")
            amountOfCups -= 1
            println("Taking 350ml of Water.")
            amountOfWater -= 350
            println("Taking 75ml of Milk.")
            amountOfMilk -= 75
            println("Taking 20gm of Coffee Beans.")
            amountOfCoffeeBeans -= 20
            println("Your Espresso is READY!")
        } else {
            println("Available Cups $amountOfCups")
            println("Available Water(ml) $amountOfWater")
            println("Available Milk(ml) $amountOfMilk")
            println("Available Coffee Power(Gram) $amountOfCoffeeBeans")
            println("Some Items Are Not Available, Please Fill before Making Coffee.")
        }
        start()
    }

    //Cappuccino
    private fun cappuccino() {
        if (amountOfWater >= 200 && amountOfMilk >= 100 && amountOfCoffeeBeans >= 12) {
            amountOfMoney += 6
            println("\nMaking Espresso...")
            println("Taking 1 Cup.")
            amountOfCups -= 1
            println("Taking 200ml of Water.")
            amountOfWater -= 200
            println("Taking 100ml of Milk.")
            amountOfMilk -= 100
            println("Taking 12gm of Coffee Beans.")
            amountOfCoffeeBeans -= 12
            println("Your Espresso is READY!")
        } else {
            println("Available Cups $amountOfCups")
            println("Available Water(ml) $amountOfWater")
            println("Available Milk(ml) $amountOfMilk")
            println("Available Coffee Power(Gram) $amountOfCoffeeBeans")
            println("Some Items Are Not Available, Please Fill before Making Coffee.")
        }
        start()
    }
}