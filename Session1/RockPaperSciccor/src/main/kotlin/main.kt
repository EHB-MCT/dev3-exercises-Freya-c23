fun main(args: Array<String>){
    print("choose: rock, paper or scissor: ")
    val enteredString = readLine()
    while (enteredString != "stop"){
        print("choose: rock, paper or scissor: ")
        val enteredString = readLine()

        val options = arrayOf("rock","paper","scissor")
        var comp = options.random()
        println("computer says: $comp")

        if (comp == enteredString){
            println("Tie")
        } else if(comp == "rock" && enteredString == "scissor"){
            println("You lose")
        }else if(comp == "rock" && enteredString == "paper"){
            println("You win")
        }else if(comp == "paper" && enteredString == "scissor"){
            println("You win")
        }else if(comp == "paper" && enteredString == "rock"){
            println("You lose")
        }else if(comp == "scissor" && enteredString == "paper"){
            println("You lose")
        }else if(comp == "scissor" && enteredString == "rock"){
            println("You win")
        }
    }
}