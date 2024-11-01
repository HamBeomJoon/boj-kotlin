package week22

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    while (true) {
        val input = br.readLine().split(" ")
        if (input[0] == "#") break
        println(input.joinToString(" ") { it.reversed() })
    }
}