package week21

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var (n, k) = br.readLine().split(" ").map { it.toLong() }
    val course = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    var check = false

    for (i in 0 until n) {
        k -= course[i.toInt()]
        if (k < 0) {
            println(i + 1)
            check = true
            break
        }
    }

    if (!check) {
        for (i in n - 1 downTo 0) {
            k -= course[i.toInt()]
            if (k < 0) {
                println(i + 1)
                break
            }
        }
    }
}