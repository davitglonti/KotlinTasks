//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //1 Task
    val nums = intArrayOf(2, 2, 1, 4, 4)
    println(singleNumber(nums))
    //

    //2 Task
    val amount = 87
    println(minSplit(amount))

    //3 Task
    val array = arrayOf("extract", "exhale", "excavate")
    println(longestPrefix(array))  // Output: "ex"

    //4 Task
    val a = "1010"
    val b = "1011"
    println(addBinary(a, b))  // Output: "10101"
    //
    //5 Task

    val stearsCount = 5
    println(countVariants(stearsCount)) // Output: 8

    //

    //6 Task
    val dataStructure = CustomDataStructure()

    dataStructure.add(10)
    dataStructure.add(20)
    dataStructure.add(30)

    println(dataStructure.getList())  // [10, 20, 30]

    dataStructure.remove(20)
    println(dataStructure.getList())  // [10, 30]
}
