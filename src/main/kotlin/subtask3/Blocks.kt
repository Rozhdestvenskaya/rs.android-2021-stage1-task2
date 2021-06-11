package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        return when (blockB) {
            Int::class -> blockA.asSequence().filter { it is Int }.sumBy { it as Int }
            String::class -> blockA.asSequence().filter { it is String }.joinToString("")
            LocalDate::class -> forLocalDate(blockA)
            else -> " "
        }
    }

    fun forLocalDate(arr: Array<*>) : String {
        val df = DateTimeFormatter.ofPattern("dd.MM.yyyy")
        val list : List<LocalDate> = arr.asSequence().filter { it is LocalDate }.toList() as List<LocalDate>
        return df.format(list.sorted().last())
    }

}
