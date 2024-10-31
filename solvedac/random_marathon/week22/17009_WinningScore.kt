package week22

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var a = 0
    var b = 0

    for (i in 3 downTo 1) {
        a += br.readLine().toInt() * i
    }
    for (i in 3 downTo 1) {
        b += br.readLine().toInt() * i
    }

    if (a > b) println("A")
    else if (a < b) println("B")
    else println("T")
}