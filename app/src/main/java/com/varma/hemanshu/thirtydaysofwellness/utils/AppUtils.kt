package com.varma.hemanshu.thirtydaysofwellness.utils

object AppUtils {

    fun getThumbnailUrl(stringResource: String) =
        Constants.YT_THUMBNAIL_BASE.replace("###", stringResource)
}