package week17

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bulb = br.readLine().toMutableList()
    var ans = 0

    if (bulb.all { it == 'N' }) {
        println(ans)
        return
    }

    for (i in 0..bulb.size) {
        if (bulb[i] == 'Y') {
            for (j in i + 1..bulb.size step i + 1) {
                bulb[j - 1] = if (bulb[j - 1] == 'Y') 'N' else 'Y'
            }
            ans++
        }

        if (bulb.all { it == 'N' }) {
            println(ans)
            return
        }
    }

    println(-1)
}