package week24

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var ans = 0
    var start = br.readLine().toInt()
    repeat(n) {
        val target = br.readLine().toInt()
        ans += minOf(abs(start - target), 360 - start + target, start + 360 - target)
        start = target
    }
    println(ans)
}