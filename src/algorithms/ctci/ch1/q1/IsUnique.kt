package algorithms.ctci.ch1.q1

import java.util.*


/**
 * Created by Mohammed Fathy @ 04/03/2019
 * dev.mfathy@gmail.com
 *
 * Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
 * cannot use additional data structures?
 *
 * https://www.geeksforgeeks.org/determine-string-unique-characters/
 */


fun main(args: Array<String>) {
    val testCases = arrayOf("ab", "abab", "abcda", "Mohammed", "abcde", "hello", "apple", "kite", "padle")

    testCases.forEach { string ->
        val result = if (isUniqueUsingAnagrams(string)) "unique" else "not unique"
        println("The string: $string is $result")
    }
}

/**
 * For any char set type.
 *
 * The time complexity for this code is O( n),
 */
fun checkUniqueStringUsingHashTables(string: String): Boolean {

    val charMap = HashMap<Char, Int>()
    string.forEachIndexed { _, char ->
        val charCount = charMap[char]
        if (charCount != null) {
            if (charCount == 1) return false
        }

        charMap[char] = 1
    }

    return true
}

/**
 * Using assumption that we are using ASCII char set.
 *
 * The time complexity for this code is O( n),
 */
fun isUniqueCharsUsingAscii(string: String): Boolean {
    if (string.length > 128) return false

    val charSet = BooleanArray(128)
    string.forEach { char ->
        if (charSet[char.toInt()]) return false

        charSet[char.toInt()] = true
    }

    return true
}

/**
 * Using a 32 bit int array to solve the problem.
 * Explanation >> https://stackoverflow.com/a/40823167
 */
fun isUniqueBitVector(string: String): Boolean {
    // Assuming string can have characters a-z
    // this has 32 bits set to 0
    var checker = 0

    for (i in 0 until string.length) {
        val bitAtIndex = string[i] - 'a'

        // if that bit is already set in checker,
        // return false
        if (checker and (1 shl bitAtIndex) > 0)
            return false

        // otherwise update and continue by
        // setting that bit in the checker
        checker = checker or (1 shl bitAtIndex)
    }

    // no duplicates encountered, return true
    return true
}


fun isUniqueUsingAnagrams(string: String): Boolean  {
    //  Convert string to char array
    val charArray = string.toCharArray()

    //  Sort the array.
    Arrays.sort(charArray)

    charArray.forEachIndexed { index, char ->
        if (index + 1 == charArray.size) return true
        if (char == charArray[index + 1]) return false
    }
    return true
}

