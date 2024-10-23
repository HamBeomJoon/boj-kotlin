package week21

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (h, m) = br.readLine().split(" ").map { it.toInt() }
    println((h - 9) * 60 + m)
}