package com.example.basicconfigunittest

import android.content.Context
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.RuntimeEnvironment
import org.robolectric.util.ReflectionHelpers

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
//    @Test
//    fun testBasicConfig() {
//        val app = RuntimeEnvironment.getApplication()
//        val result = SUT.getBuildClient(app)
//    }




