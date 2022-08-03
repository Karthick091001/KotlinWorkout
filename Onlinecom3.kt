/*open class Base{  
val x = 10  
}  
class Derived: Base() {  
    fun foo() {  
println("x is equal to " + x)  
    }  
}  
fun main(args: Array<String>) {  
val derived = Derived()  
    derived.foo()   
}*/

/*open class Bird {  
    fun fly() {  
println("flying...")  
    }  
}  
class Duck: Bird() {  
    fun swim() {  
println("swimming...")  
    }  
}  
fun main(args: Array<String>) {  
val duck = Duck()  
    duck.fly()   
duck.swim()  
}*/

/*open class Employee(name: String, age: Int, salary: Float) {  
init {  
println("Name is $name.")  
println("Age is $age")  
println("Salary is $salary")  
    }  
}  
class Programmer(name: String, age: Int, salary: Float):Employee(name,age,salary){  
    fun doProgram() {  
println("programming is my passion.")  
    }  
}  
class Salesman(name: String, age: Int, salary: Float):Employee(name,age,salary){  
    fun fieldWork() {  
println("travelling is my hobby.")  
    }  
}  
fun main(args: Array<String>){  
val obj1 = Programmer("Ashu", 25, 40000f)  
    obj1.doProgram()  
val obj2 = Salesman("Ajay", 24, 30000f)  
    obj2.fieldWork()  
}*/

/*open class Patent {  
  
    constructor(name: String, id: Int) {  
println("execute super constructor $name: $id")  
    }  
}  
  
class Child: Patent {  
  
    constructor(name: String, id: Int, dept: String): super(name, id) {  
        print("execute child class constructor with property $name, $id, $dept")  
    }  
}  
fun main(args: Array<String>) {  
val child = Child("Karthick",101, "Developer")  
} */

/*open class Bird {  
    open fun fly() {  
println("Bird is flying...")  
    }  
}  
class Parrot: Bird() {  
  
}  
class Duck: Bird() {  
  
}  
fun main(args: Array<String>) {  
val p = Parrot()  
    p.fly()  
val d = Duck()  
    d.fly()  
} */

/*open class Bird {  
    open fun fly() {  
println("Bird is flying...")  
    }  
}  
class Parrot: Bird() {  
    override fun fly() {  
println("Parrot is flying...")  
    }  
}  
class Duck: Bird() {  
    override fun fly() {  
println("Duck is flying...")  
    }  
}  
fun main(args: Array<String>) {  
val p = Parrot()  
    p.fly()  
val d = Duck()  
    d.fly()  
} */

/*open class Bird {  
    open var color = "Black"  
    open fun fly() {  
println("Bird is flying...")  
    }  
}  
class Parrot: Bird() {  
    override var color = "Green"  
    override fun fly() {  
println("Parrot is flying...")  
    }  
}  
class Duck: Bird() {  
    override var color = "White"  
    override fun fly() {  
println("Duck is flying...")  
    }  
}  
fun main(args: Array<String>) {  
val p = Parrot()  
    p.fly()  
println(p.color)  
val d = Duck()  
    d.fly()  
println(d.color)  
}*/

/*open class Bird {  
    open var color = "Black"  
    open fun fly() {  
println("Bird is flying...")  
    }  
}  
interface Duck {  
     fun fly() {  
println("Duck is flying...")  
    }  
}  
class Parrot: Bird(),Duck {  
    override var color = "Green"  
    override fun fly() {  
        super<Bird>.fly()  
        super<Duck>.fly()  
println("Parrot is flying...")  
  
    }  
}  
fun main(args: Array<String>) {  
val p = Parrot()  
    p.fly()  
println(p.color)  
  
} */

/*open class Car {  
    open fun run() {  
println("Car is running..")  
    }  
}  
abstract class Honda : Car() {  
    override abstract fun run()  
}  
class City: Honda(){  
    override fun run() {  
      //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.  
println("Honda City is running..")  
    }  
}  
fun main(args: Array<String>){  
val car = Car()  
car.run()  
val city = City()  
city.run()  
} */

/*interface MyInterface  {  
var id: Int            // abstract property  
    fun absMethod():String    // abstract method  
    fun doSomthing() {  
println("MyInterface doing some work")  
    }  
}  
class InterfaceImp : MyInterface {  
    override var id: Int = 101  
    override fun absMethod(): String{  
return "Implementing abstract method.."  
    }  
}  
fun main(args: Array<String>) {  
val obj = InterfaceImp()  
println("Calling overriding id value = ${obj.id}")  
obj.doSomthing()  
println(obj.absMethod())  
}*/

/*interface MyInterface1 {  
    fun doSomthing()  
}  
interface MyInterface2 {  
    fun absMethod()  
}  
class MyClass : MyInterface1, MyInterface2 {  
    override fun doSomthing() {  
println("overriding doSomthing() of MyInterface1")  
    }  
  
    override fun absMethod() {  
println("overriding absMethod() of MyInterface2")  
    }  
}  
fun main(args: Array<String>) {  
val myClass = MyClass()  
myClass.doSomthing()  
myClass.absMethod()  
}*/

/*interface MyInterface1 {  
    fun doSomthing(){  
println("overriding doSomthing() of MyInterface1")  
    }  
}  
interface MyInterface2 {  
    fun doSomthing(){  
println("overriding doSomthing() of MyInterface2")  
    }  
}  
class MyClass : MyInterface1, MyInterface2 {  
  
}  
fun main(args: Array<String>) {  
val myClass = MyClass()  
myClass.doSomthing()  
}*/

/*interface MyInterface1 {  
    fun doSomthing() {  
println("MyInterface 1 doing some work")  
    }  
        fun absMethod()  
}  
interface MyInterface2 {  
    fun doSomthing(){  
println("MyInterface 2 doing some work")  
    }  
    fun absMethod(name: String)  
}  
class MyClass : MyInterface1, MyInterface2 {  
    override fun doSomthing() {  
        super<MyInterface2>.doSomthing()  
    }  
  
    override fun absMethod() {  
println("Implements absMethod() of MyInterface1")  
    }  
    override fun absMethod(n: String) {  
println("Implements absMethod(name) of MyInterface2 name is  $n")  
    }  
}  
fun main(args: Array<String>) {  
val myClass = MyClass()  
myClass.doSomthing()  
myClass.absMethod()  
myClass.absMethod("Ashu")  
}*/

interface MyInterface1 {  
    fun doSomthing() {  
println("MyInterface 1 doing some work")  
    }  
    fun absMethod()  
}  
  
interface MyInterface2 {  
    fun doSomthing() {  
println("MyInterface 2 doing some work")  
    }  
   fun absMethod() {  
println("MyInterface 2 absMethod")  
    }  
  
}  
  
class C : MyInterface1 {  
    override fun absMethod() {  
println("MyInterface1 absMethod implementation")  
    }  
}  
  
class D : MyInterface1, MyInterface2 {  
    override fun doSomthing() {  
        super<MyInterface1>.doSomthing()  
        super<MyInterface2>.doSomthing()  
    }  
  
    override fun absMethod() {  
  
        super<MyInterface2>.absMethod()  
    }  
}  
  
fun main(args: Array<String>) {  
val d = D()  
val c = C()  
d.doSomthing()  
d.absMethod()  
c.doSomthing()  
c.absMethod()  
}  