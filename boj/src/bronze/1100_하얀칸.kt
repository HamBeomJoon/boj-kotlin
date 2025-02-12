package bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()

    while (true) {
        val line = br.readLine() ?: break
        val (n, s) = line.split(" ").map { it.toInt() }
        sb.append(s / (n + 1)).append("\n")
    }

    print(sb)
}