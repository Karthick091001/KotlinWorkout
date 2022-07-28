/*fun main(args: Array<String>){
    var a=25
    var b=30
    var result=if(a>b){
        "$a is greater than $b"
    } else{
        "$a is smaller than $b"
    }
    println(result)
    }*/

    /*fun main(args: Array<String>){
        val k=10
        val result = if(k>20){
        "$k is greatest"
        } 
        else if(k<20){
            "$k is smallest"
        } 
        else{
            "$k is neutral"
        }
        println(result)
    }*/

    /*fun main(args: Array<String>){
        val a=10
        val b=20
        val c=30
        val result= if(a < b){
            val reresult=if(a > c){
                a
            }else{
                c
            }
            "print the number"+ reresult
            }else if(b > c){
                "print the number"+b
            }else{
                "print the number"+c
            }
            println("$result")
        }*/

        /*fun main(args:Array<String>){
            var num=3
            var numgiven=when(num){
                1->"One"
                2->"Two"
                3->"Three"
                4->"Four"
                5->"Five"
                else->"Invalid given Num"
            }
        println("You give $numgiven")
        }*/

        /*fun main(args:Array<String>){
            var num=2
            when(num){
                1->println("one")
                2->println("two")
                3->println("three")
                else->println("invalid")
            }
        
        }*/

        /*fun main(args:Array<String>){
            val K=2
            when(K){
                1->{
                    println("FOOD LOVER")
                println("Eating Always")
                }
                2->
                {println("Sport Lover")
                println("Always playing")
            }
                else->println("none")
            }
        } */

        /*fun main(args: Array<String>){  
            var number = 3  
            when(number) {  
                1, 4, 5, 6 ->  
                    println("Loved to watch Cricket")  
                7, 8, 9 ->  
                    println("Loved to watch Football")  
                10, 11 ->  
                    println("Loved to watch Movies")  
                12, 3, 2 ->  
                    println("Loved to watch Adventures")  
                else -> println("null")  
            }  
        }*/

        /*fun main(args: Array<String>){  
            var number = 7  
            when(number) {  
                in 1..5 -> println("MASTER")  
                in 6..10 -> println("BEAST")  
                else -> println("none of the above")  
            }  
        }*/ 

       /*fun main(args : Array<String>) {  
            val marks = arrayOf(80,85,60,90,70)  
            for(item in marks){  
                println(item)  
            }  
        } */

        /*fun main(args : Array<String>) {  
     
            val marks = arrayOf(80,85,60,90,70)  
            for(K in marks.indices)  
               println("marks[$K]: "+ marks[K])  
        }*/
        
        /*fun main(args: Array<String>) {
        print("given numbers=")
        for(k in 1..10)print(k) 
        println()
            print("given numbers in reverse")
            for(k in 10..1)print(k)
            println()
            print("reverse priting")
            for(k in 10 downTo 1)print(k) 
                println()
                print("reverse pritning ")
            for(k in 10 downTo 4)print(k) 
                println()
                print("prnt the numbers at gap")
                for(k in 1..10 step 2)print(k)
                println()
                print("gapwise")
                for(k in 10 downTo 1 step 2)print(k)
                println()
        }*/


/*fun add(){
    var a=10
    var b=15
   println("add = "+(a+b))
}
fun main(args:Array<String>){
    add()
    print("Result after adding")
}*/

/*fun add(num1: Int,num2: Int):Int{
    var plus=num1+num2
    return plus
}
fun main(args:Array<String>){
   val aadd= add(10,12)
   print(aadd)
}*/

/*var count = 0  
fun rec(){  
    count++;  
    if(count<=10){  
        println("hello "+count);  
        rec();  
    }  
}  
fun main(args: Array<String>) {  
    rec();  
}*/

/*fun main(args: Array<String>) {  
    var number = 10.toLong()  
    var result = recursiveSum(number)  
    println("sun of upto $number number = $result")  
}  
tailrec fun recursiveSum(n: Long, semiresult: Long = 0) : Long {  
    return if (n <= 0) {  
        semiresult  
    } else {  
        recursiveSum( (n - 1), n+semiresult)  
    }  
} */ 

/*fun main(args: Array<String>) {  
    run(2,'b')  
}  
fun run(num:Int= 5, latter: Char ='x'){  
    print("parameter in function definition $num and $latter")  
}*/

/*fun main(args: Array<String>) {  
    run(latter='a')  
}  
fun run(num:Int= 5, latter:Char = 'v'){  
    print("parameter in function definition $num and $latter")  
} */

/*fun myFun(org: String,portal: String, fn: (String,String) -> String): Unit {  
    val result = fn(org,portal)  
    println(result)  
}  
  
fun main(args: Array<String>){  
    val fn:(String,String)->String={org,portal->"$org develop $portal"}  
    myFun("sssit.org","javatpoint.com",fn)  
} */

/*fun main(args:Array<String>){
    val square:(Int)->Int = {numm->
    numm*numm
}
println(square(5))
}*/

fun myFun(org: String,portal: String, fn: (String,String) -> String): Unit {  
    val result = fn(org,portal)  
    println(result)  
}  
  
fun main(args: Array<String>){  
    val fn:(String,String)->String={org,portal->"$org develop $portal"}  
    myFun("sssit.org","javatpoint.com",fn)  
}  




                 
        