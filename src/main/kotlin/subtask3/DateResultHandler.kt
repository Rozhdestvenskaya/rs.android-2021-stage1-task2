package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class DateResultHandler : ResultHandler {
    override fun handle(array: Array<*>): Any {
        val df = DateTimeFormatter.ofPattern("dd.MM.yyyy")
        val list : List<LocalDate> = array.asSequence().filter { it is LocalDate }.toList() as List<LocalDate>
        return df.format(list.sorted().last())
    }
}