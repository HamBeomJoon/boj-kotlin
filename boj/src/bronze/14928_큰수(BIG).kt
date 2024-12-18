package bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val number = br.readLine()
    var res = 0
    for (digit in number) {
        res = (res * 10 + (digit - '0')) % 20000303
    }
    println(res)
}