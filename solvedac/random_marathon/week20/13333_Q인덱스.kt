package week20

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val thesis = br.readLine().split(" ").map { it.toInt() }.sorted()

    for (i in n downTo 0) {
        var count = 0
        for (t in thesis.indices) {
            if (thesis[t] >= i) count++
        }

        if (count >= i) {
            println(i)
            break
        }
    }
}
