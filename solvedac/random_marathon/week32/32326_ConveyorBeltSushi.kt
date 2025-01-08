package week32

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val r = br.readLine().toInt()
    val g = br.readLine().toInt()
    val b = br.readLine().toInt()
    print(r * 3 + g * 4 + b * 5)
}