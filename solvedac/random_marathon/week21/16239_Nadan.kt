package week21

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var k = br.readLine().toInt()
    val n = br.readLine().toInt()

    for (i in 1..<n) {
        println(i)
        k -= i
    }
    println(k)
}