package Integersinaction

/**
  first algorithms

  How many nuts will be left after division


      N squirrels found K nuts and decided to split them equally. Find how many nuts will be left after each of the squirrels takes an equal amount of nuts.

      Input data format

      There are two positive integers N and K, each of them is not greater than 10000.


      Sample Input 1:

      3
      14
      Sample Output 1:

      2

    Answer

      fun main() {
      // put your code here
      val N = readln().toLong()
      val K = readln().toLong()
      println(K % N)
      }

    Second algorithms

    Divide nuts equally between squirrels

      N squirrels found K nuts and decided to split them equally. Calculate how many nuts go for each squirrel.

      Input data format

      There are two positive numbers N and K, each of them is not greater than 10000.

      Sample Input 1:

      3
      14
      Sample Output 1:

      4

    Answer

      fun main() {
      // put your code here
      val N = readln().toLong()
      val K = readln().toLong()
      println(K / N)
      }

 **/

