package week17

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val cardList = mutableListOf<Pair<Int, Int>>()
    for (i in 0..<n) {
        val card = br.readLine().split(" ").map { it.toInt() }
        for (c in card) {
            cardList.add(Pair(i + 1, c))
        }
    }

    playGame(cardList)
}

fun playGame(cardList: MutableList<Pair<Int, Int>>) {
    var target = 1
    while (cardList.size > 1) {
        val newTarget = if (target - 1 >= 0) target - 1 else cardList.size - 1
        val x = cardList.removeAt(newTarget)
        target = (newTarget + x.second) % cardList.size
    }

    println("${cardList.first().first} ${cardList.first().second}")
}