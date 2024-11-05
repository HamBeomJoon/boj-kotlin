package week22

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    repeat(n) {
        val a = br.readLine()
    }

    for (i in 1..n) {
        println(List(n) { "$i" }.joinToString(" "))
    }
}