package week31

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    repeat(br.readLine().toInt()) {
        val (m, n) = br.readLine().split(" ").map { it.toInt() }
        val box = Array(m) { br.readLine().split(" ").map { it.toInt() }.toIntArray() }

        var count = 0
        for (i in 0 until n) {
            for (j in 0 until m) {
                if (box[j][i] == 1) {
                    for (k in j + 1 until m) {
                        if (box[k][i] == 0) count++
                    }
                }
            }
        }

        println(count)
    }
}