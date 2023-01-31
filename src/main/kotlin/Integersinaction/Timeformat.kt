package Integersinaction

/**
     You are given a number that represents the number of seconds passed since 1.1.1970.
    Write a program that calculates the current time, i.e., finds the hours, minutes and seconds of the given number of seconds.

    Format: hours:minutes:seconds

    Example: 14:9:7

    You don't have to import anything, just use% and/, remember how much time in one day.
    You do not need to print the number of days and do not think about UTC and GMT.
 **/

////////////////////////////////////////////////////////////
/**
         fun main() {
        val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
        // enter your code
        val seconds: Long = totalSeconds % 60
        val minutes: Long = seconds / 60
        val hours: Long = minutes / 60
        println("$hours:$minutes:$seconds")

        }
 **/