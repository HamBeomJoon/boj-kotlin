package week35

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val num = br.readLine().split(" ")
    val result = if (num.all { it == "0" || it == "1" }) "S" else "F"
    println(result)
}