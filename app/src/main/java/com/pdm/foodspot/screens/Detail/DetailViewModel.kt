package com.pdm.foodspot.screens.Detail


import androidx.lifecycle.ViewModel
import com.pdm.foodspot.data.Repository.RestaurantRepositoryImpl
import com.pdm.foodspot.data.Repository.RestaurantRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import com.pdm.foodspot.model.Restaurant


data class DetailUiState(
    val restaurant: Restaurant? = null,
    val toastMessage: String? = null
)

class DetailViewModel(
    private val repository: RestaurantRepository = RestaurantRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(DetailUiState())
    val uiState: StateFlow<DetailUiState> = _uiState.asStateFlow()

    fun loadRestaurant(restaurantId: Int) {
        val restaurant = repository.getRestaurantById(restaurantId)
        _uiState.value = _uiState.value.copy(restaurant = restaurant)
    }

    fun addToCart(dishName: String) {
        _uiState.value = _uiState.value.copy(
            toastMessage = "$dishName agregado al carrito"
        )
    }

    fun onToastShown() {
        _uiState.value = _uiState.value.copy(toastMessage = null)
    }
}