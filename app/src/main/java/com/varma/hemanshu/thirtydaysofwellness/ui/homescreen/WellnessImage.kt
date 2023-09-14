package com.varma.hemanshu.thirtydaysofwellness.ui.homescreen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import coil.compose.SubcomposeAsyncImage

@Composable
fun WellnessImage(thumbnailUrl: String) {
    // Coil image loading
    SubcomposeAsyncImage(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(8.dp)),
        model = thumbnailUrl,
        loading = { CircularProgressIndicator(modifier = Modifier.wrapContentSize()) },
        contentDescription = "Wellness Tip Thumbnail"
    )
}