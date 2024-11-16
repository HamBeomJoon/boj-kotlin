package week24

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    while (true) {
        val pw = br.readLine()
        if (pw == "end") break
        if (check(pw)) {
            println("<$pw> is acceptable.")
        } else {
            println("<$pw> is not acceptable.")
        }
    }
}

fun check(input: String): Boolean {
    val pw = input.toCharArray()
    val vowel = listOf('a', 'e', 'i', 'o', 'u')
    var check1 = false
    var check2 = true
    var check3 = true

    for (i in vowel) {
        if (pw.contains(i)) check1 = true
    }

    for (i in 0..pw.size - 3) {
        if (pw[i] in vowel && pw[i + 1] in vowel && pw[i + 2] in vowel) {
            check2 = false
        } else if (pw[i] !in vowel && pw[i + 1] !in vowel && pw[i + 2] !in vowel) {
            check2 = false
        }
    }

    for (i in 0..pw.size - 2) {
        if (pw[i] == pw[i + 1]) {
            if (pw[i] == 'e' || pw[i] == 'o') continue
            else check3 = false
        }
    }

    return check1 && check2 && check3
}