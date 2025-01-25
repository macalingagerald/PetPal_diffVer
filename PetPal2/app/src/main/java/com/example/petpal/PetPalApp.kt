package com.example.petpal

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Pets
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.petpal.screens.AdoptionsScreen
import com.example.petpal.screens.ServicesScreen

sealed class Screen(val route: String, val icon: ImageVector, val label: String) {
    object Catalog : Screen("catalog", Icons.Default.Home, "Catalog")
    object Services : Screen("services", Icons.Default.List, "Services")
    object Adoptions : Screen("adoptions", Icons.Default.Pets, "Adoptions")
}


@Composable
fun PetPalApp() {
    val navController = rememberNavController()
    val screens = listOf(Screen.Catalog, Screen.Services, Screen.Adoptions)

    Scaffold(
        bottomBar = {
            NavigationBar {
                screens.forEach { screen ->
                    NavigationBarItem(
                        icon = { Icon(screen.icon, contentDescription = screen.label) },
                        label = { Text(screen.label) },
                        selected = navController.currentDestination?.route == screen.route,
                        onClick = {
                            navController.navigate(screen.route) {
                                popUpTo(navController.graph.startDestinationId) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    )
                }
            }
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = "login",
            modifier = Modifier.padding(paddingValues)
        ) {
            composable("login") {
                LoginScreen(
                    onLoginSuccess = {
                        navController.navigate(Screen.Catalog.route) {
                            popUpTo("login") { inclusive = true }
                        }
                    }
                )
            }
            addCatalog(navController)
            addServices(navController)
            addAdoptions(navController)
        }
    }
}


// Catalog screen navigation setup
fun NavGraphBuilder.addCatalog(navController: NavHostController) {
    composable(Screen.Catalog.route) {
        CatalogScreen()
    }
}

// Services screen placeholder
fun NavGraphBuilder.addServices(navController: NavHostController) {
    composable(Screen.Services.route) {
        ServicesScreen()
    }
}

// Adoptions screen placeholder
fun NavGraphBuilder.addAdoptions(navController: NavHostController) {
    composable(Screen.Adoptions.route) {
        AdoptionsScreen()
    }
}
