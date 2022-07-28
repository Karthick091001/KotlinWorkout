/*fun main(args: Array<String>) {  
    var num1 = 20  
    var num2 =10  
    var result = if (num1 > num2) {  
        "$num1 is greater than $num2"  
    } else {  
        "$num1 is smaller than $num2"  
    }  
    println(result)  
}*/

/*fun main(args: Array<String>) {  
    val num = 10  
    val result = if (num > 20){  
        "$num is positive"  
    }else if(num < 20){  
        "$num is negative"  
    }else{  
        "$num is zero"  
    }  
    println(result)  
}*/ 

/*fun main(args: Array<String>) {  
    val num1 = 25  
    val num2 = 20 
    val num3 = 30  
    val result = if (num1 > num2){  
  
        val max = if(num1 > num3){  
            num1  
        }else{  
            num3  
        }  
        "body of if "+max  
    }else if(num2 > num3){  
        "body of else if"+num2  
    }else{  
        "body of else "+num3  
    }  
    println("$result")  
}*/ 

/*fun main(args: Array<String>){  
    var number = 6  
    var numberProvided = when(number) {  
        1 -> "One"  
        2 -> "Two"  
        3 -> "Three"  
        4 -> "Four"  
        5 -> "Five"  
        else -> "invalid number"  
    }  
    println("You provide $numberProvided")  
}*/  

/*fun main(args: Array<String>){  
  
    var number = 4  
    when(number) {  
        1 -> println("One")  
        2 -> println("Two")  
        3 -> println("Three")  
        4 -> println("Four")  
        5 -> println("Five")  
        else -> println("invalid number")  
    }  
  
}*/

/*fun main(args: Array<String>){  
    var number = 1  
    when(number) {  
        1 -> {  
            println("Monday")  
            println("First day of the week")  
        }  
        7 -> println("Sunday")  
        else -> println("Other days")  
    }  
} */

/*fun main(args: Array<String>){  
    var number = 8  
    when(number) {  
        3, 4, 5, 6 ->  
            println("It is summer season")  
        7, 8, 9 ->  
            println("It is rainy season")  
        10, 11 ->  
            println("It is autumn season")  
        12, 1, 2 ->  
            println("It is winter season")  
        else -> println("invalid input")  
    }  
}*/

/*fun main(args: Array<String>){  
    var number = 12 
    when(number) {  
        in 1..5 -> println("Input is provided in the range 1 to 5")  
        in 6..10 -> println("Input is provided in the range 6 to 10")  
        else -> println("none of the above")  
    }  
}*/

/*fun main(args : Array<String>) {  
    val marks = arrayOf(80,85,60,90,70)  
    for(K in marks){  
        println(K)  
    }  
}*/

/*fun main(args : Array<String>) {  
     
    val marks = arrayOf(80,85,60,90,70)  
    for(item in marks.indices)  
       println("marks[$item]: "+ marks[item])  
} */

/*fun main(args : Array<String>) {  
  
    print("for (i in 1..5) print(i) = ")  
    for (i in 1..5) print(i)  
    println()  
    print("for (i in 5..1) print(i) = ")  
    for (i in 5..1) print(i)             // prints nothing  
    println()  
    print("for (i in 5 downTo 1) print(i) = ")  
    for (i in 5 downTo 1) print(i)  
    println()  
    print("for (i in 5 downTo 2) print(i) = ")  
    for (i in 5 downTo 2) print(i)  
    println()  
    print("for (i in 1..5 step 2) print(i) = ")  
    for (i in 1..5 step 2) print(i)  
    println()  
    print("for (i in 5 downTo 1 step 2) print(i) = ")  
    for (i in 5 downTo 1 step 2) print(i)  
}*/

/*fun main(args:Array<String>){
    var k=1
    while(k<=7){
    println(k)
    k++
}
}*/

/*fun main(args: Array<String>){ 
    var k=2 
    while (k>1){  
    println("infinite loop") 
    k++
    if(k==10) 
    break
    }  
} */

/*fun main(args:Array<String>){
    var i=2
    do{
        println("number looping")
        i++
    }while(i<=12);
}*/

/*fun main(args: Array<String>) {  
    k@ for (i in 1..10) {  
        if (i == 5) {  
            break  
        }  
        println(i)  
    }  
}  */

/*fun main(args: Array<String>) {  
    loop@ for (i in 1..3) {  
        for (j in 1..3) {  
            if (i == 2)  
                break@loop
            println("i = $i and j = $j")  
              
        }  
    }  
} */

/*fun main(args: Array<String>) {  
    for (i in 1..3) {  
        println("i = $i")  
        if (i == 2) {  
            continue  
        }  
        println("this is below if")  
    }  
}*/

