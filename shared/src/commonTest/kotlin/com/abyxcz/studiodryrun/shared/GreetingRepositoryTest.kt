package com.abyxcz.studiodryrun.shared

import kotlin.test.Test
import kotlin.test.assertEquals

class GreetingRepositoryTest {
    private val repository = GreetingRepository()

    @Test
    fun greetsAName() {
        assertEquals("Hello, Ada!", repository.greet("Ada"))
    }

    @Test
    fun greetsAStrangerWhenBlank() {
        assertEquals("Hello, stranger!", repository.greet("   "))
    }

    @Test
    fun recordsNamesInOrderExcludingBlanks() {
        repository.greet("Ada")
        repository.greet("")
        repository.greet("Grace")
        assertEquals(listOf("Ada", "Grace"), repository.greeted())
    }
}
