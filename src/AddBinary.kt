// AddBinary.kt
fun addBinary(a: String, b: String): String {
    var i = a.length - 1
    var j = b.length - 1
    var carry = 0
    val result = StringBuilder()

    while (i >= 0 || j >= 0 || carry != 0) {
        var sum = carry
        if (i >= 0) sum += a[i--] - '0'
        if (j >= 0) sum += b[j--] - '0'
        carry = sum / 2
        result.append(sum % 2)
    }

    return result.reverse().toString()
}
