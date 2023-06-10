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
                NavigationBarItem(
                    onClick = {  },
                    selected = false,
                    icon = {
                        IconButton(

                            onClick = { /*TODO*/ }
                        ) {
                            Icon(
                                Icons.Filled.Search,
                                contentDescription = null,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                    },
                    label = {
                        Text(
                            text = "Person ",
                            color = MaterialTheme.colorScheme.onSurface,
                            style = MaterialTheme.typography.titleLarge
                        )
                    }
                )
                NavigationBarItem(
                    onClick = {  },
                    selected = false,
                    icon = {
                        IconButton(
                            onClick = { /*TODO*/ }
                        ) {
                            Icon(
                                Icons.Filled.Search,
                                contentDescription = null
                            )
                        }
                    },
                    label = {
                        Text(
                            text = "Person ",
                            color = MaterialTheme.colorScheme.onSurface,
                            style = MaterialTheme.typography.titleLarge,
                        )
                    }
                )
                NavigationBarItem(
                    onClick = {  },
                    selected = false,
                    icon = {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                Icons.Filled.Search,
                                contentDescription = null
                            )
                        }
                    },
                    label = {
                        Text(
                            text = "Person ",
                            color = MaterialTheme.colorScheme.onSurface,
                            style = MaterialTheme.typography.titleLarge
                        )
                    }
                )
                NavigationBarItem(
                    onClick = {  },
                    selected = false,
                    icon = {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                Icons.Filled.Search,
                                contentDescription = null
                            )
                        }
                    },
                    label = {
                        Text(
                            text = "Person ",
                            color = MaterialTheme.colorScheme.onSurface,
                            style = MaterialTheme.typography.titleLarge
                        )
                    }
                )
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