package week34

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    br.readLine()
    val a = br.readLine().split(" ").sumOf { it.toInt() }
    val b = br.readLine().split(" ").sumOf { it.toInt() }
    print(a - b)
}