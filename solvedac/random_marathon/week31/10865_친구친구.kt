package week31

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()
    val cnt = IntArray(n + 1)

    repeat(m) {
        val edge = StringTokenizer(br.readLine())
        cnt[edge.nextToken().toInt()]++
        cnt[edge.nextToken().toInt()]++
    }

    val sb = StringBuilder()
    for (i in 1..n) {
        sb.append(cnt[i]).append("\n")
    }
    print(sb)
}
