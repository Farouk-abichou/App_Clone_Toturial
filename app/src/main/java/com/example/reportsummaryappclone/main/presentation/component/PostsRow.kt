package com.example.reportsummaryappclone.main.presentation.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.reportsummaryappclone.main.data.local.PostImages
import com.example.reportsummaryappclone.ui.theme.AppCloneTheme

@Composable
fun PostsRow(
    postImages: PostImages = PostImages()
) {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 10.dp),
    ) {
        item {
            PostItem(
                image = postImages.post1
            )
            Spacer(modifier = Modifier.width(10.dp))
        }
        item {
            PostItem(
                image = postImages.post2
            )
            Spacer(modifier = Modifier.width(10.dp))
        }
        item {
            PostItem(
                image = postImages.post3
            )
            Spacer(modifier = Modifier.width(10.dp))
        }
        item {
            PostItem(
                image = postImages.post4
            )
            Spacer(modifier = Modifier.width(10.dp))
        }
        item {
            PostItem(
                image = postImages.post5
            )
            Spacer(modifier = Modifier.width(10.dp))
        }
    }
}

@Preview
@Composable
fun PostsRowPreview() {
    AppCloneTheme {
        PostsRow()
    }
}

