package com.example.navigatiobycompose

import android.view.Surface
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun DetailScreen(navHostController: NavHostController) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
                    Text(
                        text = "Detail Screen",
                        color = MaterialTheme.colors.primary,
                        fontSize = MaterialTheme.typography.h4.fontSize,
                        fontWeight = FontWeight.Bold,

                    )


            Button(
                onClick = {
                          navHostController.navigate(Screen.ShowItems.route)
                          /*{
                              popUpTo(Screen.Home.route){
                                  inclusive = true
                              }
                          }*/
                        //  navHostController.popBackStack()

                },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue)
            ) {
                    Text(
                        text = "Navigate to HomeScreen",
                        color = Color.White
                    )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun DetailScreenPreview() {
    DetailScreen(navHostController = rememberNavController())
}