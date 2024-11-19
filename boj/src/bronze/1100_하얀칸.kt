package bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var cnt = 0

    for (i in 0..<8) {
        val str = br.readLine()
        for (j in 0..<8) {
            if ((i + j) % 2 == 0 && str[j] == 'F') {
                cnt++
            }
        }
    }

    println(cnt)
}