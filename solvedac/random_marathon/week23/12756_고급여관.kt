package week23

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (a1, h1) = br.readLine().split(" ").map { it.toInt() }
    val (a2, h2) = br.readLine().split(" ").map { it.toInt() }
    val a = h1 / a2 + if (h1 % a2 != 0) 1 else 0
    val b = h2 / a1 + if (h2 % a1 != 0) 1 else 0

    when {
        a == b -> println("DRAW")
        a > b -> println("PLAYER A")
        else -> println("PLAYER B")
    }
}