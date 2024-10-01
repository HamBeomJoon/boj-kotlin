package week17

import java.io.BufferedReader
import java.io.InputStreamReader

val check = BooleanArray(10001)
val prime = mutableListOf<Int>()
var ans = 0

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    checkPrime()

    for (i in 0 until prime.size - 1) {
        val mul = prime[i] * prime[i + 1]
        if (mul > n) {
            ans = mul
            break
        }
    }
    println(ans)
}

fun checkPrime() {
    for (i in 2..106) {
        if (i * i > 10000) break
        if (check[i]) continue
        for (j in i + i..10000 step i) {
            check[j] = true
        }
    }

    for (i in 2..10000) {
        if (!check[i]) prime.add(i)
    }
}