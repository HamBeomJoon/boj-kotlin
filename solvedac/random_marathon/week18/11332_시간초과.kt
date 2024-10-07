package week18

import java.io.BufferedReader
import java.io.InputStreamReader

fun pow2(n: Int): Long {
    var b: Long = 1
    for (i in 0 until n) {
        b *= 2
    }
    return b
}

fun facto(n: Int): Long {
    return if (n <= 1) 1 else n * facto(n - 1)
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var c = br.readLine().toInt()

    while (c-- > 0) {
        val input = br.readLine().split(" ")
        val str = input[0]
        val n = input[1].toLong()
        val t = input[2].toLong()
        val l = input[3].toLong()

        when (str) {
            "O(N^2)" -> {
                if (n > 35000) {
                    println("TLE!")
                } else {
                    if (t * n * n <= l * 100000000) {
                        println("May Pass.")
                    } else {
                        println("TLE!")
                    }
                }
            }

            "O(N^3)" -> {
                if (n > 1000) {
                    println("TLE!")
                } else {
                    if (t * n * n * n <= l * 100000000) {
                        println("May Pass.")
                    } else {
                        println("TLE!")
                    }
                }
            }

            "O(2^N)" -> {
                if (n >= 30) {
                    println("TLE!")
                } else {
                    if (t * pow2(n.toInt()) <= l * 100000000) {
                        println("May Pass.")
                    } else {
                        println("TLE!")
                    }
                }
            }

            "O(N!)" -> {
                if (n > 12) {
                    println("TLE!")
                } else {
                    if (t * facto(n.toInt()) <= l * 100000000) {
                        println("May Pass.")
                    } else {
                        println("TLE!")
                    }
                }
            }

            else -> {
                if (t * n <= l * 100000000) {
                    println("May Pass.")
                } else {
                    println("TLE!")
                }
            }
        }
    }
}