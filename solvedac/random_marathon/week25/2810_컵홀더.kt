package week25

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val s = br.readLine()

    var count = 1
    var i = 0

    while (i < n) {
        if (s[i] == 'S') {
            count++
        } else {
            count++
            i++
        }
        i++
    }

    println(count.coerceAtMost(n))
}