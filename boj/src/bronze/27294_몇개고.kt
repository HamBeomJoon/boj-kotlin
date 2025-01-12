package bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (a, b) = br.readLine().split(" ").map(String::toInt)
    println(if (b == 1 || a !in 12..16) 280 else 320)
}
