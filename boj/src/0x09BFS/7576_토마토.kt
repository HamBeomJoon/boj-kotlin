package `0x09BFS`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import java.util.ArrayDeque
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (m, n) = br.readLine().split(" ").map { it.toInt() }

    val dx = arrayOf(1, 0, -1, 0)
    val dy = arrayOf(0, 1, 0, -1)

    val map = Array(n + 2) { IntArray(m + 2) }
    val dist = Array(n + 2) { IntArray(m + 2) }

    val queue = ArrayDeque<Pair<Int, Int>>()
    for (i in 0..<n) {
        val st = StringTokenizer(br.readLine())
        for (j in 0..<m) {
            map[i][j] = st.nextToken().toInt()
            if (map[i][j] == 1) queue.add(Pair(i, j))
            if (map[i][j] == 0) dist[i][j] = -1
        }
    }

    while (queue.isNotEmpty()) {
        val q = queue.poll()
        val x = q.first
        val y = q.second

        for (dir in 0..3) {
            val nx = x + dx[dir]
            val ny = y + dy[dir]
            if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue
            if (dist[nx][ny] >= 0) continue
            dist[nx][ny] = dist[x][y] + 1
            queue.add(Pair(nx, ny))
        }
    }

    var ans = 0
    for (i in 0..<n) {
        for (j in 0..<m) {
            if (dist[i][j] == -1) {
                println(-1)
                return
            }
            ans = max(ans, dist[i][j])
        }
    }
    println(ans)
}