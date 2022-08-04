 /*data class Book(val name: String, val publisher: String, var reviewScore: Int)

fun main(args: Array<String>) {

   val book = Book("Kotlin", "Tutorials Point", 10)
   
   println("Name = ${book.name}")
   println("Publisher = ${book.publisher}")
   println("Score = ${book.reviewScore}")
	  
}*/

/*data class Book(val name: String, val publisher: String, var reviewScore: Int)

fun main(args: Array<String>) {

   val original = Book("Kotlin", "Tutorials Point", 10)
   
   val copied = original.copy(reviewScore=5, publisher="java")
   
   println("Original Book")
   println("Name = ${original.name}")
   println("Publisher = ${original.publisher}")
   println("Score = ${original.reviewScore}")
   
   println("Copied Book")
   println("Name = ${copied.name}")
   println("Publisher = ${copied.publisher}")
   println("Score = ${copied.reviewScore}")
	
}*/

/*data class Book(val name: String, val publisher: String, var reviewScore: Int)

fun main(args: Array<String>) {

   var book = Book("Kotlin", "Tutorials Point", 10)

   
   println(book.toString())
	
}*/

/*data class Product(var item: String, var price: Int)  
  
fun main(agrs: Array<String>) {  
val p = Product("laptop", 25000)  
println(p)  
}*/

 /*class Product(val item: String, val price: Int)  
  
fun main(agrs: Array<String>) {  
val p1 = Product("laptop", 25000)  
val p2 = Product("laptop", 25000)  
println(p1==p2)  
println(p1.equals(p2))  
} */

/*data class Product(val item: String, val price: Int)  
  
fun main(agrs: Array<String>) {  
val p1 = Product("laptop", 25000)  
val p2 = Product("laptop", 25000)  
println(p1==p2)  
println(p1.equals(p2))  
}*/

/*data class Book(val name: String, val publisher: String, var reviewScore: Int)

fun main(args: Array<String>) {

   val original = Book("Kotlin", "Tutorials Point", 10)
   
   val copy1 = original.copy(reviewScore=5)
   val copy2 = original.copy(reviewScore=9)
   
   println("Original Hashcode = ${original.hashCode()}")
   println("Copy1 Hashcode = ${copy1.hashCode()}")
   println("Copy2 Hashcode = ${copy2.hashCode()}")
   
   if( copy1.equals(copy2)){
      println("Copy1 is equal to Copy2.")
   }else{
      println("Copy1 is not equal to Copy2.")
   }
}*/

/*data class Book(val name: String, val publisher: String, var reviewScore: Int)

fun main(args: Array<String>) {

   val book = Book("Kotlin", "Tutorials Point", 10)
   
   val( name, publisher,reviewScore ) = book
   
   println("Name = $name")
   println("Publisher = $publisher")
   println("Score = $reviewScore")
	  
}*/

/*data class Product(var item: String = "laptop", var price: Int = 25000)  
  
fun main(agrs: Array<String>) {  
val p1 = Product(price = 20000)  
println(p1)  
}*/

/*data class Product(var item: String, var price: Int)  
  
fun main(agrs: Array<String>) {  
val p1 = Product("laptop", 25000)  
println("p1 object contain data : $p1")  
val p2 = p1.copy()  
println("p2 copied object contains default data of p1: $p2")  
val p3 = p1.copy(price = 20000)  
println("p3 contain altered data of p1 : $p3")  
} */

/*sealed class Shape{  
    class Circle(var radius: Float): Shape()  
    class Square(var length: Int): Shape()  
    class Rectangle(var length: Int, var breadth: Int): Shape()  
  //  object NotAShape : Shape()  
}  
  
fun eval(e: Shape) =  
        when (e) {  
            is Shape.Circle ->println("Circle area is ${3.14*e.radius*e.radius}")  
            is Shape.Square ->println("Square area is ${e.length*e.length}")  
            is Shape.Rectangle ->println("Rectagle area is ${e.length*e.breadth}")  
            //else -> "else case is not require as all case is covered above"  
          //  Shape.NotAShape ->Double.NaN  
        }  
fun main(args: Array<String>) {  
  
var circle = Shape.Circle(5.0f)  
var square = Shape.Square(5)  
var rectangle = Shape.Rectangle(4,5)  
  
eval(circle)  
eval(square)  
eval(rectangle)  
} */

/*sealed class MyExample {
    class OP1 : MyExample() // MyExmaple class can be of two types only
    class OP2 : MyExample()
 }
 fun main(args: Array<String>) {
    val obj: MyExample = MyExample.OP2() 
    
    val output = when (obj) { // defining the object of the class depending on the inuputs 
       is MyExample.OP1 -> "Option One has been chosen"
       is MyExample.OP2 -> "option Two has been chosen"
    }
    
    println(output)
 }*/

 
/*class Student{
    fun isPassed(mark: Int): Boolean{
        return mark>40
    }
}
fun Student.isExcellent(mark: Int): Boolean{
    return mark > 90
}
fun main(args: Array<String>){
    val student = Student()
    val passingStatus = student.isPassed(55)
    println("student passing status is $passingStatus")

    val excellentStatus = student.isExcellent(95)
    println("student excellent status is $excellentStatus")
}*/

/*class Student{
    fun isPassed(mark: Int): Boolean{
        return mark>40
    }
}
fun Student.isExcellent(mark: Int): Boolean{
    return mark > 90
}
fun main(args: Array<String>){
    val student = Student()
    val passingStatus = student.isPassed(55)
    println("student passing status is $passingStatus")

    val excellentStatus = student.isExcellent(95)
    println("student excellent status is $excellentStatus")
} */

/*class MyClass {
    companion object {
        fun create():String{
            return "calls create method of companion object"
        }
    }
}
fun main(args: Array<String>){
    val instance = MyClass.create()
}*/

/*class MyClass {
    companion object {
        fun create(): String {
            return "calling create method of companion object"
        }
    }
}
fun MyClass.Companion.helloWorld() {
    println("executing extension of companion object")
}
fun main(args: Array<String>) {
    MyClass.helloWorld() //extension function declared upon the companion object
}*/

/*fun MutableList<Int>.swap(index1: Int, index2: Int):MutableList<Int> {
val tmp = this[index1] // 'this' represents to the list
    this[index1] = this[index2]
    this[index2] = tmp
    return this
}
fun main(args: Array<String>) {
val list = mutableListOf(5,10,15)
println("before swapping the list :$list")
val result = list.swap(0, 2)
println("after swapping the list :$result")
}*/

funMutableList<Int>?.swap(index1: Int, index2: Int): Any {
    if (this == null) return "null"
    else  {
        val tmp = this[index1] // 'this' represents to the list
        this[index1] = this[index2]
        this[index2] = tmp
        return this
    }
}
fun main(args: Array<String>) {
    val list = mutableListOf(5,10,15)
    println("before swapping the list :$list")
    val result = list.swap(0, 2)
    println("after swapping the list :$result")
}
 