package algorithms.ctci.ch1.q2

/**
 * Created by Mohammed Fathy @ 20/03/2019
 * dev.mfathy@gmail.com
 *
 */

/**
 * Brutte force solution
 */
fun isPermutation(string1: String, string2: String): Boolean {

    if (string1.length != string2.length) return false
    val sortedArray1 = string1.toCharArray().sortedArray().contentToString()
    val sortedArray2 = string2.toCharArray().sortedArray().contentToString()

    return sortedArray1 == sortedArray2
}

/**
 * Assuming that we use only ascii chars of 256.
 */
fun isPermutationHashTable(string1: String, string2: String): Boolean {
    if (string1.length != string2.length) return false

    val letters = IntArray(256)

    string1.forEach { char ->
        letters[char.toInt()] += 1
    }

    string2.forEach { char ->
        letters[char.toInt()] -= 1

        if (letters[char.toInt()] < 0) return false
    }

    return true
}


fun main(args: Array<String>) {
    val pairs = arrayOf(arrayOf("apple", "papel"), arrayOf("carrot", "tarroc"), arrayOf("hello", "llloh"))
    for (pair in pairs) {
        val word1 = pair[0]
        val word2 = pair[1]
        val anagram = isPermutationHashTable(word1, word2)
        println("$word1, $word2: $anagram")
    }
}