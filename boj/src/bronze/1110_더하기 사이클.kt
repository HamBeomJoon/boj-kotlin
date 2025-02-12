package bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var ans = 0
    var tmp = n

    while (true) {
        ans++
        if (tmp < 10) {
            tmp *= 11
            if (tmp == n) break
            else continue
        } else {
            val tmpList = tmp.toString().map { it.toString().toInt() }
            val sumLast = tmpList.sum().toString().map { it.toString().toInt() }.last()

            tmp = (tmpList[1].toString() + sumLast.toString()).toInt()
            if (tmp == n) break
            else continue
        }
    }

    println(ans)
}