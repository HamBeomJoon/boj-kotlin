package week36

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    println(List(n) { "LoveisKoreaUniversity" }.joinToString(" "))
}
