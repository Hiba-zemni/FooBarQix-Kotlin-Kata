package fr.sg.kata

import org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test

class FooBarQixTest {

    @Test
    fun shouldReturn1IfNumberIs1() {
        assertEquals("1", FooBarQix().transformNumber(1))
    }

    @Test
    fun shouldReturn2IfNumberIs2() {
        assertEquals("2", FooBarQix().transformNumber(2))
    }

    @Test
    fun shouldReturnFooIfNumberI32() {
        assertEquals("Foo", FooBarQix().transformNumber(3))
    }

}