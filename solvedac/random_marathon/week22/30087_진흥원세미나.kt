package week22

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val seminar = mapOf(
        "Algorithm" to "204", "DataAnalysis" to "207", "ArtificialIntelligence" to "302",
        "CyberSecurity" to "B101", "Network" to "303", "Startup" to "501", "TestStrategy" to "105"
    )
    repeat(br.readLine().toInt()) {
        println(seminar[br.readLine()])
    }
}