package week18

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val chapter = mutableListOf<Int>()
    repeat(n) {
        val c = br.readLine().toInt()
        chapter.add(c)
    }

    var ans = 0
    var time = 30
    for (c in chapter) {
        if (time >= c / 2.0) {
            ans++
        }

        time -= c
        if (time <= 0) {
            time = 30
        }
    }
    println(ans)
}