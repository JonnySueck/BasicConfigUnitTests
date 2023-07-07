package com.example.basicconfigunittest

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

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


    @Test
    fun testNamespace() {
        var namespace = "com.example.basicconfigunittest"
        val appNamespace = BuildConfig.APPLICATION_ID
        assertEquals(appNamespace, namespace)
    }


    @Test
    fun testDevMode() {
        if(BuildConfig.DEBUG == true) { // if debug mode is true -> dev mode is on
            assertEquals(BuildConfig.DEV_MODE_ENABLED, true)
        } else { // if debug mode is false -> dev mode is off
            assertEquals(BuildConfig.DEV_MODE_ENABLED, false)
        }
    }


    @Test
    fun testApiKey() {
        val testKey = "123456789A"
        val APIKey = BuildConfig.API_KEY
        assertEquals(APIKey, testKey)
    }
}
