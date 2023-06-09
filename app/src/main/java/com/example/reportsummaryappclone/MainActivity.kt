package com.example.reportsummaryappclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.animatedgradient.R
import com.example.reportsummaryappclone.ui.theme.ReportSummaryAppCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReportSummaryAppCloneTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    MainScreen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(

) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Personal") },
                modifier = Modifier
                    .padding(vertical = 8.dp),
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Filled.Search, contentDescription = null)
                    }
                }
            )
        },
        bottomBar = {
            BottomAppBar(

            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        Icons.Filled.Search,
                        contentDescription = null
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        Icons.Filled.Search,
                        contentDescription = null
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        Icons.Filled.Search,
                        contentDescription = null
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        Icons.Filled.Search,
                        contentDescription = null
                    )
                }
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {
            StorySection()
            PostsRow()
            MoreSection()
        }
    }
}

@Composable
fun MoreSection(
    modifier: Modifier = Modifier
) {
    Text(text = "More")
    LazyColumn(
        modifier = modifier
            .fillMaxWidth()
    ){
        items(5) {
            Box(
                modifier = Modifier
                    .padding(8.dp)
                    .clip(
                        CircleShape
                    )
                    .background(MaterialTheme.colorScheme.secondary)
            ) {
                IconButton(
                    onClick = {

                    }
                ) {
                    Image(
                        painter = painterResource(R.drawable.ic_launcher_foreground),
                        contentDescription = null,
                    )
                }
            }
        }
    }
}

@Composable
fun PostsRow() {
    LazyRow {
        items(5) {
            Box(
                modifier = Modifier
                    .padding(8.dp)
                    .width(300.dp)
                    .height(200.dp)
                    .clip(
                        RoundedCornerShape(10)
                    )
                    .background(MaterialTheme.colorScheme.primary),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.ic_launcher_foreground),
                    contentDescription = null,
                )
            }
        }
    }
}

@Composable
fun StorySection() {

    val storyGradient = linearGradient(
        colors = listOf(Color.Magenta, Color.Yellow),
    )

    LazyRow {
        items(5) {
            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .padding(8.dp)
                        .border(
                            2.dp,
                            storyGradient,
                            CircleShape
                        )
                        .padding(6.dp)
                        .size(60.dp)
                        .clip(
                            CircleShape
                        )
                        .background(MaterialTheme.colorScheme.error)
                    ,
                    contentAlignment = Alignment.Center
                ) {
                    IconButton(
                        onClick = {

                        }
                    ) {
                        Image(
                            painter = painterResource(R.drawable.ic_launcher_foreground),
                            contentDescription = null,
                        )
                    }
                }
                Text(text = "Story $it")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ReportSummaryAppCloneTheme {
        MainScreen()
    }
}