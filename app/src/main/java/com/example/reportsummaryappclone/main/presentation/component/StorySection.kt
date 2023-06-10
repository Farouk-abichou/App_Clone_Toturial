package com.example.reportsummaryappclone.main.presentation.component

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.reportsummaryappclone.main.data.local.StoryImages
import com.example.reportsummaryappclone.ui.theme.AppCloneTheme

@Composable
fun StorySection(
    images: StoryImages = StoryImages()
) {
    LazyRow {
        item {
            StoryItem(
                isChecked = true,
                withIcon = true,
                image = images.person1
            )
        }
        item {
            StoryItem(
                isChecked = true,
                withIcon = false,
                image = images.person2
            )
        }
        item {
            StoryItem(
                isChecked = false,
                withIcon = false,
                image = images.person3
            )
        }
        item {
            StoryItem(
                isChecked = false,
                withIcon = false,
                image = images.person4
            )
        }
        item {
            StoryItem(
                isChecked = false,
                withIcon = false,
                image = images.person5
            )
        }
        item {
            StoryItem(
                isChecked = false,
                withIcon = false,
                image = images.person6

            )
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