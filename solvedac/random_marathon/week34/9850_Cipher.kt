package week34

import java.io.BufferedReader
import java.io.InputStreamReader

fun decrypt(txt: String): String {
    val targetWords = listOf("CHIPMUNKS", "LIVE")

    fun decryptWithKey(text: String, key: Int): String {
        return text.map { char ->
            if (char in 'A'..'Z') {
                val shifted = (char.code - 65 - key + 26) % 26 + 65
                shifted.toChar()
            } else {
                char
            }
        }.joinToString("")
    }

    for (key in 0 until 26) {
        val decryptedText = decryptWithKey(txt, key)
        if (targetWords.all { word -> decryptedText.contains(word) }) {
            return decryptedText
        }
    }

    return ""
}

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    print(decrypt(br.readLine()))
}