package co.kr.snaptime.data.repository

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import co.kr.snaptime.PreferencesKeys
import co.kr.snaptime.data.api.RetrofitBuilder
import co.kr.snaptime.data.model.login_dto.SignInReqDto
import co.kr.snaptime.data.model.login_dto.SignUpReqDto
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private val Context.dataStore by preferencesDataStore("user_prefs")

class UserRepository(private val context: Context) {
    private val userApi = RetrofitBuilder.getUserApiService()

    private val signInTokenKey = PreferencesKeys.signInToken

    suspend fun signUp(signUpReqDto: SignUpReqDto) = userApi.signUp(signUpReqDto)

    suspend fun signIn(signInReqDto: SignInReqDto) = userApi.signIn(signInReqDto)

    suspend fun saveSignInToken(token: String) {
        context.dataStore.edit { preferences ->
            preferences[signInTokenKey] = token
        }
    }

    val loginToken: Flow<String?> = context.dataStore.data
        .map { preferences ->
            preferences[signInTokenKey] ?: ""
        }
}