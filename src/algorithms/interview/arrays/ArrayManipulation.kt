/**
 * Created by Mohammed Fathy @ 01/02/2019
 * dev.mfathy@gmail.com
 * https://www.hackerrank.com/challenges/crush?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 * Explanation https://codereview.stackexchange.com/questions/185320/hackerrank-array-manipulation
 *
 */

import java.util.*

// Complete the arrayManipulation function below.
fun arrayManipulation(n: Int, queries: Array<Array<Int>>): Long {
    val sumAr = LongArray(n+1)
    var maxSum = 0L
    if (n in 3..100000000){
        queries.forEach { query ->
            val a = query[0] - 1
            val b = query[1] - 1
            val k = query[2].toLong()
            sumAr[a] += k
            if (b + 1 < n) {
                sumAr[b+1] -= k
            }
        }

        maxSum = sumAr[0]
        var internSum = 0L
        for (i in 0 .. n) {
            internSum += sumAr[i]
            if (internSum > maxSum){
                maxSum = internSum
            }
        }
    }

    return maxSum
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nm = scan.nextLine().split(" ")

    val n = nm[0].trim().toInt()

    val m = nm[1].trim().toInt()

    val queries = Array<Array<Int>>(m, { Array<Int>(3, { 0 }) })

    for (i in 0 until m) {
        queries[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = arrayManipulation(n, queries)

    println(result)
}