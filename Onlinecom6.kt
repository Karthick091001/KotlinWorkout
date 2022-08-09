/*fun main(args : Array<String>) {  
var i = 5
    while(i<=15){
        println("given numbers" + i)
        i++
    }
}*/

/*fun main(args : Array<String>) {  
var i = 5
    do{
        println(i)
        i++
    }while(i<=10);
}*/

/*fun main(args: Array<String>) {  
    for (i in 1..5) {  
        if (i == 2) {  
            break  
        }  
        println(i)  
    }  
}*/

/*fun main(args: Array<String>) {
   var i = 0;
   while (i++ < 100) {
      println(i)
      if( i == 90 ){
         break
      }

   }
}*/

/*fun main(args: Array<String>){  
    var number = 25  
    var result = Math.sqrt(number.toDouble())  
    print("Square root of $number is $result")  
}*/

/*fun main(args: Array<String>){  
   val result = sum(5, 6)  
    print(result)  
}  
fun sum(number1: Int, number2:Int): Int{  
    //val add = number1+number2  
    return number1 + number2  
}*/

/*import java.util.Scanner

fun main(args: Array<String>) {

    // Creates a reader instance which takes
    // input from standard input - keyboard
    val reader = Scanner(System.`in`)
    print("Enter a number: ")

    // nextInt() reads the next integer from the keyboard
    var integer:Int = reader.nextInt()

    // println() prints the following line to the output screen
    println("You entered: $integer")
}*/

/*fun main(args: Array<String>) {  
    run(3, 'k')  
}  
fun run(num:Int= 5, latter: Char ='x'){  
    print("parameter in function definition $num and $latter")  
} */

/*fun main(args: Array<String>) {  
    run(num = 8, latter='a')  
}  
fun run(num:Int= 5, latter: Char ='x'){  
    print("parameter in function definition $num and $latter")  
} */

fun factorial(a:Int):Int{
    val result:Int
    
    if( a <= 1){
       result = a
    }else{
       result = a*factorial(a-1)
    }
    
    return result
 }
 
 fun main(args: Array<String>) {
    val a = 4
    
    val result = factorial(a)
    println( result )
    
 }
 