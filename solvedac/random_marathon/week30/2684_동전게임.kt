package week30

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    repeat(br.readLine().toInt()) {
        val sequence = br.readLine()

        val patterns = listOf(
            "TTT", "TTH", "THT", "THH",
            "HTT", "HTH", "HHT", "HHH"
        )

        val counts = IntArray(patterns.size)
        for (i in 0 until sequence.length - 2) {
            val group = sequence.substring(i, i + 3)
            counts[patterns.indexOf(group)]++
        }

        println(counts.joinToString(" "))
    }
}