package com.example.reportsummaryappclone.main.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.reportsummaryappclone.ui.theme.AppCloneTheme


@Composable
fun PostItem(
    image: String
) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(10))
            .width(300.dp)
            .height(200.dp)
            .background(MaterialTheme.colorScheme.onSurface)
        ,
        contentAlignment = Alignment.Center
    ) {
        AsyncImage(
            image,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop,
        )
    }
}

@Preview
@Composable
fun PostItemPreview() {
    AppCloneTheme {
        PostItem(
            image = "https://images.unsplash.com/photo-1632836926807-0b0b5b5b0b0b?ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHwzNnx8fGVufDB8fHx8&ixlib=rb-1.2.1&w=1000&q=80"
        )
    }
}