package week16import java.io.BufferedReaderimport java.io.InputStreamReaderimport kotlin.math.ceilimport kotlin.math.maximport kotlin.math.minvar rh = 0var rv = 0var sh = 0var sv = 0fun main() {    val br = BufferedReader(InputStreamReader(System.`in`))    val input = br.readLine().split(" ").map { it.toInt() }    rh = input[0]    rv = input[1]    sh = input[2]    sv = input[3]    val n = br.readLine().toInt()    var ans = 100000009     // 최대값은 100 * 100 * 10000원 같다.    repeat(n) {        val (mrh, mrv, msh, msv, pri) = br.readLine().split(" ").map { it.toInt() }        ans = min(ans, cal(mrh, mrv, msh, msv, pri))    }    println(ans)}fun cal(mrh: Int, mrv: Int, msh: Int, msv: Int, pri: Int): Int {    val h = max(ceil(rh / mrh.toDouble()), ceil(sh / msh.toDouble())).toInt()    val w = max(ceil(rv / mrv.toDouble()), ceil(sv / msv.toDouble())).toInt()    // 90도 회전도 가능하다..    val rotateH = max(ceil(rh / mrv.toDouble()), ceil(sh / msv.toDouble())).toInt()    val rotateW = max(ceil(rv / mrh.toDouble()), ceil(sv / msh.toDouble())).toInt()    return min(h * w * pri, rotateW * rotateH * pri)}