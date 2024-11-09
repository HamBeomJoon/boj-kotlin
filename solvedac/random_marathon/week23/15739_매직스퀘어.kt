package week23

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val map = Array(n) { IntArray(n) }
    val set = mutableSetOf<Int>()
    var magic = true
    val sum = n * (n * n + 1) / 2

    for (i in 0 until n) {
        val st = StringTokenizer(br.readLine(), " ")
        for (j in 0 until n) {
            map[i][j] = st.nextToken().toInt()
            set.add(map[i][j])
        }
    }

    for (i in 0 until n) {
        var rowSum = 0
        for (j in 0 until n) {
            rowSum += map[i][j]
        }
        if (rowSum != sum) magic = false
    }

    for (i in 0 until n) {
        var colSum = 0
        for (j in 0 until n) {
            colSum += map[j][i]
        }
        if (colSum != sum) magic = false
    }

    var diagSum1 = 0
    for (i in 0 until n) {
        diagSum1 += map[i][i]
    }
    if (diagSum1 != sum) magic = false

    var diagSum2 = 0
    for (i in 0 until n) {
        diagSum2 += map[i][n - i - 1]
    }
    if (diagSum2 != sum) magic = false

    if (set.size != n * n) magic = false

    if (magic) println("TRUE") else println("FALSE")
}