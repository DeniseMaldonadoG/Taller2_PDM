package com.pdm.foodspot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import com.pdm.foodspot.ui.theme.FoodSpotTheme
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.pdm.foodspot.navigation.HomeRoute
import com.pdm.foodspot.navigation.DetailRoute
import com.pdm.foodspot.navigation.SearchRoute
import com.pdm.foodspot.screens.Home.HomeScreen
import com.pdm.foodspot.screens.Detail.DetailScreen
import com.pdm.foodspot.screens.Search.SearchScreen



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodSpotTheme {
                FoodSpotNavDisplay()
            }
        }
    }
}



@Composable
fun FoodSpotNavDisplay() {

    val backStack = rememberNavBackStack(HomeRoute)

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<HomeRoute> {
                HomeScreen(
                    onRestaurantClick = { restaurantId ->
                        backStack.add(DetailRoute(restaurantId))
                    },
                    onSearchClick = {
                        backStack.add(SearchRoute)
                    }
                )
            }

            entry<DetailRoute> { route ->
                DetailScreen(
                    restaurantId = route.restaurantId,
                    onBack = { backStack.removeLastOrNull() }
                )
            }

            entry<SearchRoute> {
                SearchScreen(
                    onBack = { backStack.removeLastOrNull() },
                    onRestaurantClick = { restaurantId ->
                        backStack.add(DetailRoute(restaurantId))
                    }
                )
            }
        }
    )
}