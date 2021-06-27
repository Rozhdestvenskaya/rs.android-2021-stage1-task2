package subtask3

class IntResultHandler : ResultHandler {
    override fun handle(array: Array<*>) = array.asSequence().filter { it is Int }.sumBy { it as Int }
}