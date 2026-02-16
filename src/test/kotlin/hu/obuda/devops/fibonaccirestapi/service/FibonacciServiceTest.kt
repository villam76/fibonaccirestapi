package hu.obuda.devops.fibonaccirestapi.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.assertThrows


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FibonacciServiceTest {

    private val underTest = FibonacciService()

    @Test
    fun shouldReturn0WhenCall1() {
        val result = underTest.fibonacci(1)
        Assertions.assertEquals(0, result)
    }

    @Test
    fun shouldReturn1WhenCall2() {
        val result = underTest.fibonacci(2)
        Assertions.assertEquals(1, result)
    }

    @Test
    fun shouldReturn1WhenCall3() {
        val result = underTest.fibonacci(3)
        Assertions.assertEquals(1, result)
    }

    @Test
    fun shouldReturn5WhenCall6() {
        val result = underTest.fibonacci(6)
        Assertions.assertEquals(5, result)
    }

    @Test
    fun shouldReturn55WhenCall10() {
        val result = underTest.fibonacci(10)
        Assertions.assertEquals(55, result)
    }

    @Test
    fun shouldThrowExceptionWhenInputIsZero() {
        assertThrows<IllegalArgumentException> {
            underTest.fibonacci(0)
        }
    }

    @Test
    fun shouldThrowExceptionWhenInputIsNegative() {
        assertThrows<IllegalArgumentException> {
            underTest.fibonacci(-5)
        }
    }
}