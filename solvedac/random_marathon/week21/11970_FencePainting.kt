package week21

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (a, b) = br.readLine().split(" ").map { it.toInt() }
    val (c, d) = br.readLine().split(" ").map { it.toInt() }
    val fence = MutableList(max(b, d) + 1) { false }
    for (i in a..<b) {
        fence[i] = true
    }
    for (i in c..<d) {
        fence[i] = true
    }
    println(fence.count { it })
}