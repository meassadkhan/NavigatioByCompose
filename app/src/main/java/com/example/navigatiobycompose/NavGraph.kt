package com.example.navigatiobycompose

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navigatiobycompose.model.DetailsModel
import com.example.navigatiobycompose.model.MyItem

@Composable
fun SetupNavGraph(navController: NavHostController, items: List<MyItem>){
    NavHost(navController =navController , startDestination = Screen.Home.route ){
        composable(
            route = Screen.Home.route
        ){
            HomeScreen(navController)
        }
        composable(
            route = Screen.Detail.route
        ){
            DetailScreen(navController)
        }

        composable(
            route = Screen.ShowItems.route
        ){
            MyRecyclerView(items =items , navHostController = navController)
        }
        composable(
            route = "${Screen.MyCardView.route}/{name}/{age}"
        ){ backStackEntry ->
            val name = backStackEntry.arguments?.getString("name") ?: ""
            val image = backStackEntry.arguments?.getInt("age") ?: 0
            MyCardView(detailsModel = DetailsModel(name,image)){}
        }
    }
}