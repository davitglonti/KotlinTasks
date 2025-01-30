// LongestPrefix.kt
fun longestPrefix(array: Array<String>): String {
    if (array.isEmpty()) return ""
    var prefix = array[0]

    for (word in array) {
        while (!word.startsWith(prefix)) {
            prefix = prefix.dropLast(1)
            if (prefix.isEmpty()) return ""
        }
    }

    return prefix
}
