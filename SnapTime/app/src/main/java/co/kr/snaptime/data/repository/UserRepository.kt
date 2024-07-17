package co.kr.snaptime.data.repository

import android.util.Log
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import co.kr.snaptime.data.PreferencesKeys
import co.kr.snaptime.data.api.UserApiService
import co.kr.snaptime.data.model.login_dto.SignInReqDto
import co.kr.snaptime.data.model.login_dto.SignUpReqDto
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val dataStore: DataStore<Preferences>,
    private val userApi: UserApiService
) {
    // Datastore key 값
    private val signInTokenKey = PreferencesKeys.signInToken

    suspend fun signUp(signUpReqDto: SignUpReqDto) = userApi.signUp(signUpReqDto)

    suspend fun signIn(signInReqDto: SignInReqDto) = userApi.signIn(signInReqDto)

    suspend fun saveSignInToken(token: String) {
        dataStore.edit { preferences ->
            preferences[signInTokenKey] = token
        }
    }

    suspend fun getSignInToken(): Flow<String> = dataStore.data
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