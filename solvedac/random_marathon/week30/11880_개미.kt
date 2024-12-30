package week30

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    repeat(br.readLine().toInt()) {
        val (a, b, c) = br.readLine().split(" ").map { it.toLong() }
        val caseA = (pow2(a) + pow2(b + c))
        val caseB = (pow2(b) + pow2(c + a))
        val caseC = (pow2(c) + pow2(a + b))
        println(minOf(caseA, caseB, caseC))
    }
}

fun pow2(x: Long): Long = x * x