// CustomDataStructure.kt
class CustomDataStructure {
    private val list = ArrayList<Int>()
    private val map = HashMap<Int, Int>()

    // Adds an element in O(1) time
    fun add(value: Int) {
        if (!map.containsKey(value)) {
            list.add(value)
            map[value] = list.size - 1
        }
    }


    fun remove(value: Int): Boolean {
        if (!map.containsKey(value)) return false


        val index = map[value]!!


        val lastElement = list[list.size - 1]

        // Move the last element to the position of the removed element
        list[index] = lastElement
        map[lastElement] = index

        // Remove the last element
        list.removeAt(list.size - 1)
        map.remove(value)

        return true
    }

    // Checks if an element exists in O(1) time
    fun contains(value: Int): Boolean {
        return map.containsKey(value)
    }

    // Retrieves the current list of elements
    fun getList(): List<Int> {
        return list
    }
}
