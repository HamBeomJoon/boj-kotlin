package bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    when (br.readLine()) {
        "NLCS" -> println("North London Collegiate School")
        "BHA" -> println("Branksome Hall Asia")
        "KIS" -> println("Korea International School")
        "SJA" -> println("St. Johnsbury Academy")
    }
}