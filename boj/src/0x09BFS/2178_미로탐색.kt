package `0x09BFS`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import java.util.ArrayDeque

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val dx = arrayOf(1, 0, -1, 0)
    val dy = arrayOf(0, 1, 0, -1)

    val map = Array(n + 2) { IntArray(m + 2) }
    val dist = Array(n + 2) { IntArray(m + 2) }

    for (i in 0..<n) {
        val line = br.readLine()
        for (j in 0..<m) {
            map[i][j] = line[j].toString().toInt()
            dist[i][j] = -1
        }
    }

    val queue = ArrayDeque<Pair<Int, Int>>()
    dist[0][0] = 0
    queue.add(Pair(0, 0))

    while (queue.isNotEmpty()) {
        val q = queue.poll()
        val x = q.first
        val y = q.second

        for (dir in 0..3) {
            val nx = x + dx[dir]
            val ny = y + dy[dir]
            if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue
            if (dist[nx][ny] >= 0 || map[nx][ny] != 1) continue
            dist[nx][ny] = dist[x][y] + 1
            queue.add(Pair(nx, ny))
        }
    }

    println(dist[n - 1][m - 1] + 1)
}