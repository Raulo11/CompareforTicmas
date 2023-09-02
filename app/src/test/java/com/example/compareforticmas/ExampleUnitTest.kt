package com.example.compareforticmas.viewmodel

import org.junit.Assert.assertEquals
import org.junit.Test

class MyViewModelTest {

    @Test
    fun testCompareStrings() {
        val string1 = "Hello"
        val string2 = "World"

        val result = compareStrings(string1, string2)

        assertEquals("Las cadenas son diferentes", result)
    }

    private fun compareStrings(string1: String, string2: String): String {
        return if (string1 == string2) {
            "Las cadenas son iguales"
        } else {
            "Las cadenas son diferentes"
        }
    }
}