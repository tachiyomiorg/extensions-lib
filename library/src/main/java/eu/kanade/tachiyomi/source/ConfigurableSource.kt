package eu.kanade.tachiyomi.source

import androidx.preference.PreferenceScreen

interface ConfigurableSource {

    fun setupPreferenceScreen(screen: PreferenceScreen)

}
