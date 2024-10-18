package week20

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    var ans = ""

    repeat(n) {
        val (s, t) = br.readLine().split(" ")
        val index = s.indexOfFirst { it == 'x' || it == 'X' }
        print(t[index].uppercase())
    }
}
