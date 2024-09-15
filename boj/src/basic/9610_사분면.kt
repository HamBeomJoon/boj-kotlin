import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    // 첫째 줄에 점의 개수 n (1 ≤ n ≤ 1000)이 주어진다. 다음 n개 줄에는 점의 좌표 (xi, yi)가 주어진다. (-10**6 ≤ xi, yi ≤ 10**6)
    //각 사분면과 축에 점이 몇 개 있는지를 예제 출력과 같은 형식으로 출력한다.

//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var q1 = 0
    var q2 = 0
    var q3 = 0
    var q4 = 0
    var axis = 0
    for (i in 1..nextInt()) {
        val x = nextInt()
        val y = nextInt()

        if (x > 0 && y > 0) {
            q1 += 1
        } else if (x > 0 && y < 0) {
            q4 += 1
        } else if (x < 0 && y < 0) {
            q3 += 1
        } else if (x < 0 && y > 0) {
            q2 += 1
        } else {
            axis += 1
        }
    }
    println("Q1: $q1")
    println("Q2: $q2")
    println("Q3: $q3")
    println("Q4: $q4")
    print("AXIS: $axis")
}