package week36

import java.io.BufferedReader
import java.io.InputStreamReader

fun getFactor(range: Int): List<Int> {
    return (1..range).filter { range % it == 0 }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (p, q) = br.readLine().split(" ").map { it.toInt() }
    val pf = getFactor(p)
    val qf = getFactor(q)

    for (a in pf) {
        for (b in qf) {
            println("$a $b")
        }
    }
}