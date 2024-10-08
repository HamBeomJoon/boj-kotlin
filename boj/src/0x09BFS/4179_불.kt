package `0x09BFS`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import java.util.ArrayDeque
import kotlin.system.exitProcess

val dx = arrayOf(1, 0, -1, 0)
val dy = arrayOf(0, 1, 0, -1)

val map = Array(1002) { mutableListOf<Char>() }
val fire = Array(1002) { IntArray(1002) }
val jihun = Array(1002) { IntArray(1002) }

val fireQ = ArrayDeque<Pair<Int, Int>>()
val jihunQ = ArrayDeque<Pair<Int, Int>>()

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (r, c) = br.readLine().split(" ").map { it.toInt() }

    for (i in 0..<r) {
        val line = br.readLine()
        for (j in 0..<c) {
            map[i].add(line[j])

            fire[i][j] = -1
            jihun[i][j] = -1
            if (line[j] == 'F') {
                fireQ.add(Pair(i, j))
                fire[i][j] = 0
            }
            if (line[j] == 'J') {
                jihunQ.add(Pair(i, j))
                jihun[i][j] = 0
            }
        }
    }

    bfs1(r, c, map, fireQ)
    bfs2(r, c, map, jihunQ)
    println("IMPOSSIBLE")
}

fun bfs1(r: Int, c: Int, map: Array<MutableList<Char>>, queue: ArrayDeque<Pair<Int, Int>>) {

    while (queue.isNotEmpty()) {
        val q = queue.poll()
        val x = q.first
        val y = q.second

        for (dir in 0..3) {
            val nx = x + dx[dir]
            val ny = y + dy[dir]
            if (nx < 0 || nx >= r || ny < 0 || ny >= c) continue
            if (fire[nx][ny] >= 0 || map[nx][ny] == '#') continue
            fire[nx][ny] = fire[x][y] + 1
            queue.add(Pair(nx, ny))
        }
    }
}

fun bfs2(r: Int, c: Int, map: Array<MutableList<Char>>, queue: ArrayDeque<Pair<Int, Int>>) {

    while (queue.isNotEmpty()) {
        val q = queue.poll()
        val x = q.first
        val y = q.second

        for (dir in 0..3) {
            val nx = x + dx[dir]
            val ny = y + dy[dir]
            if (nx < 0 || nx >= r || ny < 0 || ny >= c) {
                println(jihun[x][y] + 1)
                exitProcess(0)
            }
            if (jihun[nx][ny] >= 0 || map[nx][ny] == '#') continue
            if (fire[nx][ny] != -1 && fire[nx][ny] <= jihun[x][y] + 1) continue
            jihun[nx][ny] = jihun[x][y] + 1
            queue.add(Pair(nx, ny))
        }
    }
}