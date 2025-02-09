package week36

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (e, s, m) = br.readLine().split(" ").map { it.toInt() }

    var year = 1
    while (!((year % 15 == e % 15) && (year % 28 == s % 28) && (year % 19 == m % 19))) {
        year++
    }
    println(year)
}