package week18

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m, q) = br.readLine().split(" ").map { it.toInt() }
    val arr = mutableListOf<MutableList<Int>>()

    repeat(n) {
        val a = br.readLine().split(" ").map { it.toInt() }.toMutableList()
        arr.add(a)
    }

    repeat(q) {
        val cmd = br.readLine().split(" ").map { it.toInt() }.toMutableList()
        if (cmd[0] == 0) {
            arr[cmd[1]][cmd[2]] = cmd[3]
        } else {
            val row1 = cmd[1]
            val row2 = cmd[2]

            val temp = arr[row1]
            arr[row1] = arr[row2]
            arr[row2] = temp
        }
    }

    for (i in arr) {
        println(i.joinToString(" "))
    }
}