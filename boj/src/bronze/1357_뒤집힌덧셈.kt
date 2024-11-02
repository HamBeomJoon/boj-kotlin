package bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (x, y) = br.readLine().split(" ").map { it.reversed().toInt() }
    println((x + y).toString().reversed().toInt())
}