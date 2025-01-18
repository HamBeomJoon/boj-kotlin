package week33

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    repeat(br.readLine().toInt()) {
        val (n, d) = br.readLine().split(" ").map { it.toInt() }
        var ans = 0
        repeat(n) {
            val (v, f, c) = br.readLine().split(" ").map { it.toInt() }
            val dist = v * (f.toDouble() / c)
            if (dist >= d) ans++
        }
        println(ans)
    }
}
