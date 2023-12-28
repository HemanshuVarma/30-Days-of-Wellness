package com.varma.hemanshu.thirtydaysofwellness.repository

import com.varma.hemanshu.thirtydaysofwellness.R
import com.varma.hemanshu.thirtydaysofwellness.model.WellnessTip

object WellnessRepo {

    val wellnessList = listOf(
        WellnessTip(
            day = R.string.day_1,
            title = R.string.title_d01,
            description = R.string.desc_d01,
            videoId = R.string.video_id_d01
        ),
        WellnessTip(
            day = R.string.day_2,
            title = R.string.title_d02,
            description = R.string.desc_d02,
            videoId = R.string.video_id_d02
        ),
        WellnessTip(
            day = R.string.day_3,
            title = R.string.title_d03,
            description = R.string.desc_d03,
            videoId = R.string.video_id_d03
        ),
        WellnessTip(
            day = R.string.day_4,
            title = R.string.title_d04,
            description = R.string.desc_d04,
            videoId = R.string.video_id_d04
        ),
        WellnessTip(
            day = R.string.day_5,
            title = R.string.title_d05,
            description = R.string.desc_d05,
            videoId = R.string.video_id_d05
        ),
        WellnessTip(
            day = R.string.day_6,
            title = R.string.title_d06,
            description = R.string.desc_d06,
            videoId = R.string.video_id_d06
        )
    )
}