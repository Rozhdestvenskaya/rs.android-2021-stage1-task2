package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        val firstArr = a.toUpperCase().toCharArray()
        val secondArr = b.toCharArray()
        val intersectedArray = firstArr.intersect(secondArr.toList())
        if (intersectedArray.joinToString("") == b) {
            return "YES"
        }
        return "NO"
    }
}
