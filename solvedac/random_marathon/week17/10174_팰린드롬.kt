package week17

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    repeat(n) {
        val str = br.readLine()
        if (check(str)) println("Yes") else println("No")
    }
}

fun check(s: String): Boolean {
    val dq = ArrayDeque<Char>()
    for (i in s) {
        dq.add(i.lowercaseChar())
    }

    while (dq.size > 1) {
        if (dq.removeFirst() == dq.removeLast()) continue
        else return false
    }

    return true
}