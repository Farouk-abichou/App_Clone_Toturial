package com.example.reportsummaryappclone.main.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.reportsummaryappclone.R


@Composable
fun MoreSection(
    modifier: Modifier = Modifier
) {
    Text(text = "More")
    LazyColumn(
        modifier = modifier
            .fillMaxWidth()
    ) {
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
