package com.yournus.shopping.core.router.api

import com.yournus.shopping.core.router.api.model.Route

interface Navigator {
    suspend fun navigate(route: Route, saveState: Boolean = false, launchSingleTop: Boolean = false)
    suspend fun navigateWeb(url: String)
    suspend fun navigateBack()
}