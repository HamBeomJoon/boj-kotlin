package `0x03배열`import java.io.BufferedReaderimport java.io.InputStreamReaderfun main() {    val br = BufferedReader(InputStreamReader(System.`in`))    val arr = IntArray(26)    val word = br.readLine()    for (i in word) {        arr[i - 'a']++    }    println(arr.joinToString(" "))}