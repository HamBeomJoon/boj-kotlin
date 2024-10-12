package week19

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val p = br.readLine().toInt()

    repeat(p) {
        val n = br.readLine().toLong()
        println(n * (n + 1) * (n * 2 + 1) / 6)
    }
}