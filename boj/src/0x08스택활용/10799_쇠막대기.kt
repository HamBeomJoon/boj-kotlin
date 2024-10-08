package `0x08스택활용`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine()
    val s = Stack<Char>()
    var ans = 0

    for (i in input.indices) {
        if (input[i] == ')') {
            if (input[i-1] == '(') {
                s.pop()
                ans += s.size
            } else {
                s.pop()
                ans += 1
            }
        } else {
            s.push(input[i])
        }
    }
    println(ans)
}