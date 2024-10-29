package week21

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val list = mutableListOf<Pair<String, Int>>()
    var sum = 0

    repeat(n) {
        val name = br.readLine()
        var (k, m) = br.readLine().split(" ").map { it.toInt() }

        var cnt = 0
        while (k <= m) {
            m = m - k + 2
            cnt++
        }
        sum += cnt
        list.add(name to cnt)
    }

    list.sortByDescending { it.second }
    println("$sum\n${list[0].first}")
}