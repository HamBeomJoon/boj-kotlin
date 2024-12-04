package week27

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    br.readLine()
    val a = br.readLine().toBigInteger()
    val b = br.readLine().toBigInteger()

    println(a.multiply(b))
}