package Integersinaction

/**
    The last digit of a number

        Write a program that reads a number and outputs its last digit.


        Sample Input 1:

        425

        Sample Output 1:

        5

     Answer

        fun main() {
        // put your code here
        var number = readln().toInt()
        var num = 0
        num = Math.abs(number % 10);
        println(num)
        }
 **/