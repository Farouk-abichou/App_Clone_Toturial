package com.example.reportsummaryappclone.main.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.reportsummaryappclone.R
import com.example.reportsummaryappclone.ui.theme.AppCloneTheme


@Composable
fun StorySection() {
    val storyGradient = Brush.linearGradient(
        colors = listOf(
            MaterialTheme.colorScheme.onSurfaceVariant,
            MaterialTheme.colorScheme.surfaceVariant
        ),
    )

    LazyRow {
        items(5) {
            Column(
                modifier = Modifier
                    .padding(6.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box{

                    Box(
                        modifier = Modifier
                            .border(
                                2.dp,
                                storyGradient,
                                CircleShape
                            )
                            .padding(5.dp)
                            .size(60.dp)
                            .clip(
                                CircleShape
                            )
                            .background(MaterialTheme.colorScheme.error),
                        contentAlignment = Alignment.Center
                    ) {
                        IconButton(
                            modifier = Modifier
                                .fillMaxSize(),
                            onClick = {

                            }
                        ) {
                            Image(
                                painter = painterResource(R.drawable.ic_launcher_foreground),
                                contentDescription = null,
                            )
                        }
                    }
                    Box(
                        modifier = Modifier
                            .align(Alignment.BottomEnd)
                            .size(20.dp)
                            .clip(
                                CircleShape
                            )
                            .background(MaterialTheme.colorScheme.primary)
                    ) {
                        Icon(
                            Icons.Filled.Add,
                            contentDescription = null,
                            modifier = Modifier
                                .padding(5.dp),
                            tint = MaterialTheme.colorScheme.onSecondary
                        )
                    }
                }
                Text(
                    text = "Person $it",
                    color = MaterialTheme.colorScheme.outline,
                    style = MaterialTheme.typography.bodyLarge
                )

            }
        }
    }
}

@Preview
@Composable
fun StorySectionPreview1() {
    AppCloneTheme {
        StorySection()
    }
}