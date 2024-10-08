package `0x09BFS`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import java.util.ArrayDeque
import kotlin.math.max


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    val dx = arrayOf(1, 0, -1, 0)
    val dy = arrayOf(0, 1, 0, -1)

    val map = Array(n + 2) { IntArray(m + 2) }
    val visit = Array(n + 2) { BooleanArray(m + 2) }
    var cnt = 0
    var mx = 0

    for (i in 0..<n) {
        st = StringTokenizer(br.readLine())
        for (j in 0..<m) {
            map[i][j] = st.nextToken().toInt()
        }
    }

    for (i in 0..<n) {
        for (j in 0..<m) {
            if (map[i][j] == 0 || visit[i][j]) continue
            cnt++
            val queue = ArrayDeque<Pair<Int, Int>>()
            visit[i][j] = true
            queue.add(Pair(i, j))
            var area = 0

            while (queue.isNotEmpty()) {
                area++
                val q = queue.poll()
                val x = q.first
                val y = q.second

                for (dir in 0..3) {
                    val nx = x + dx[dir]
                    val ny = y + dy[dir]
                    if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue
                    if (visit[nx][ny] || map[nx][ny] != 1) continue
                    visit[nx][ny] = true
                    queue.add(Pair(nx, ny))
                }
            }
            mx = max(mx, area)
        }
    }
    println(cnt)
    println(mx)
}