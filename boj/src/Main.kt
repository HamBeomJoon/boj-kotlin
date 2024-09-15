import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var str : List<String> = br.readLine().split(" ")
    bw.write("${str[0].toDouble() / str[1].toDouble()}\n")
    bw.flush()
}