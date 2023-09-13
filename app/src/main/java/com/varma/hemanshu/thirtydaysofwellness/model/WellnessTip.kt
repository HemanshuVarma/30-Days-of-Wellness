package com.varma.hemanshu.thirtydaysofwellness.model

import androidx.annotation.StringRes

data class WellnessTip(
    @StringRes val day: Int,
    @StringRes val title: Int,
    val thumbnail: String,
    @StringRes val description: Int
)
