/*open class A() {
   private val i = 1
   
   fun doSomething(){
      println("Inside doSomething" )
      println("Value of i is $i" )
   }
}
class B : A() {
   fun printValue(){
       doSomething()
       // println("Value of i is $i" )
   }
}

fun main(args: Array<String>) {  
   val a = A()
   val b = B()
   
   b.printValue()
}*/

/*class myClass {
   // Property (data member)
   private var name: String = "Tutorialspoint.com"

   // Member function
   fun printMe() {
      print("The best Learning website - " + name)
   }
}
fun main(args: Array<String>) {
   val obj = myClass() // Create object obj of myClass class
   obj.printMe() // Call a member function using object
}*/

/*fun main(args: Array<String>) {
   val obj = Outer.Nested()

   print(obj.foo())
}
class Outer {
   class Nested {
      fun foo() = "Welcome to The TutorialsPoint.com"
   }
}*/

/*fun main(args: Array<String>) {
   val obj = Outer().Inner()

   print(obj.foo())
}
class Outer {
   private val welcomeMessage: String = "Welcome to the TutorialsPoint.com"
   inner class Inner {
      fun foo() = welcomeMessage
   }
}*/

/*fun main(args: Array<String>) {
   var programmer :Human = object:Human { // Anonymous class
      override fun think() { // overriding the think method
         print("I am an example of Anonymous Inner Class ")
      }
   }
   programmer.think()
}
interface Human {
   fun think()
}*/

/*typealias User = Triple<String, String, Int>

fun main() {
    val obj = userInfo()

    print(obj)
}

fun userInfo():User{
   return Triple("Zara","Ali",21)
}*/

/*class Person (val _name: String, val _age: Int) {
   // Member Variables
   var name: String
   var age: Int

   // Initializer Block
   init {
      this.name = _name
      this.age = _age
      println("Name = $name")
      println("Age = $age")
   }
}

fun main(args: Array<String>) {
   val person = Person("Zara", 20)
}*/

/*class Person (val _name: String, val _age: Int=20) {
   // Member Variables
   var name: String
   var age: Int

   // Initializer Block
   init {
      this.name = _name
      this.age = _age
      println("Name = $name")
      println("Age = $age")
   }
}

fun main(args: Array<String>) {
   val zara = Person("Zara")
   val nuha = Person("Nuha", 11)
}*/

/*class Person{
   // Member Variables
   var name: String
   var age: Int

   // Initializer Block
   init {
      println("Initializer Block")
   }

   // Secondary Constructor
   constructor ( _name: String, _age: Int) {
      this.name = _name
      this.age = _age
      println("Name = $name")
      println("Age = $age")
   }
}

fun main(args: Array<String>) {
   val zara = Person("Zara", 20)
}*/

/*class Person{
   // Member Variables
   var name: String
   var age: Int
   var salary:Double

   // First Secondary Constructor
   constructor ( _name: String, _age: Int) {
      this.name = _name
      this.age = _age
      this.salary = 0.00
      println("Name = $name")
      println("Age = $age")
   }

   // Second Secondary Constructor
   constructor ( _name: String, _age: Int, _salary: Double) {
      this.name = _name
      this.age = _age
      this.salary = _salary
      println("Name = $name")
      println("Age = $age")
      println("Salary = $salary")
   }
}

fun main(args: Array<String>) {
   val nuha = Person("Nuha", 12)
   val zara = Person("Zara", 20, 2000.00)
}*/

/*class myClass(name: String, id: Int) {  
val e_name: String  
var e_id: Int  
init{  
e_name = name.capitalize()  
e_id = id  
  
println("Name = ${e_name}")  
println("Id = ${e_id}")  
    }  
}  
fun main(args: Array<String>){  
val myclass = myClass ("Ashu", 101)  
  
} */

/*class myClass{  
  
    constructor(name: String, id: Int): this(name,id, "mypassword"){  
println("this executes next")  
println("Name = ${name}")  
println("Id = ${id}")  
    }  
  
    constructor(name: String, id: Int,pass: String){  
println("this executes first")  
println("Name = ${name}")  
println("Id = ${id}")  
println("Password = ${pass}")  
    }  
}  
fun main(args: Array<String>){  
val myclass = myClass ("Ashu", 101)  
  
}*/

open class Base() {  
    var a = 1 // public by default  
        private var b = 2 // private to Base class  
        protected open val c = 3  // visible to the Base and the Derived class  
        internal val d = 4 // visible inside the same module  
        protected fun e() { } // visible to the Base and the Derived class  
    }  
      de
    class Derived: Base() {  
        // a, c, d, and e() of the Base class are visible  
        // b is not visible  
        override val c = 9 // c is protected 
        //println("the given statement" +c)
    }  
      
    fun main(args: Array<String>) {  
    val base = Base()  
        // base.a and base.d are visible  
        // base.b, base.c and base.e() are not visible  
    val derived = Derived()
    
        // derived.c is not visible 
    println("the given statement" + base.a) 
    }  