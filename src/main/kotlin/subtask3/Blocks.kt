package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        val handler: ResultHandler = ResultHandlerFactory.getInstance(blockB)
        return handler.handle(blockA)
    }
}
