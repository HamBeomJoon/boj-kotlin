package week25

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val results = mutableListOf<String>()
    repeat(t) {
        val s = br.readLine()
        results.add(compress(s))
    }
    println(results.joinToString("\n"))
}

fun compress(input: String): String {
    val sb = StringBuilder()
    var cnt = 1
    var target = input[0]
    for (i in 1 until input.length) {
        if (target == input[i]) {
            cnt++
        } else {
            sb.append(cnt).append(" ").append(target).append(" ")
            target = input[i]
            cnt = 1
        }
    }

    sb.append(cnt).append(" ").append(target)
    return sb.toString().trim()
}