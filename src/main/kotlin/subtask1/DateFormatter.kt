package subtask1

import java.time.DateTimeException
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.Month
import java.time.format.TextStyle
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        val unexpectedResult = "Такого дня не существует"
        val regex = "[0-9]+".toRegex()
        if ((day + month + year).matches(regex = regex)) {
            return try {
                val localDate = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
                val resultMonth = Month.valueOf(localDate.month.name).getDisplayName(TextStyle.FULL, Locale("ru"))
                val resultDay = DayOfWeek.valueOf(localDate.dayOfWeek.name).getDisplayName(TextStyle.FULL, Locale("ru"))
                "$day $resultMonth, $resultDay"
            } catch (e: DateTimeException) {
                unexpectedResult
            }
        }
        return unexpectedResult
    }
}
