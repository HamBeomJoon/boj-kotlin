package bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val arr = Array(n) { br.readLine() }
    arr.forEachIndexed { index, value ->
        println("${index + 1}. $value")
    }
}