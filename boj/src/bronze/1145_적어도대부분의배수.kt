package bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val numList = br.readLine().split(" ").map { it.toInt() }

    for (ans in 1..<1000001) {
        var div = 0

        for (element in numList) {
            if (ans % element == 0) div++
        }

        if (div >= 3) {
            println(ans)
            break
        }
    }
}