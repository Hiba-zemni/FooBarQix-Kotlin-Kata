package fr.sg.kata

import org.junit.jupiter.api.Assertions
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
    fun shouldReturnFooFooIfNumberI3() {
        assertEquals("FooFoo", FooBarQix().transformNumber(3))
    }

    @Test
    fun shouldReturnFooIfNumberI6() {
        assertEquals("Foo", FooBarQix().transformNumber(6))
    }

    @Test
    fun shouldReturnBarIfNumberI5() {
        assertEquals("Bar", FooBarQix().transformNumber(5))
    }

    @Test
    fun shouldReturnBarIfNumberI10() {
        assertEquals("Bar", FooBarQix().transformNumber(10))
    }

    @Test
    fun shouldReturn12IfNumberIsFrom1to2() {
        assertEquals(listOf("1", "2"), FooBarQix().transformNumber(listOf(1, 2)))
    }

    @Test
    fun shouldReturn12FooFooIfNumberIsFrom1to3() {
        assertEquals(listOf("1", "2", "FooFoo"), FooBarQix().transformNumber(listOf(1, 2, 3)))
    }

    @Test
    fun shouldReturn12FooFoo4BarIfNumberIsFrom1to5() {
        assertEquals(listOf("1", "2", "FooFoo", "4", "Bar"), FooBarQix().transformNumber((1..5).toList()))
    }

    @Test
    fun shouldReturn12Foo4BarFoo78FooBarIfNumberIsFrom1to10() {
        assertEquals(listOf("1", "2", "FooFoo", "4", "Bar", "Foo", "7", "8", "Foo", "Bar"), FooBarQix().transformNumber((1..10).toList()))
    }



}