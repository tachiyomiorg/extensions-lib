package eu.kanade.tachiyomi.source

import androidx.preference.PreferenceScreen

@Suppress("unused")
interface ConfigurableSource {

    fun setupPreferenceScreen(screen: PreferenceScreen)

}
