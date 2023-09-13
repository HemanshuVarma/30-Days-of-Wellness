package com.varma.hemanshu.thirtydaysofwellness.ui.homescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.varma.hemanshu.thirtydaysofwellness.R
import com.varma.hemanshu.thirtydaysofwellness.model.WellnessTip
import com.varma.hemanshu.thirtydaysofwellness.ui.theme._30DaysOfWellnessTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WellnessItem(wellnessTip: WellnessTip) {
    Card(modifier = Modifier.fillMaxWidth(),
        onClick = { /*TODO*/ }) {
        Column() {
            Text(
                text = stringResource(id = wellnessTip.day)
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