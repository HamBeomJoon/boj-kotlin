package week17

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val h = br.readLine().toInt()
    val w = br.readLine().toInt()
    println(min(h, w) * 50)
}