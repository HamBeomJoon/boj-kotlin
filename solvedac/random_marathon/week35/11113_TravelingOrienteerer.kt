package week35

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.hypot
import kotlin.math.round

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    val n = br.readLine().toInt()
    val v = Array(n) {
        val (x, y) = br.readLine().split(" ").map { it.toDouble() }
        x to y
    }

    val m = br.readLine().toInt()
    repeat(m) {
        val k = br.readLine().toInt()
        val u = br.readLine().split(" ").map { it.toInt() }

        var ans = 0.0
        for (i in 1 until k) {
            val (x1, y1) = v[u[i - 1]]
            val (x2, y2) = v[u[i]]
            ans += hypot(x1 - x2, y1 - y2)
        }
        sb.appendLine(round(ans).toInt())
    }
    println(sb)
}
