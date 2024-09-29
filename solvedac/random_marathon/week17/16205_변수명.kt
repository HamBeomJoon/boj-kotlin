package week17

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, v) = br.readLine().split(" ")

    when (n) {
        "1" -> {
            case1(v)
        }

        "2" -> {
            case2(v)
        }

        "3" -> {
            case3(v)
        }
    }
}

fun case1(v: String) {
    println(v)

    val s = v.split(Regex("(?=[A-Z])")).map { it.lowercase() }
    println(s.joinToString("_"))

    println(v.replaceFirstChar { it.uppercase() })
}

fun case2(v: String) {
    val s = v.split("_").joinToString("") { it.replaceFirstChar { char -> char.uppercase() } }
    println(s.replaceFirstChar { it.lowercase() })

    println(v)

    println(s)
}

fun case3(v: String) {
    println(v.replaceFirstChar { it.lowercase() })

    val s = v.split(Regex("(?=[A-Z])")).filter { it.isNotEmpty() }.map { it.lowercase() }
    println(s.joinToString("_"))

    println(v)
}