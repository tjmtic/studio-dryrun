package com.abyxcz.studiodryrun

import kotlin.test.Test
import kotlin.test.assertEquals

class GreetingTest {
    @Test
    fun greetingForNamedGivesHelloName() {
        assertEquals("Hello, Studio!", greetingFor("Studio"))
    }

    @Test
    fun greetingForBlankGivesHelloStranger() {
        assertEquals("Hello, stranger!", greetingFor(""))
    }
}
