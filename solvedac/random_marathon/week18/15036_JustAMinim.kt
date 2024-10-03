package week18

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val tune = br.readLine().split(" ")
    var ans = 0.0
    for (t in tune) {
        when (t) {
            "0" -> ans += 2
            "1" -> ans += 1
            "2" -> ans += 0.5
            "4" -> ans += 0.25
            "8" -> ans += 0.125
            "16" -> ans += 0.0625
        }
    }
    println(ans)
}