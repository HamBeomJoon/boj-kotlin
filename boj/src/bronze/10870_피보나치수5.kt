package bronzeimport java.io.BufferedReaderimport java.io.InputStreamReaderfun main() {    val br = BufferedReader(InputStreamReader(System.`in`))    val num = br.readLine().toInt()    var fibo = arrayOf(0, 1)    for (i in 2..20) {        fibo += fibo[i - 1] + fibo[i - 2]    }    println(fibo[num])}