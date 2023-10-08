package eu.kanade.tachiyomi.source.online

import eu.kanade.tachiyomi.source.Source
import eu.kanade.tachiyomi.source.model.SChapter
import eu.kanade.tachiyomi.source.model.SManga

/**
 * A source that may handle opening an SManga or SChapter for a given URI.
 *
 * @since extensions-lib 1.5
 */
interface ResolvableSource : Source {

    /**
     * Whether this source may potentially handle the given URI.
     *
     * @since extensions-lib 1.5
     */
    fun canResolveUri(uri: String): Boolean

    /**
     * Called if canHandleUri is true. Checks if it's a chapter Uri.
     *
     * @since extensions-lib 1.5
     */
    fun isChapterUri(uri: String): Boolean

    /**
     * Called if canHandleUri is true. Checks if it's a manga Uri.
     *
     * @since extensions-lib 1.5
     */
    fun isMangaUri(uri: String): Boolean
    /**
     * Called if canHandleUri is true. Returns the corresponding SManga, if possible.
     *
     * @since extensions-lib 1.5
     */
    suspend fun getManga(uri: String): SManga?

    /**
     * Called if canHandleUri is true. Returns the corresponding SChapter, if possible.
     *
     * @since extensions-lib 1.5
     */
    suspend fun getChapter(uri: String): SChapter?
}