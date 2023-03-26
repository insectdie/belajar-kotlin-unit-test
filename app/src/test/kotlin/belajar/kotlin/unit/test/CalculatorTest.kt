package belajar.kotlin.unit.test

import belajar.kotlin.unit.test.generator.SimpleDisplayNameGenerator
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.*

@DisplayNameGeneration(SimpleDisplayNameGenerator::class)
//@DisplayName("Test for Calculator test")
class CalculatorTest {
    val calculator = Calculator()

    @Test
    fun testAddSuccess() {
        val result = calculator.add(10, 10)
        assertEquals(20, result)

    }

    @Test
    fun testAddSuccess2() {
        val result = calculator.add(20, 10)
        assertEquals(30, result, "Harusnya 30")
    }

    @Test
    fun testDevideSuccess(){
        val result = calculator.divide(100,10)
        assertEquals(10, result)
    }

    @Test
    fun testDevideError(){
        assertThrows<IllegalArgumentException> {
            calculator.divide(10,0)
        }
    }
}