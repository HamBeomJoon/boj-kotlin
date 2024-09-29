package week16

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.ceil
import kotlin.math.max
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var candidate: MutableList<List<String>> = mutableListOf()

    repeat(n) {
        val input = br.readLine().split(" ")
        if (input[1] == "jaehak" && input[2] != "winner" && (input[3].toInt() > 3 || input[3].toInt() == -1)) {
            candidate.add(listOf(input[0], input[4]))
        }
    }

    var sortedCandidate = candidate.sortedBy { it[1].toInt() }
    if (sortedCandidate.size > 10) {
        sortedCandidate = sortedCandidate.take(10)
    }
    val ans = sortedCandidate.sortedBy { it[0] }
    println(ans.size)
    ans.forEach { println(it[0]) }
}