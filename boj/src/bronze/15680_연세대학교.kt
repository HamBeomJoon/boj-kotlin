package bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    when (br.readLine()) {
        "0" -> print("YONSEI")
        "1" -> print("Leading the Way to the Future")
    }
}