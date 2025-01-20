package week32

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    br.readLine()
    val s = br.readLine()
    var result = 0
    var bonus = 0

    for (i in s.indices) {
        if (s[i] == 'O') {
            result += i + bonus++ + 1
        } else {
            bonus = 0
        }
    }

    println(result)
}
