package com.pdm.foodspot.screens.Home


import androidx.lifecycle.ViewModel
import com.pdm.foodspot.data.Repository.RestaurantRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import com.pdm.foodspot.data.Repository.RestaurantRepository
import com.pdm.foodspot.model.Restaurant

data class HomeUiState(
    val restaurantsByCategory: Map<String, List<Restaurant>> = emptyMap()
)

class HomeViewModel(
    private val repository: RestaurantRepository = RestaurantRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

    init {
        loadRestaurants()
    }

    private fun loadRestaurants() {
        val restaurants = repository.getRestaurants()

        // Group dynamically by category — categories come from the data itself
        val grouped = mutableMapOf<String, MutableList<Restaurant>>()
        restaurants.forEach { restaurant ->
            restaurant.categories.forEach { category ->
                grouped.getOrPut(category) { mutableListOf() }.add(restaurant)
            }
        }

        _uiState.value = HomeUiState(restaurantsByCategory = grouped)
    }
}