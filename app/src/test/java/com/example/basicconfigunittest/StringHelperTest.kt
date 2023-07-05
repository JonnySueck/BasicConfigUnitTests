package com.example.basicconfigunittest

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class StringHelperTest {
    lateinit var SUT: StringHelper

    @Before
    fun setUp(){
        SUT = StringHelper()
    }

    @Test
    fun testPositive1(){
        val result = SUT.isPositiveNumber(2)
        assertTrue(result)
    }
}


