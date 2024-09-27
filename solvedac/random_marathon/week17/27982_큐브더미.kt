package week17

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val cubes = mutableListOf<Triple<Int, Int, Int>>()

    repeat(m) {
        val (x, y, z) = br.readLine().split(" ").map { it.toInt() }
        cubes.add(Triple(x, y, z))
    }

    var ans = 0
    for ((x, y, z) in cubes) {
        if (cubes.contains(Triple(x + 1, y, z)) && cubes.contains(Triple(x - 1, y, z))
            && cubes.contains(Triple(x, y - 1, z)) && cubes.contains(Triple(x, y + 1, z))
            && cubes.contains(Triple(x, y, z - 1)) && cubes.contains(Triple(x, y, z + 1))
        ) {
            ans++
        }
    }
    println(ans)
}