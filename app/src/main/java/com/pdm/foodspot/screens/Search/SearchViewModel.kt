package com.pdm.foodspot.screens.Search

import androidx.lifecycle.ViewModel

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import com.pdm.foodspot.model.Restaurant
import com.pdm.foodspot.data.Repository.RestaurantRepository
import com.pdm.foodspot.data.Repository.RestaurantRepositoryImpl


data class SearchUiState(
    val query: String = "",
    val results: List<Restaurant> = emptyList(),
    val hasSearched: Boolean = false
)

class SearchViewModel(
    private val repository: RestaurantRepository = RestaurantRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(SearchUiState())
    val uiState: StateFlow<SearchUiState> = _uiState.asStateFlow()

    fun onQueryChange(newQuery: String) {
        val results = repository.searchRestaurants(newQuery)
        _uiState.value = SearchUiState(
            query = newQuery,
            results = results,
            hasSearched = newQuery.isNotBlank()
        )
    }
}