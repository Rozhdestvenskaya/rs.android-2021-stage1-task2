package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        val list = ArrayList<Char>()
        for(i in a){
            if(b.contains(i, true)) list.add(i)
        }
        return when(list.joinToString("").toUpperCase()){
            b -> "YES"
            else ->  "NO"
        }
    }
}


