package week28

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    while (true) {
        val (a, b, c) = br.readLine().split(" ").map { it.toInt() }
        if (a == 0 && b == 0 && c == 0) break

        println(check(a, b, c))
    }
}

fun check(a: Int, b: Int, c: Int): String {
    return if ((c - a) % b != 0 || c < a) "X"
    else ((c - a) / b + 1).toString()
}