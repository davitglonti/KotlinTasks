package algorithms

// CountVariants.kt
fun countVariants(stearsCount: Int): Int {
    if (stearsCount == 0) return 0
    if (stearsCount == 1) return 1
    if (stearsCount == 2) return 2

    var first = 1
    var second = 2
    var result = 0

    for (i in 3..stearsCount) {
        result = first + second
        first = second
        second = result
    }

    return result
}
