package com.pdm.foodspot.data.Repository

import com.pdm.foodspot.model.Restaurant

interface RestaurantRepository {
    fun getRestaurants(): List<Restaurant>
    fun getRestaurantById(id: Int): Restaurant?
    fun searchRestaurants(query: String): List<Restaurant>
}