fun main() {
    Suger()
}

fun Suger() = with(java.util.Scanner(System.`in`)) {
    val a = nextInt()
    var result = Int.MAX_VALUE

    for (i in 0..a / 5) { // 5kg 봉지의 개수
        val remaining = a - i * 5
        if (remaining % 3 == 0) { // 남은 무게가 3으로 나누어떨어지는지 확인
            val totalBags = i + (remaining / 3)
            result = minOf(result, totalBags) // 최소 봉지 개수 업데이트
        }
    }

    if (result == Int.MAX_VALUE) {
        println(-1) // 적합한 조합이 없을 경우
    } else {
        println(result) // 최소 봉지 개수 출력
    }
}