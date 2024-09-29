package week16

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    repeat(n) {
        val m = br.readLine().toLong()
        menu(m)
    }
}

fun menu(m: Long) {
    for (i in 0..60) {
        for (j in i..60) {
            if ((1L shl i) + (1L shl j) == m) {
                println("$i $j")
                return
            }
        }
    }
}