// MinSplit.kt
fun minSplit(amount: Int): Int {
    val coins = intArrayOf(50, 20, 10, 5, 1)
    var remainingAmount = amount
    var coinCount = 0

    for (coin in coins) {
        coinCount += remainingAmount / coin
        remainingAmount %= coin  //
    }

    return coinCount
}
