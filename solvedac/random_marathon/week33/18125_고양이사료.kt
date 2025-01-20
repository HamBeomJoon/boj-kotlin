package week33

import java.io.BufferedReader
import java.io.InputStreamReader

fun print(a: Boolean) {
    if (a) {
        println(
            """
            |>___/|        /}
            | O < |       / }
            (==0==)------/ }
            | ^  _____    |
            |_|_/     ||__|
            """.trimIndent()
        )
    } else {
        println(
            """
            |>___/|     /}
            | O O |    / }""".trimIndent()
        )
        println("( =0= )\"\"\"\"  \\")
        println(
            """
            | ^  ____    |
            |_|_/    ||__|
            """.trimIndent()
        )
    }
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (r, c) = br.readLine().split(" ").map { it.toInt() }

    val arr = Array(c + 1) { IntArray(r + 1) }
    for (i in 1..c) {
        val row = br.readLine().split(" ").map { it.toInt() }
        for (j in 1..r) {
            arr[i][j] = row[j - 1]
        }
    }

    var a = true
    for (i in 1..r) {
        val row = br.readLine().split(" ").map { it.toInt() }
        for (j in 1..c) {
            if (arr[c - j + 1][i] != row[j - 1]) {
                a = false
            }
        }
    }

    print(a)
}