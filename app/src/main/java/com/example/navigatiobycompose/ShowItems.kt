package com.example.navigatiobycompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.navigatiobycompose.model.MyItem

@Composable
fun MyRecyclerView(navHostController: NavHostController, items: List<MyItem>) {

    Scaffold(
        topBar = {
            MyTopAppBar(title = "Items", onBackPressed = { navHostController.popBackStack() })
        },
        content = {
            it.toString()
            LazyColumn {
                items(items) { item ->
                    ListItem(item = item, navHostController)
                }
            }
        }
    )
}

@Composable
fun ListItem(item: MyItem, navHostController: NavHostController) {
    Row(
        modifier = Modifier
            .padding(16.dp)
            //.background(Color.Blue)
            .fillMaxWidth()
            .clickable {
                navHostController.navigate("${Screen.MyCardView.route}/${item.title}/${item.imageResId}")
            },
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,

        ) {
        Image(
            painter = painterResource(id = item.imageResId ?: R.drawable.first),
            contentDescription = item.title,
            modifier = Modifier.size(100.dp)

        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = item?.title ?: "Harry Potter", style = MaterialTheme.typography.body1)
    }
}

@Preview
@Composable
fun Preview() {
    MyRecyclerView(navHostController = rememberNavController(), listOf())
}

