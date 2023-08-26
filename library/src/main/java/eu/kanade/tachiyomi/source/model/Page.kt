package eu.kanade.tachiyomi.source.model

import android.net.Uri

@Suppress("unused")
class Page(
        val index: Int,
        val url: String = "",
        var imageUrl: String? = null,
        var uri: Uri? = null
)
