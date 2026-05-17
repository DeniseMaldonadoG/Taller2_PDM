package com.pdm.foodspot.data.Repository


import com.pdm.foodspot.model.Restaurant
import com.pdm.foodspot.data.restaurantList

class RestaurantRepositoryImpl : RestaurantRepository {

    private val restaurants = restaurantList

    override fun getRestaurants(): List<Restaurant> = restaurants

    override fun getRestaurantById(id: Int): Restaurant? =
        restaurants.find { it.id == id }

    override fun searchRestaurants(query: String): List<Restaurant> {
        if (query.isBlank()) return emptyList()

        val q = query.trim().lowercase()

        return restaurants.filter { restaurant ->
            restaurant.name.lowercase().contains(q) ||
                    restaurant.menu.any { dish ->
                        dish.name.lowercase().contains(q)
                    }
        }
    }
}