package com.pdm.foodspot.navigation


import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed interface AppRoute : NavKey

@Serializable
data object HomeRoute : AppRoute

@Serializable
data class DetailRoute(val restaurantId: Int) : AppRoute

@Serializable
data object SearchRoute : AppRoute