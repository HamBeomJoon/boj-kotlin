package week19

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val card = br.readLine().split(" ")
    val count = MutableList(14) { 0 }

    for (c in card) {
        when (c[0]) {
            'A' -> count[1]++
            'T' -> count[10]++
            'J' -> count[11]++
            'Q' -> count[12]++
            'K' -> count[13]++
            else -> count[c[0].digitToInt()]++
        }
    }

    println(count.max())
}