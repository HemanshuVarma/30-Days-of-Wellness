package com.varma.hemanshu.thirtydaysofwellness

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.varma.hemanshu.thirtydaysofwellness.repository.WellnessRepo
import com.varma.hemanshu.thirtydaysofwellness.ui.homescreen.WellnessList
import com.varma.hemanshu.thirtydaysofwellness.ui.theme._30DaysOfWellnessTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _30DaysOfWellnessTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    WellnessApp()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WellnessApp(modifier: Modifier = Modifier) {
    val wellnessTips = WellnessRepo.wellnessList
    Scaffold(topBar = {
        Appbar()
    }) { paddingValues ->
        WellnessList(
            wellnessTips = wellnessTips,
            modifier = modifier.padding(paddingValues)
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Appbar() {
    CenterAlignedTopAppBar(title = {
        Text(text = stringResource(id = R.string.app_name))
    })
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    _30DaysOfWellnessTheme {
        WellnessApp()
    }
}