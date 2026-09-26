package com.abyxcz.studiodryrun.shared

/** Remembers the names it has greeted, in order, excluding blanks. */
class GreetingRepository {
    private val names = mutableListOf<String>()

    fun greet(name: String): String {
        val trimmed = name.trim()
        if (trimmed.isEmpty()) {
            return "Hello, stranger!"
        }
        names += trimmed
        return "Hello, $trimmed!"
    }

    fun greeted(): List<String> = names.toList()
}
