package com.example.reportsummaryappclone.main.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.reportsummaryappclone.main.presentation.component.MorePostsSection
import com.example.reportsummaryappclone.main.presentation.component.PostsRow
import com.example.reportsummaryappclone.main.presentation.component.StorySection
import com.example.reportsummaryappclone.ui.theme.AppCloneTheme

data class NavigationBarItem(
    val icon: String,
    val label : String,
    val selected: Boolean,
)
val bottomAppBarIcons = listOf(
    NavigationBarItem(
        icon = "home",
        label = "Home",
        selected = false
    ),
    NavigationBarItem(
        icon = "search",
        label = "Search",
        selected = false
    ),
    NavigationBarItem(
        icon = "add",
        label = "Add",
        selected = false
    ),
    NavigationBarItem(
        icon = "heart",
        label = "Heart",
        selected = false
    ),
    NavigationBarItem(
        icon = "person",
        label = "Person",
        selected = false
    ),
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {


    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        modifier = Modifier.padding(10.dp),
                        text = "Personal",
                        style = MaterialTheme.typography.displayLarge,
                        color = MaterialTheme.colorScheme.onBackground
                    )
                },
                actions = {
                    IconButton(onClick = { }) {
                        Icon(
                            Icons.Filled.Search,
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.secondary
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.background
                ),
            )
        },
        bottomBar = {
            BottomAppBar(

            ) {
                bottomAppBarIcons.forEachIndexed { index, navigationBarItem ->
                    NavigationBarItem(
                        label = { Text(text = navigationBarItem.label) },
                        selected = bottomAppBarIcons[index].selected,
                        icon = {
                            Icon(
                                Icons.Filled.Search,
                                contentDescription = null,
                                tint = MaterialTheme.colorScheme.secondary
                            )
                        },
                        onClick = {

                        }
                    )
                }


            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            StorySection()
            PostsRow()
            MorePostsSection()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    AppCloneTheme {
        MainScreen()
    }
}