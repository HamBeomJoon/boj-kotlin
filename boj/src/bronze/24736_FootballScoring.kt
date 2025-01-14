package bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (a, b, c, d, e) = br.readLine().split(" ").map { it.toInt() }
    val (f, g, h, i, j) = br.readLine().split(" ").map { it.toInt() }
    println("${a * 6 + b * 3 + c * 2 + d + e * 2} ${f * 6 + g * 3 + h * 2 + i + j * 2}")
}