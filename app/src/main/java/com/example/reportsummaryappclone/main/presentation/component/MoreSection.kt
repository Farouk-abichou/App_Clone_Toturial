package com.example.reportsummaryappclone.main.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.reportsummaryappclone.main.data.local.PostImages
import com.example.reportsummaryappclone.ui.theme.AppCloneTheme


@Composable
fun MorePostsSection(
    modifier: Modifier = Modifier,
    postImages: PostImages = PostImages()
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(PaddingValues(horizontal = 10.dp))
        ,

        ) {
        Text(
            modifier = Modifier.padding(10.dp),
            text = "More",
            style = MaterialTheme.typography.displayMedium,
            color = MaterialTheme.colorScheme.onBackground
        )

        LazyColumn(
            modifier = modifier
                .fillMaxWidth()
        ) {
            item {
                MorePostsItem(
                    image = postImages.post1
                )
                Spacer(modifier = Modifier.height(10.dp))
            }
            item {
                MorePostsItem(
                    image = postImages.post2
                )
                Spacer(modifier = Modifier.height(10.dp))
            }
            item {
                MorePostsItem(
                    image = postImages.post3
                )
                Spacer(modifier = Modifier.height(10.dp))
            }
            item {
                MorePostsItem(
                    image = postImages.post4
                )
                Spacer(modifier = Modifier.height(10.dp))
            }
            item {
                MorePostsItem(
                    image = postImages.post5
                )
                Spacer(modifier = Modifier.height(10.dp))
            }
        }
    }
}

@Composable
fun MorePostsItem(
    image: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Box(
            modifier = Modifier
                .height(80.dp)
                .weight(.3f)
                .clip(RoundedCornerShape(10))
                .background(MaterialTheme.colorScheme.secondary)
        ) {
            AsyncImage(
                image,
                contentDescription = null,
                modifier = Modifier.fillMaxSize()
            )
        }
        Column(
            modifier = Modifier
                .weight(.6f)
        ) {
            Text(
                modifier = Modifier,
                text = "Lorem Ipsum is simply dummy text . Lorem  since the 1500s,",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onBackground
            )
            Text(
                modifier = Modifier,
                text = "Lorem Ipsum is simply dummy  typesetting indus,",
                style = MaterialTheme.typography.titleSmall,
                color = MaterialTheme.colorScheme.secondary
            )
        }
    }
}

@Preview
@Composable
fun MoreSectionPreview() {
    AppCloneTheme {
        MorePostsSection()
    }
}