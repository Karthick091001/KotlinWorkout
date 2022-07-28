/*fun main(args: Array<String>){  
    var number = 25  
    var result= Math.sqrt (number.toDouble()) 
    print("Square root of $number is $result")  
}*/  

/*fun main(args: Array<String>){  
    sum()  
    print("code after sum")  
}  
fun sum(){  
    var num1 =5  
    var num2 = 6  
    println("sum = "+(num1+num2))  
} */

/*fun main(args: Array<String>){  
    val result = sum(5, 6)  
     print(result)  
 }  
 fun sum(number1: Int, number2:Int): Int{  
     val add = number1+number2  
     return add  
 }*/  

 fun main(args: Array<String>) {  
    val number = 5  
    val result: Long  
    result = factorial(number)  
    println("Factorial of $number = $result")  
}  
  
fun factorial(n: Int): Long {  
    return if(n == 1){  
          n.toLong()  
    }  
    else{  
        n*factorial(n-1)  
    }  
}  
