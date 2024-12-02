package week26

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val grid = Array(n) { br.readLine().split(" ").map { it.toInt() } }

    var minCost = Int.MAX_VALUE

    for (x in 0 until n) {
        for (y in 0 until m) {
            var totalCost = 0
            for (i in 0 until n) {
                for (j in 0 until m) {
                    totalCost += grid[i][j] * (abs(x - i) + abs(y - j))
                }
            }
            minCost = minOf(minCost, totalCost)
        } 
    }

    println(minCost)
}