package week18

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var n = br.readLine().toInt()
    val r = br.readLine().toInt()
    var ans = 0
    val branch = mutableListOf<Int>()
    while (n > 5) {
        n = (n * r / 100)
        branch.add(n)
    }

    for (i in 0..<branch.size - 1) {
        ans += branch[i] * (1 shl i + 1)
    }
    println(ans)
}