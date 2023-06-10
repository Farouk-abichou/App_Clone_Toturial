package com.example.reportsummaryappclone.main.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.reportsummaryappclone.ui.theme.AppCloneTheme


@Composable
fun StoryItem(
    image: String,
    isChecked: Boolean = false,
    withIcon: Boolean = false,
) {
    val storyGradient = if (isChecked) Brush.linearGradient(
        colors = listOf(
            MaterialTheme.colorScheme.onSurfaceVariant,
            MaterialTheme.colorScheme.surfaceVariant
        ),
    ) else Brush.linearGradient(
        colors = listOf(
            MaterialTheme.colorScheme.secondary,
            MaterialTheme.colorScheme.onSurface,
        ),
    )
    Column(
        modifier = Modifier
            .padding(PaddingValues(horizontal = 10.dp)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box {

                Button(
                    modifier = Modifier
                        .border(
                            2.dp,
                            storyGradient,
                            CircleShape
                        )
                        .padding(5.dp)
                        ,
                    contentPadding = PaddingValues(0.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.onSurface
                    ),
                    onClick = {},
                ) {
                    AsyncImage(
                        image,
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(
                                CircleShape
                            )
                    )
                }

            if (withIcon) {
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
                        Icons.Filled.Phone,
                        contentDescription = null,
                        modifier = Modifier
                            .padding(5.dp),
                        tint = MaterialTheme.colorScheme.onBackground
                    )
                }
            }
        }
        Text(
            text = "Person ",
            color = MaterialTheme.colorScheme.onSurface,
            style = MaterialTheme.typography.titleLarge
        )

    }


}

@Preview
@Composable
fun StoryItemPreview1() {
    AppCloneTheme {
        StoryItem(
            image = "https://images.unsplash.com/photo-1632836924837-3b3b3b3b3b3b?ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw0Mnx8fGVufDB8fHx8&ixlib=rb-1.2.1&w=1000&q=80",
            isChecked = true,
            withIcon = true
        )
    }
}