package com.varma.hemanshu.thirtydaysofwellness.ui.homescreen

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.varma.hemanshu.thirtydaysofwellness.R
import com.varma.hemanshu.thirtydaysofwellness.model.WellnessTip
import com.varma.hemanshu.thirtydaysofwellness.ui.theme._30DaysOfWellnessTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WellnessItem(wellnessTip: WellnessTip, modifier: Modifier = Modifier) {
    Card(modifier = modifier.fillMaxWidth(),
        onClick = { /*TODO*/ }) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = stringResource(id = wellnessTip.day),
                style = MaterialTheme.typography.displaySmall
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = stringResource(id = wellnessTip.title),
                style = MaterialTheme.typography.displayMedium
            )
            Spacer(modifier = Modifier.height(16.dp))
            WellnessImage(thumbnailUrl = wellnessTip.thumbnail)
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = stringResource(id = wellnessTip.description),
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}

@Preview()
@Composable
fun WellnessItemLightPreview() {

    val item = WellnessTip(
        day = R.string.day_1,
        title = R.string.title_d01,
        thumbnail = "https://i.ytimg.com/vi/RLzC55ai0eo/hq720.jpg",
        description = R.string.desc_d01
    )

    _30DaysOfWellnessTheme {
        WellnessItem(item)
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun WellnessItemDarkPreview() {

    val item = WellnessTip(
        day = R.string.day_1,
        title = R.string.title_d01,
        thumbnail = "https://i.ytimg.com/vi/RLzC55ai0eo/hq720.jpg",
        description = R.string.desc_d01
    )

    _30DaysOfWellnessTheme {
        WellnessItem(item)
    }
}