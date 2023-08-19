package eu.kanade.tachiyomi.network

import okhttp3.Call
import okhttp3.Response
import rx.Observable

fun Call.asObservable(): Observable<Response> = throw Exception("Stub!")

fun Call.asObservableSuccess(): Observable<Response> = throw Exception("Stub!")

suspend fun Call.await(): Response = throw Exception("Stub!")

/**
 * Exception that handles HTTP codes considered not successful by OkHttp.
 * Use it to have a standardized error message in the app across the extensions.
 *
 * @since extensions-lib 1.5
 * @param code [Int] the HTTP status code
 */
class HttpException(val code: Int) : IllegalStateException("HTTP error $code")
