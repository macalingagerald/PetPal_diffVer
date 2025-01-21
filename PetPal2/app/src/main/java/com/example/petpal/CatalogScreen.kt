package com.example.petpal

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CatalogScreen() {
    var selectedCategory by remember { mutableStateOf(0) }

    Scaffold(
        topBar = {
            SmallTopAppBar(
                title = { Text("Catalog") },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.Menu, "Menu")
                    }
                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.Search, "Search")
                    }
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.MoreVert, "More")
                    }
                }
            )
        },
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, "Catalog") },
                    label = { Text("Catalog") },
                    selected = true,
                    onClick = {}
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.List, "Services") },
                    label = { Text("Services") },
                    selected = false,
                    onClick = {}
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Pets, "Adoptions") },
                    label = { Text("Adoptions") },
                    selected = false,
                    onClick = {}
                )
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            // Promotional Banner
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .padding(16.dp)
                    .clip(MaterialTheme.shapes.medium)
                    .background(Color(0xFFFF6B6B))
            ) {
                Text(
                    text = "UP TO 50% OFF",
                    style = MaterialTheme.typography.headlineMedium,
                    color = Color.White,
                    modifier = Modifier.align(Alignment.Center)
                )
            }

            // Categories
            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                contentPadding = PaddingValues(horizontal = 16.dp),
                modifier = Modifier.padding(vertical = 8.dp)
            ) {
                items(6) { index ->
                    val categories = listOf("All", "Food", "Toys", "Health", "Grooming", "Accessories")
                    FilterChip(
                        selected = selectedCategory == index,
                        onClick = { selectedCategory = index },
                        label = { Text(categories[index]) }
                    )
                }
            }

            // Products Grid
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(4) {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(0.8f)
                    ) {
                        Column {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .weight(1f)
                            ) {
                                // Placeholder for product image
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .background(MaterialTheme.colorScheme.surfaceVariant)
                                )
                                IconButton(
                                    onClick = {},
                                    modifier = Modifier.align(Alignment.TopEnd)
                                ) {
                                    Icon(Icons.Default.FavoriteBorder, "Favorite")
                                }
                            }
                            Column(
                                modifier = Modifier.padding(8.dp)
                            ) {
                                Text(
                                    text = "Pet Food Product",
                                    style = MaterialTheme.typography.bodyMedium,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    text = "$19.99",
                                    style = MaterialTheme.typography.bodyMedium,
                                    color = MaterialTheme.colorScheme.primary
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CatalogScreenPreview() {
    MaterialTheme {
        CatalogScreen()
    }
}