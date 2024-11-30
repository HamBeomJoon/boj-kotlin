package bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    while (true) {
        val n = br.readLine().toInt()
        if (n == 0) break
        println(cal(n))
    }
}

fun cal(n: Int): Int {
    var s = 0
    for (i in n downTo 1)
        s += i
    return s
}