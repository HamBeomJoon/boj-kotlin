package week15import java.io.BufferedReaderimport java.io.InputStreamReaderfun main() {    val br = BufferedReader(InputStreamReader(System.`in`))    val s = br.readLine()    if (s == "N" || s == "n") {        println("Naver D2")    } else {        println("Naver Whale")    }}