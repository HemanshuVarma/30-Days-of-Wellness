package com.varma.hemanshu.thirtydaysofwellness.ui.homescreen

import android.content.res.Configuration
import android.util.Log
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.varma.hemanshu.thirtydaysofwellness.R
import com.varma.hemanshu.thirtydaysofwellness.model.WellnessTip
import com.varma.hemanshu.thirtydaysofwellness.ui.theme._30DaysOfWellnessTheme
import com.varma.hemanshu.thirtydaysofwellness.utils.AppUtils
import com.varma.hemanshu.thirtydaysofwellness.utils.Constants

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WellnessItem(
    wellnessTip: WellnessTip,
    modifier: Modifier = Modifier
) {
    var isExpanded by remember { mutableStateOf(false) }
    val thumbnailUrl = AppUtils.getThumbnailUrl(stringResource(id = wellnessTip.videoId))
    val videoUrl = Constants.YT_SHORT_BASE_URL + stringResource(id = wellnessTip.videoId)
    val uriHandler = LocalUriHandler.current
    Log.d("WellnessItem", "Final URL for thumbnail is $thumbnailUrl")
    Card(
        modifier = modifier.fillMaxWidth(),
        onClick = { isExpanded = !isExpanded }
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioMediumBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                )
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = stringResource(id = wellnessTip.day),
                    style = MaterialTheme.typography.displaySmall,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
                ItemIcon(isExpanded = isExpanded, onClick = { isExpanded = !isExpanded })
            }
            Text(
                text = stringResource(id = wellnessTip.title),
                style = MaterialTheme.typography.displayMedium
            )
            Spacer(modifier = Modifier.height(16.dp))
            WellnessImage(thumbnailUrl = thumbnailUrl) {
                Log.d("WellnessItem", "VideoUrl is $videoUrl")
                uriHandler.openUri(videoUrl)
            }
            Spacer(modifier = Modifier.height(8.dp))
            if (isExpanded) {
                Text(
                    text = stringResource(id = wellnessTip.description),
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }
    }
}

@Preview()
@Composable
fun WellnessItemLightPreview() {

    _30DaysOfWellnessTheme {
        WellnessItem(getDummyItem())
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun WellnessItemDarkPreview() {

    _30DaysOfWellnessTheme {
        WellnessItem(getDummyItem())
    }
}

private fun getDummyItem() = WellnessTip(
    day = R.string.day_1,
    title = R.string.title_d01,
    description = R.string.desc_d01,
    videoId = R.string.video_id_d01
)