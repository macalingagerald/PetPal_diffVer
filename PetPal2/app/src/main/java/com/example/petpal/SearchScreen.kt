import androidx.compose.animation.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.petpal.R
import com.example.petpal.ui.theme.smth_orange

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(onBackClick: () -> Unit = {}) {
    var searchQuery by remember { mutableStateOf("") }
    var isSearching by remember { mutableStateOf(false) }
    var showError by remember { mutableStateOf(false) }

    Column(modifier = Modifier.fillMaxSize()) {
        // Top Bar with Centered Title
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            // Back Button aligned to the start
            Row(
                modifier = Modifier.align(Alignment.CenterStart),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = onBackClick) {
                    Icon(
                        Icons.Default.ArrowBack,
                        contentDescription = "Back"
                    )
                }
            }

            // Centered Title
            Text(
                text = "Search",
                style = MaterialTheme.typography.headlineSmall,
                color = smth_orange,
                modifier = Modifier.align(Alignment.Center)

            )
        }

        // Search Bar
        TextField(
            value = searchQuery,
            onValueChange = {
                searchQuery = it
                isSearching = it.isNotEmpty()
                showError = false
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color(0xFFF5F5F5),
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent
            ),
            placeholder = { Text("Type to search") },
            trailingIcon = {
                if (searchQuery.isNotEmpty()) {
                    IconButton(onClick = {
                        searchQuery = ""
                        isSearching = false
                        showError = false
                    }) {
                        Icon(
                            Icons.Default.Close,
                            contentDescription = "Clear"
                        )
                    }
                }
            },
            singleLine = true
        )

        // Content
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            contentAlignment = Alignment.Center
        ) {
            AnimatedContent(
                targetState = when {
                    showError -> SearchState.Error
                    isSearching -> SearchState.Searching
                    searchQuery.isEmpty() -> SearchState.Empty
                    else -> SearchState.Results
                }
            ) { state ->
                when (state) {
                    SearchState.Empty -> EmptyState()
                    SearchState.Error -> ErrorState()
                    SearchState.Searching -> SearchingState()
                    SearchState.Results -> ResultsState(searchQuery)
                }
            }
        }
    }
}

@Composable
private fun EmptyState() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.find), // Replace with your own image resource
            contentDescription = "Cute cat",
            modifier = Modifier.size(200.dp),
            contentScale = ContentScale.Fit
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Let's find something!",
            style = MaterialTheme.typography.bodyLarge,
            color = Color(0xFFFF5722)
        )
    }
}

@Composable
private fun ErrorState() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.notfind), // Replace with your own image resource
            contentDescription = "Error",
            modifier = Modifier.size(200.dp),
            contentScale = ContentScale.Fit
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Nothing was found",
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Red
        )
    }
}

@Composable
private fun SearchingState() {
    // Empty searching state as per design
}

@Composable
private fun ResultsState(query: String) {
    // Empty results state as per design
}

private enum class SearchState {
    Empty, Searching, Results, Error
}

@Preview(showBackground = true)
@Composable
fun SearchScreenPreview() {
    MaterialTheme {
        SearchScreen()
    }
}
