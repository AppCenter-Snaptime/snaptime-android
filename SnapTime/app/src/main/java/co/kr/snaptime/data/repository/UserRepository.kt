package co.kr.snaptime.data.repository

import android.content.Context
import android.util.Log
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.preferencesDataStore
import co.kr.snaptime.PreferencesKeys
import co.kr.snaptime.data.api.RetrofitBuilder
import co.kr.snaptime.data.model.login_dto.SignInReqDto
import co.kr.snaptime.data.model.login_dto.SignUpReqDto
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException

private val Context.dataStore by preferencesDataStore("signInToken")

class UserRepository(private val context: Context) {
    private val userApi = RetrofitBuilder.getUserApiService()

    // Datastore key 값
    private val signInTokenKey = PreferencesKeys.signInToken

    suspend fun signUp(signUpReqDto: SignUpReqDto) = userApi.signUp(signUpReqDto)

    suspend fun signIn(signInReqDto: SignInReqDto) = userApi.signIn(signInReqDto)

    suspend fun saveSignInToken(token: String) {
        context.dataStore.edit { preferences ->
            preferences[signInTokenKey] = token
        }
    }

    suspend fun getSignInToken(): Flow<String> = context.dataStore.data
        .catch { exception ->
            if (exception is IOException) {
                Log.e("Error reading preferences", exception.toString())
                emit(emptyPreferences())
            } else {
                throw exception
            }
        }.map {preferences ->
            preferences[signInTokenKey] ?: ""
        }
}