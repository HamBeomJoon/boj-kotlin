package week30

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    repeat(br.readLine().toInt()) {
        val sequence = br.readLine().toList()

        val patterns = listOf(
            "TTT", "TTH", "THT", "THH",
            "HTT", "HTH", "HHT", "HHH"
        )

        val counts = IntArray(patterns.size)

        for (i in 0 until sequence.size - 2) {
            val group = sequence.subList(i, i + 3).joinToString("")
            val index = patterns.indexOf(group)
            if (index >= 0) counts[index]++
        }

        println(counts.joinToString(" "))
    }
}