package bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    println(br.readLine().map { it.uppercase() }.joinToString(""))
}