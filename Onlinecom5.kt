/*fun main(args: Array<String>) {
   val inpuArray = arrayOf(1, 2, 4, 5, 6, 7, 3, 9)
   inpuArray.sort()
   var k = 1
   for (i in inpuArray) {
      if (i == k) {
         k++
      } else {
         println("Missing element is $k")
      }
   }
}*/



/*internal object GFG {
    // Function to get the missing number
    fun getMissingNo(a: IntArray, n: Int): Int {
        var total = 1
        for (i in 2..n + 1) {
            total += i
            total -= a[i - 2]
        }
        return total
    }

    // Driver Code
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(1, 2, 4, 5)
        val N = arr.size

        // Function call
        println(getMissingNo(arr, N))
    }
}*/

/*fun main(args: Array<String>){
    var arr = arrayOf(1,2,4,5,6,7,3,9)
    var n = arr.size
    val sum = (n+1)*(n+2)/2
    var Total = 0
    for(i in arr){
        Total+=i
    }
    var result = sum - Total
    println("The missed element is $result")
}*/

/*open class Animal{
    fun sound(){
        println(" Dog Sound is coming")
    }
}
class Dog : Animal(){

}
fun main(args: Array<String>){
    val obj = Dog()
    obj.sound()
}*/

interface Vehicle {
    var name : String
    var medium : String

    fun runsWhere() {
        println("The vehicle, $name, runs in $medium")
    }

    fun howItRuns()
}

class Aeroplane : Vehicle {
    override var name:String = "Aeroplane"
    override var medium: String = "air"

    override fun howItRuns() {
        println("$name flies based on buoyancy force.")
    }
}

fun main(args: Array<String>) {
    var vehicle1 = Aeroplane()
    vehicle1.runsWhere()
    vehicle1.howItRuns()
}

