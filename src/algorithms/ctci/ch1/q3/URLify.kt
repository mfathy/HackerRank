package algorithms.ctci.ch1.q3

/**
 * Created by Mohammed Fathy @ 3/20/2019
 * dev.mfathy@gmail.com
 * <p>
 *
 */

const val REPLACEABLE_TEXT = "%20"

/**
 * Replaces only space characters between firstChar index and lastChar index.
 */
fun replaceSpaces(charArray: CharArray, firstChar: Int, lastChar: Int): String {
    val strResult = StringBuilder()

    for (i in firstChar .. lastChar) {
        if (charArray[i] == ' ')
            strResult.append(REPLACEABLE_TEXT)
        else
            strResult.append(charArray[i])
    }
    return strResult.toString()
}

/**
 * Returns the first character index not a space character.
 */
fun findLastCharNotSpace(toCharArray: CharArray): Int {

    for (i in toCharArray.size - 1 downTo 0) {
        if (toCharArray[i] != ' ') return i
    }

    return toCharArray.size - 1
}

/**
 * Returns the last character index not a space character.
 */
fun findFirstCharNotSpace(toCharArray: CharArray): Int {
    toCharArray.forEachIndexed { index, char ->
        if (char != ' ') return index
    }

    return 0
}

fun main(args: Array<String>) {
    val str = "          Mr John Smith               "
    val firstChar = findFirstCharNotSpace(str.toCharArray())
    val lastChar = findLastCharNotSpace(str.toCharArray())
    println(replaceSpaces(str.toCharArray(), firstChar, lastChar))
}
