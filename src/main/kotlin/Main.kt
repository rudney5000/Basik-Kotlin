import org.w3c.dom.Text
import java.awt.TextArea
import java.io.ObjectInputFilter.merge
import java.time.LocalTime
import java.util.*
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.pow

fun main(args: Array<String>) {

    //STANDARD OUTPUT
    //debutant solution
//    println("#".repeat(1))
//    println("#".repeat(2))
//    println("#".repeat(3))
//    println("#".repeat(4))
//    println("#".repeat(5))
//    println("#".repeat(6))
//    val result = println("text")
    //intermediary solution
//    for (i in 1..6) {
//        println("#".repeat(i))
//    }
//    var number = 5
//
//    repeat(2) {
//        number--
//    }
//    x = int.input()
//    repeat(0) {
//        number--
//    }
//
//    repeat(1) {
//        number--
//    }
//
//    println(number)
//
//    val scanner = Scanner(System.`in`)
//    val num1 = scanner.nextInt() // reads the first number
//    val num2 = scanner.nextInt()
//    val num3 = scanner.nextInt()
//    val num4 = scanner.nextInt() // reads the second number
//
//    println(listOf(num1,num2,num3,num4)) // prints the second number
//    // print
//

//    val twoMillion = 2_000_000L
//    println(twoMillion)
//
//    val ten: Long = 10
//    println(ten)
//
//    println(Int.MIN_VALUE)
//
//    val something = readln()
//
//    val d = something.toString()
//    val f = d.toInt()
//    val i = f.toDouble()
//
//    println(f)
//    println(i)
//    println(something.toBoolean())

//    val n: Int = 10_000 * 10_000 * 10_000
//    println("n is $n")

//    val n = readln() // it has some value
//
//    val dl = n.toDouble() // 1
//    val lg = n.toLong()   // 2
//    val bt = n.toByte()   // 3
//    val st = n.toString() // 4
//    println(dl)
//    println(lg)
//    println(bt)
//    println(st)
//    val i = 101
//    println(i.toDouble())
//
//    val d = 3.1415
//    println(d.toLong())
//    println(d.toString())
//    val s = "32"
//    println(s.toInt())
//    val n = readln()
//    val s = readln()
//    val lg = readln().toDouble()
//    val a = readln().toDouble()
//    val lt = readln().toString()
//    val a:Long = lg+lt
//    println(lt)
//    val str = "Hel" + "l" + 'o'
//    println(str)
//    println('1' + "2" + 3)
//    println("1" + '2' + 3)
//    println("1" + 2 + '3')
//
//    val spell = "abra"
//    println((spell + "cad").repeat(spell.length) + spell)
//    println("" + 9999)
//    println("9".repeat(4))
//    println("99" + "" + "99")
//
//    val a = readln().toInt()
////    val b = a\2
//    val b = readln().toInt()
//    println("$a plus $b equals ${a+b}")

//    val tata = readln().toBoolean() // true
//    val toto = readln().toBoolean() // true
//    val tate = readln().toBoolean() // true
//
//    println(tata && (!toto || tate))

//    println(readln().toBoolean()) // false
//    println(readln().toBoolean()) // false

//    println(!(readln().toBoolean() && readln().toBoolean()) || readln().toBoolean())
//    println(!(x && y
//    NOT(x AND y) OR (z).
//    !(x && y) || (z)
//    logical operators — ! (NOT), xor (exclusive OR), && (AND), and || (OR)
//    val mercedes = true
//    val red = true
//    val enoughMoney = true // suppose it is autumn now
//
//    val hiking = enoughMoney && (!mercedes || red) // true, let's go hiking!
//    println(hiking)
//    println(readln().toBoolean() || readln().toBoolean())

//    val seven = 7.0
//    val five = 5
//
//    val toShort = seven.toShort()            // line 4
//    val sum = seven + five                   // line 5
//    val difference = seven - five.toDouble() // line 6
//    val toByte = seven.toByte()              // line 7
//    val mul = seven * five

//    val d0 = 1.0
//    val f0 = 1f
//    val l0 = 30L
//
//    val d: Double = 1.0 % 10f         // Line 1
//    val f: Float = d0.toLong() + 1.0  // Line 2
//    val l: Long = f0.toInt() + 4      // Line 3
//    val n: Int = l0.toByte() + 2      // Line 4
//    val b0: Byte = 2
//    val s0: Short = 10
//    val n0: Int = 5
//    val l0: Long = 14
//    val f0: Float = 11.4f
//
//    val b: Byte = 5
//    val s: Short = 2 + b0
//    val n: Int = s0.toByte() + 2
//    val l: Long = n0 + 4
//    val f: Float = l0.toFloat() + 1
//    val d: Double = f0 / 1


//    var number = readln().toInt()
//    var num = 0
//    num = Math.abs(number % 10);
//    println(num)
//    while (number != 0){
//        num = Math.abs(number % 10)
//        number /= 10
//    }
//    println(num)
//
//    println(readln().first())

//    val yourApples: UInt = 5u
//    val friendsApples: UInt = 7u
//    println(yourApples + friendsApples)
//
//    // do not change the code below
//    println("${yourApples::class.simpleName}")
////    println("${friendsApples::class.simpleName}")
//    var N = readln().toLong()
//    var K = readln().toLong()
////    var a = K/(N*2)
//    println( K || N )
//
//    println((N * K) / (N + K))
//    Scanner scanner = new Scanner(System.in);
//    int n = scanner.nextInt();
//    int k = scanner.nextInt();
//    System.out.println(k/n);
//    val secret1 = -1L
//    val x = 10 % 3 + 7 / 2 / 2
//    val y = secret1 * x + 3
//    println(y - x)
//
//    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
//    val hours = (totalSeconds / 3600) % 24;
//    val minutes = (totalSeconds % 3600) / 60;
//    val seconds = totalSeconds % 60;
//    val M = totalSeconds % 60;
//    val H = totalSeconds / 60;
//    val S = totalSeconds % 60;
//    val C = H / 60

//    val timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
//    println(timeString)
//    println("$hours:$minutes:$seconds")
//    println(String.format("%02d:%02d:%02d", C, M, S))
//    val num = readln().toInt()
//    if (num < 10) {
//        println("true")
//    }else{
//        println("false")
//    }

//    val scanner = Scanner(System.`in`)
//
//    val a = scanner.nextInt()
//    val b = scanner.nextInt()
//    val c = scanner.nextInt()
//
//    val res = a >= b && b != c
//
//    println(res)

//    val num = readln().toInt()
//    val num1 = readln().toInt()
//    val num2 = readln().toInt()
//    val res = (num2 <= num1 ) && (num == num2)
//    println(res)
//    val a = readLine()!!.toInt()
//
//    val b = readLine()!!.toBoolean()
//
//    val totalCups = a >= 10 && a <= 20 || a <= 15 && a >= 25
//
//    val dayOfWeek = b == true || b == false
//

//    print(totalCups && dayOfWeek)
//    val a = readLine()!!.toInt()
//    val b = readLine()!!.toInt()
//    val c = readLine()!!.toInt()
//    val a = 12
//    val b = 15
//    val c = 11
//        if (a > c){
//            println(max(c,b))
//        }else {
//            println(b)
//        }
//    println(
//        if (a > c){
//            b
//        } else{
//            a
//        }
//    )
//    if( a >= b && a >= c)
//        println(a)
//
//    else if (b >= a && b >= c)
//        println(b)
//
//    else
//        println(c)
//    if (c in a.. b) {
//        println("Normal")
//    }else if (c > a && c > b){
//        println("Excess")
//    }else{
//        println("Deficient")
//    }
////    val b = readLine()!!.toBoolean()
////print(num1 in num2..num3 || num3..num2
////    val totalCups = 10 <= a && a <= 20 && b || 15 <= a && a <= 25 && b
////    val dayOfWeek = b == true || b == false
////    val totalCups = m <= a || a <= n == m <= n || a <= m
////    print(totalCups)
//
//    val n = Scanner(System.`in`)
//    val b = n.nextInt()
////    val a = "Kotlin"
//    repeat(b){
//        print(b)
//    }
//    val n = readln().toInt()
//    print(repeat(n))
////////////////////////////////////////////////////

//// "print(num1 in num2..num3 || num3..num2)
//    val res:Boolean = true
//    val res_2:Boolean = false
/////////////////////////////////////////////////
//    val a = readLine()!!.toInt()
////    val b = readLine()!!.toInt()
//    if (a > 0){
//        println("YES")
//    }else{
//        println("NO")
//    }
    ///////////////////////////////////////////////
////    val c:Int = readLine()!!.toInt()
//    if (a in b..c || a in c..b) {
//        println(res)
//    } else{
//        println(res_2)
//    }
    //////////////////////////////////////////////////
//    println(a in b..c || a in c..b)
//    if (a in b..c || a in c..b){
//        println(if (b > a) max = b)
    ///////////////////////////////////////////////////
//    val max = if (a > b) a else b
//    val a = readLine()!!.toInt()
//    val b = readLine()!!.toInt()
//    val max = if (b > a ) b else a
//    println(max)
//    val max = if (b > a )
//    {
//        println(max)
//    }
//    println()
//    val max = if (a < b) {
//        println("Choose a")
//        a
//    } else {
//        println("Choose b")
//        b
//    }
    /////////////////////////////////////////////////
//    val x1 = readLine()!!.toInt()
//    val y1 = readLine()!!.toInt()
//    val x2 = readLine()!!.toInt()
//    val y2 = readLine()!!.toInt()
//    val (x1, y1) = readLine()!!.split(" ").map { it.toInt() }
//    val (x2, y2) = readLine()!!.split(" ").map { it.toInt() }
////    if (x1 == x2 || y1 == y2 || abs(x1 - x2) == abs(y1 - y2)) {
////        println("YES")} else{ println("NO")}
//    if ((x1 == x2) || (y1 == y2) || abs(x1 - x2) == abs(y1 - y2)) {
//        println("YES")
//    } else {
//        println("NO")
//    }

//    val (x1, y1) = readLine()!!.split(" ").map { it.toInt() }
//    val (x2, y2) = readLine()!!.split(" ").map { it.toInt() }

//    repeat(readLine()!!.toInt()){
//        val inp = readLine()!!.toInt()
//        var pos = 0
//        var z = 0
//        if (inp > 0) {
//            pos++
//        }
//        pos
//    }
/////////////////////////////////////////////
//    var n = Scanner(System.`in`)
//    val a = Array(n)
//     val a:Int = 100
//    val n = readLine().toString()
//    var p = 0
//    val z = -1
//
////    for (i in n ){
////        if (n > 0)
////    }
//    if (n > 0.toString()){
//        p++
//    }else{
//        z
//    }
//    println(p)
    //////////////////////////////////////////////
//    var pos = 0
//    repeat(readLine()!!.toInt()) {
//        if (readLine()!!.toInt() > 0)
//            pos++
//    }
//    println(pos)
////////////////////////////////////////////////////
//    val x1 = readln().toInt()
//    val x2 = readln().toInt()
//    val x3 = readln().toInt()
//    val x4 = readln().toInt()
//    val x5 = readln().toInt()
//
//    if((x5 in x1..x2) || (x5 in x3..x4)){
//        println(true)
//    }else{
//        println(false)
//    }
    ////////////////////////////////////////////
//    val a = 18
//    val b = 59
//    val c = readln().toInt()
//    if (c in a..b || c in a..b){
//        println(true)
//    }else{
//        println(false)
//    }
    //////////////////////////////////////////////////
//    println(readln().toInt() !in 1..10)
    ///////////////////////////////////////////////
//    for (i in 1 until 4) {
//        println(i)
//    }
    /////////////////////////////////////////////////
//    // first resolution
//    val a = readln().toInt()
//    val b = readln().toInt()
//    val c = readln().toInt()
//    val d = readln().toInt()
//
//    for (x in 0..1000) {
//        if (a * (x * x * x) + b * (x * x) + c * x + d == 0)
//            println(x)
//    }

//          second resolution
//    val scanner = java.util.Scanner(System.`in`)
//    val (a, b, c, d) = Array(4) { scanner.nextLong() }
//
//    (0..1000)
//        .filter { 0L == d + (c + (b + a * it) * it) * it }
//        .forEach { println(it) }
    ////////////////////////////////////////////////////////////
//    for (i in 1..3) {
//        for (j in 1..i) {
//            print(j)
//        }
//    }
    ////////////////////////////////////////////////////

//    val n = readln().toInt()
//    val m = readln().toInt()
//    var result = 0 // starting value of the factorial
//
//    for (i in n..m) { // the product from n to m
//        result += i
//    }
//    println(result)
    ////////////////////////////////////////////////////////
//    print(((b - a) / c) + 1)
//    if (b % c > 0) println(b / c - a / c)
//    else println((b - a) / c + 1)
    //////////////////////////////////////////////

//    val a = readln().toLong()
//    val b = readln().toLong()
//    var res = 1L
//    for (i in a until  b) {
//        res *= i
//    }
//    print(res)

//    val a = readLine()!!.toString()
////    val n = ""
//    val result = buildString {
//        for (i in 0 until a.length) {
//            if (i % 1 == 0 && i > 0)
//                append(' ')
//            append(a[i])
//        }
//    }
//    println(result)
    /////////////////////////////////////////////
//    print(
//        buildString {
//            for (i in 0 until "Hello!".length) {
//                if (i % 1 == 0 && i > 0)
//                    append(' ')
//                append("Hello!"[i])
//            }
//        }
//    )
    ///////////////////////////////////////////////////////////
//    val daysOfWeek = mutableListOf("Sun", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat")
//
//    for (index in daysOfWeek.indices){
//        println("$index: ${daysOfWeek[index]}")
//    }
    //////////////////////////////////////////////////////
//    val numbers = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

//    for (index in numbers.lastIndex  downTo  0 step  2) {
//        println("$index: ${numbers[index]}")
//    }
//    val n = readln().toInt()
//    val numbers = MutableList(size) { readln().toInt() }
//    val lastNumber = numbers.lastIndex

        // put your code here
//        val number = 12241
//        val digit = ((number % 100) / 10) % 10
//        println(((n + 1) * n + 2) * n + 3)
//        val list: MutableCollection<Int> = LinkedList()
//        list.add(3)
//        list.add(2)
//        list.add(1)
//        println(list)
//        list.remove(1)
//        println(list)

//        val list: MutableCollection<Int> = LinkedList()
//        list.add(3)
//        list.add(2)
//        list.add(1)
//        list.add(4)
//        list.add(5)
//        println(list)
//        list.retainAll(listOf(3, 4, 5))
//        println(list)

//        val list: MutableCollection<Int> = LinkedList()
//        list.add(3)
//        list.add(2)
//        list.add(1)
//        list.add(4)
//        list.add(5)
//        println(list)
//        list.removeAll(listOf(3, 4, 5))
//        println(list)
/////////////////////////////////////////////////////////////////////

    //   Renverser la liste
//
//    val list : MutableCollection<Int> = LinkedList()
//    list.add(1)
//    list.add(2)
//    list.add(3)
//
//    println(list)
//    println(list.reversed())
    ///////////////////////////////////////////////////////////

    //         Ajoute et supprime la valeur [4] dans la liste
//    val list : MutableCollection<Int> = LinkedList()
//    list.add(1)
//    list.add(2)
//    list.add(3)
//
//    println(list)
//    list.add(4)
//    println(list)
//    list.remove(4)
//    println(list)
    //////////////////////////////////////////////////////////////////

    // Merge of lists
//
//    val list1 = LinkedList<Int>()
//    list1.add(1)
//    list1.add(2)
//    list1.add(3)
//    list1.add(4)
//    list1.add(5)
//
//    val list2 = LinkedList<Int>()
//    list2.add(-1)
//    list2.add(0)
//    list2.add(-7)
//    list2.add(9)
//    list2.add(6)
//
//    println(list1)
//    println(list2)
//
//    list1.addAll(list2)
//    println(list1)

    //////////////////////////////////////////////////////////
    /// A Stack Operations

//    val list1 = LinkedList<Int>()
//    list1.add(1)
//    list1.add(2)
//    list1.add(3)
//    list1.add(4)
//    list1.add(5)
//
//    val list2 = LinkedList<Int>()
//    list2.add(-1)
//    list2.add(0)
//    list2.add(-7)
//    list2.add(9)
//    list2.add(6)
//
//    println(list1)
//    println(list2)
//
//    list1.addAll(list2)
//    println(list1)
//    list1.push(10)
//    println(list1)
//    println(list1.pop())
    //////////////////////////////////////////////////////////////////////
//    var hour = 24
   val testList = listOf(11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    println(reverseList(testList))

}

fun reverseList(list: List<Int>){
    val result = mutableListOf<Int>()
    for (i in 0..list.size-1){
        result.add(list[list.size-i-1])
    }
    result
}



