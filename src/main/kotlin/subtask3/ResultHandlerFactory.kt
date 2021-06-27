package subtask3

import java.lang.UnsupportedOperationException
import java.time.LocalDate
import kotlin.reflect.KClass

class ResultHandlerFactory {
    companion object {
        fun getInstance(kclass: KClass<*>) : ResultHandler {
            return when (kclass) {
                Int::class -> IntResultHandler()
                String::class -> StringResultHandler()
                LocalDate::class -> DateResultHandler()
                else -> throw UnsupportedOperationException()
            }
        }
    }
}