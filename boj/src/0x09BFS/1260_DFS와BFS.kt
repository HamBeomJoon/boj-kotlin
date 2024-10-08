package `0x09BFS`

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import kotlin.collections.ArrayList

private val sb = StringBuilder()

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m, v) = br.readLine().split(" ").map { it.toInt() }
    val graph = Array(n + 1) { IntArray(n + 1) }
    var visit = ArrayList<Int>()

    repeat(m) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }

        graph[x][y] = 1
        graph[y][x] = 1
    }

    dfs(v, graph, visit)
    sb.appendLine()

    visit = ArrayList()
    bfs(v, graph, visit)
    println(sb.toString())
}

fun dfs(start: Int, graph: Array<IntArray>, visit: ArrayList<Int>) {
    visit.add(start)
    sb.append("$start ")

    for (i in 1..<graph.size) {
        if (graph[start][i] == 1 && !visit.contains(i)) {
            dfs(i, graph, visit)
        }
    }
}

fun bfs(start: Int, graph: Array<IntArray>, visit: ArrayList<Int>) {
    val queue = LinkedList<Int>()
    queue.add(start)
    visit.add(start)

    while (queue.isNotEmpty()) {
        val x = queue.poll()
        sb.append("$x ")

        for (i in 1..<graph.size) {
            if (graph[x][i] == 1 && !visit.contains(i)) {
                queue.add(i)
                visit.add(i)
            }
        }
    }
}