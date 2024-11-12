package week23

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val cards = mutableMapOf<Long, Int>()

    repeat(n) {
        val num = br.readLine().toLong()
        cards[num] = cards.getOrDefault(num, 0) + 1
    }

    val mostFrequentNum = cards.entries
        .sortedWith(compareByDescending<Map.Entry<Long, Int>> { it.value }
            .thenBy { it.key }).first().key

    println(mostFrequentNum)
}