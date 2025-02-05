package week35

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, k) = br.readLine().trim().split(" ").map { it.toInt() }
    val numList = br.readLine().split(" ").map { it.toInt() }
    val result = mutableListOf<Int>()

    for (i in 0..n - k) {
        result.add(numList.subList(i, i + k).sum())
    }

    println(result.max())
}