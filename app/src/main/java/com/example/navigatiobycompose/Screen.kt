package com.example.navigatiobycompose

sealed class Screen(val route:String){
    object Home:Screen(route = "home_screen")
    object Detail:Screen(route = "detail_screen")
    object ShowItems:Screen(route = "items_screen")
}
