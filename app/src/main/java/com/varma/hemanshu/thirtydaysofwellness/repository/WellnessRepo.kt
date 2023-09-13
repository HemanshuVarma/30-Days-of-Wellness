package com.varma.hemanshu.thirtydaysofwellness.repository

import com.varma.hemanshu.thirtydaysofwellness.R
import com.varma.hemanshu.thirtydaysofwellness.model.WellnessTip

object WellnessRepo {

    val wellnessList = listOf(
        WellnessTip(
            day = R.string.day_1,
            title = R.string.title_d01,
            thumbnail = "https://i.ytimg.com/vi/RLzC55ai0eo/hq720.jpg",
            description = R.string.desc_d01
        )
    )
}