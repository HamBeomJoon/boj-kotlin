package week18

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val bitcoin = br.readLine().split(" ").map { it.toInt() }
    var ans = 0

    for (i in 1..<n) {
        for (j in i + 1..<n) {
            if (bitcoin[i] < bitcoin[j] && ans < bitcoin[j] - bitcoin[i]) {
                ans = bitcoin[j] - bitcoin[i]
            }
        }
    }

    println(ans)
}