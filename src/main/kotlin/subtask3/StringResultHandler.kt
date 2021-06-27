package subtask3

class StringResultHandler : ResultHandler {
    override fun handle(array: Array<*>) = array.asSequence().filter { it is String }.joinToString("")
}