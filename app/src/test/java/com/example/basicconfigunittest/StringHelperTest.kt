package com.example.basicconfigunittest

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.RuntimeEnvironment

@RunWith(RobolectricTestRunner::class)
class StringHelperTest {
    lateinit var SUT: StringHelper
    var namespace = "com.example.basicconfigunittest"

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
        val app = RuntimeEnvironment.getApplication()
        val appNamespace = app?.packageName.toString()
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



