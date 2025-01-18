package week33

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val a = Array(n) { "" }
    val b = IntArray(n)
    var index = 0

    for (i in 0 until n) {
        val input = br.readLine().split(" ")
        a[i] = input[0]
        b[i] = input[1].toInt()
        if (a[i] == "jinju") {
            index = i
        }
    }

    var count = 0
    for (i in 0 until n) {
        if (b[i] > b[index]) {
            count++
        }
    }

    println(b[index])
    println(count)
}