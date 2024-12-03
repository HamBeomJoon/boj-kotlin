package week26

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    while (true) {
        val input = br.readLine() ?: break
        val n = input.toInt()
        if (n % 6 == 0) {
            println("Y")
        } else {
            println("N")
        }
    }
}