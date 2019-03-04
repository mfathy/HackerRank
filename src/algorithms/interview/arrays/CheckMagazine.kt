package algorithms.interview.arrays

/**
 * Created by Mohammed Fathy @ 02/02/2019
 * dev.mfathy@gmail.com
 *
 */

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the checkMagazineS1 function below.
fun checkMagazine(magazine: Array<String>, note: Array<String>): Boolean {

    if (magazine.size < note.size) return false

    val wordMap = HashMap<String, Int>()
    val magazineMap = magazine.groupingBy { it }.eachCount()
    note.forEach { word ->
        val mWordValue = magazineMap[word] ?: 0
        if (mWordValue == 0) return false
        else {
            var wordValue = wordMap[word]
            if (wordValue != null) {
                wordMap.put(word, ++wordValue)
                if ( wordValue > mWordValue) return false
            } else {
                wordMap.put(word, 1)
            }
        }
    }

    return true
}

fun checkMagazine2(magazine: Array<String>, note: Array<String>): Boolean {

    if (magazine.size < note.size) return false

    val magazineMap = magazine.groupingBy { it }.eachCount()
    val noteMap = note.groupingBy { it }.eachCount()

    noteMap.forEach {  }

    return true
}



fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val mn = scan.nextLine().split(" ")

    val m = mn[0].trim().toInt()

    val n = mn[1].trim().toInt()

    val magazine = scan.nextLine().split(" ").toTypedArray()

    val note = scan.nextLine().split(" ").toTypedArray()

    if (checkMagazine(magazine, note))
        println("Yes")
    else
        println("No")
}