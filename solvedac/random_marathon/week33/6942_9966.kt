package week33

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val m = br.readLine().toInt()
    val n = br.readLine().toInt()

    val reverseNum = mapOf('0' to '0', '1' to '1', '8' to '8', '6' to '9', '9' to '6')
    var count = 0

    for (number in m..n) {
        val original = number.toString()
        var rotateNum = ""
        var isValid = true

        for (c in original.reversed()) {
            if (c !in reverseNum) {
                isValid = false
                break
            }
            rotateNum += reverseNum[c]
        }
        if (isValid && original == rotateNum) count++
    }
    println(count)
}
