package week24

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    while (true) {
        val (l, w, h, v) = br.readLine().split(" ").map { it.toInt() }
        if (l == 0 && w == 0 && h == 0 && v == 0) break
        if (v == 0) println("$l $w $h ${l * w * h}")
        else if (l == 0) println("${v / (w * h)} $w $h $v")
        else if (w == 0) println("$l ${v / (l * h)} $h $v")
        else if (h == 0) println("$l $w ${v / (l * w)} $v")
    }
}