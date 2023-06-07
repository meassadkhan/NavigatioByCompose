package com.example.navigatiobycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.navigatiobycompose.model.MyItem
import com.example.navigatiobycompose.ui.theme.NavigatioByComposeTheme

class MainActivity : ComponentActivity() {
    lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigatioByComposeTheme {
                val itemList = listOf(
                    MyItem("Harry Potter 1",R.drawable.first),
                    MyItem("Harry Potter 2",R.drawable.second),
                    MyItem("Harry Potter 3",R.drawable.third),
                    MyItem("Harry Potter 4",R.drawable.fourth),
                    MyItem("Harry Potter 5",R.drawable.fifth),
                    MyItem("Harry Potter 6",R.drawable.sixth),
                    MyItem("Harry Potter 7",R.drawable.seven),
                    MyItem("Harry Potter 8",R.drawable.eight),
                    MyItem("Harry Potter 8",R.drawable.sixth),
                    MyItem("Harry Potter 8",R.drawable.second),
                )
                navController = rememberNavController()
                SetupNavGraph(navController = navController, itemList)
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NavigatioByComposeTheme {
        Greeting("Android")
    }
}