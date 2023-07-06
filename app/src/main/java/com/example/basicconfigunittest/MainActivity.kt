package com.example.basicconfigunittest

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.basicconfigunittest.ui.theme.BasicConfigUnitTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicConfigUnitTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BasicConfigUnitTestTheme {
        Greeting("Android")
    }
}

class StringHelper {

    fun isPositiveNumber(number: Int) : Boolean {
        return number > 0
    }
fun getBuildClient(context: Context) : Class<*>? {
    try {
        var buildClient = Class.forName(context.packageName)
        var fields = buildClient.fields
        var name = buildClient.name
        return buildClient
    } catch(e: ClassNotFoundException) {
        e.printStackTrace()
    } catch(e: NoSuchFieldException) {
        e.printStackTrace()
    } catch(e: IllegalAccessException) {
        e.printStackTrace()
    }
    return null
}
}
