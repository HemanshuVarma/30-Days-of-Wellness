package com.varma.hemanshu.thirtydaysofwellness.ui.homescreen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.varma.hemanshu.thirtydaysofwellness.R
import com.varma.hemanshu.thirtydaysofwellness.model.WellnessTip

@Composable
fun WellnessList(wellnessTips: List<WellnessTip>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(wellnessTips) { wellnessTip ->
            WellnessItem(
                wellnessTip = wellnessTip,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
        }
        item {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                text = stringResource(id = R.string.footer_copyright),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.displaySmall,
                color = Color.LightGray
            )
        }
    }
}