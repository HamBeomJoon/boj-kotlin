package `0x08스택활용`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val s = Stack<Char>()
        var flag = true
        val str = br.readLine()
        if (str == ".") break

        for (i in str) {
            if (i == '(' || i == '[') {
                s.push(i)
            } else if (i == ')') {
                if (s.empty() || s.pop() != '(') {
                    flag = false
                    break
                }
            } else if (i ==']') {
                if (s.empty() || s.pop() != '[') {
                    flag = false
                    break
                }
            }
        }

        if (!s.empty()) flag = false
        if (flag) println("yes") else println("no")
    }
}