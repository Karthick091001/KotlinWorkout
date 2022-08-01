/*fun main(args: Array<String>) {
 inlinefun({println("calling the inline function")})   
}
inline fun inlinefun(myfun:()->Unit){
myfun()
println("code inline")
}*/

/*inline fun inlinefun1(myfun:( )-> Unit,nxtfun:()-> Unit){
    myfun()
    nxtfun()
    println("code is printing")
}

fun main(args:Array<String>){
    inlinefun1({println("code is inline printing")
return}, {println("inline function")})
}*/

/*fun main(args: Array<String>) {  
    inlineFunction({ println("calling inline functions")  
            return // compile time error  
    },{ println("next parameter in inline functions")})  
    }  
      
    inline fun inlineFunction(crossline myFun: () -> Unit, nxtFun: () -> Unit) {  
    myFun()  
    nxtFun()  
        print("code inside inline function")  
    } */
    
    /*fun main(args:Array<String>){
        var myArray5: IntArray = intArrayOf(5,10,20,12,15)  
         for (k in myArray5) {
            println(k)
            
         }
    }*/

    /*fun main(args:Array<String>){
        var a = arrayOf(1,5,3,5,2,8)
        var b = arrayOf(11,25,35,40,52,60)
         a.set(0,9)
         a[4] = 4
         b.set(2,44)
         b[3] = 55
        for(i in a){
            println(i)
        }
        println()
        for(j in b){
            println(j)
        }
    }*/

    /*fun main(args: Array<String>) {  
        val a = arrayOf(1,2,3,4)  
        val b = arrayOf<Long>(11,12,13,14)  
            a.set(0,5)  
            a[2] = 6  
          
            b.set(2,10)  
            b[3] = 8  
          
            for(element in a){  
        println(element)  
            }  
        println()  
            for(element in b){  
        println(element)  
            }  
        }*/  

        
    /*fun main(args:Array<String>){
        var a = arrayOf(1,5,3,5,2,8)
        var b = arrayOf(11,25,35,40,52,60)
        println(a.get(2))
        println(a[4])  
        println()
        println(b.get(5))
        println(b[2])
    } */

    /*fun main(args: Array<String>){
        var k = Array<Int>(10){5}
        for(element in k){
            println(element)
        }
    }*/

    /*fun main(args: Array<String>){
        var k = Array<Int>(10){5}
        k[8]=25
        k[6]=20
        for(element in k){
            println(element)
        }
    }*/

 /*  fun main(args: Array<String>){  
val name = arrayOf<String>("Ajay","Prakesh","Michel","John","Sumit")  
var myArray2 = arrayOf<Int>(1,10,4,6,15)  
var myArray3 = arrayOf(5,10,20,12,15)  
var myArray4= arrayOf(1,10,4, "Ajay","Prakesh")  
var myArray5: IntArray = intArrayOf(5,10,20,12,15)  
  
    for(element in name){  
println(element)  
    }  
  
println()  
    for(element in myArray2){  
println(element)  
    }  
println()  
    for(element in myArray3){  
println(element)  
    }  
println()  
    for(element in myArray4){  
println(element)  
    }  
println()  
    for(element in myArray5){  
println(element)  
    }  
  
}*/ 

/*fun main(args: Array<String>){  
    var myArray5: IntArray = intArrayOf(5,10,20,12,15,25,45)  
      
        myArray5[8]=18 // ArrayIndexOutOfBoundsException  
        for(element in myArray5){  
    println(element)    
        }  
    }  */

    /*fun main(args: Array<String>){  
        var myArray5: IntArray = intArrayOf(5,10,20,12,15,26,35,45)  
          
            for (index in 0..6){  
        println(myArray5[index])  
            }  
        println()  
            for (index in 0..myArray5.size-1){  
        println(myArray5[index])  
            }  
        }*/

        /*fun main(args: Array<String>) {  
  
            val k = "KARTHICK,M"  
            println(k[0])  
            println(k[8])  
            println(k[k.length-1])  
            } */
            
            /*fun main(args: Array<String>) {  
                val i =10  
                    print("i = $i")//i=10  
                }*/

                /*fun main(args: Array<String>){
                    var k = "KARTHICK"
                    println("$k is a string with a length of ${k.length}")
                }*/

                /*fun main(args: Array<String>) {  
                    val a = 10  
                    val b = 5  
                      
                    val myString = """value $a  
                            |is greater than value $b  
                        """.trimMargin()  
                    println("${myString.trimMargin()}")  
                    }*/
                    
                    /*fun main(args: Array<String>) {  
  
                        val text = """Kotlin is official language  
                                |announce by Google for  
                                |android application development  
                            """.trimMargin()  
                          
                        println(text)  
                        }*/
                        
                        /*fun main(args: Array<String>) {  
  
                            val text = """Kotlin is official language  
                                    #announce by Google for  
                                    #android application development  
                                """.trimMargin("#")  
                            println(text)  
                            }*/
                            
                            /*fun main(args: Array<String>) {  
                                val str1 = "Karthick"  
                                val str2 = "Karthick"  
                                println(str1==str2) //true  
                                println(str1!=str2) //false  
                                }*/ 

                               /* fun main(args: Array<String>) {  
                                    val str1 = buildString { "string value" }  
                                    val str2 = buildString { "string value" }  
                                    println(str1===str2)  
                                    println(str1!==str2)  
                                    }   

                                    fun main(args: Array<String>){
                                        
                                    }*/

                                    fun main() {
                                        println("Hello, world!!!")
                                    }