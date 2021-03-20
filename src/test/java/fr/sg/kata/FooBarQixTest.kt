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
    fun shouldReturnBarBarIfNumberI5() {
        assertEquals("BarBar", FooBarQix().transformNumber(5))
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
    fun shouldReturn12FooFoo4BarBarIfNumberIsFrom1to5() {
        assertEquals(listOf("1", "2", "FooFoo", "4", "BarBar"), FooBarQix().transformNumber((1..5).toList()))
    }

    @Test
    fun shouldReturn12Foo4BarBarFooQix8FooBarIfNumberIsFrom1to10() {
        assertEquals(listOf("1", "2", "FooFoo", "4", "BarBar", "Foo", "Qix", "8", "Foo", "Bar"), FooBarQix().transformNumber((1..10).toList()))
    }

    @Test
    fun shouldReturnQixIfNumberI7() {
        assertEquals("Qix", FooBarQix().transformNumber(7))
    }

    @Test
    fun shouldReturnFooBarIfNumberIs51() {
        assertEquals("FooBar", FooBarQix().transformNumber(51))
    }

    @Test
    fun shouldReturnBarFooIfNumberIs53() {
        assertEquals("BarFoo", FooBarQix().transformNumber(53))
    }

    @Test
    fun shouldReturnFooIfNumberIs13() {
        assertEquals("Foo", FooBarQix().transformNumber(13))
    }

    @Test
    fun shouldReturnFooBarBarIfNumberIs15() {
        assertEquals("FooBarBar", FooBarQix().transformNumber(15))
    }

    @Test
    fun shouldReturnFooQixIfNumberIs27() {
        assertEquals("FooQix", FooBarQix().transformNumber(27))
    }




}