package bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val cmd = mutableListOf<String>()
    var ans = ""

    repeat(n) {
        cmd.add(br.readLine())
    }

    for (i in 0..<cmd[0].length) {
        val target = cmd[0][i]
        if (cmd.all { it[i] == target }) {
            ans += target
        } else {
            ans += "?"
        }
    }
    println(ans)
}