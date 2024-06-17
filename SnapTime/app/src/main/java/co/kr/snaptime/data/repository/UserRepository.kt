package co.kr.snaptime.data.repository

import co.kr.snaptime.data.api.RetrofitBuilder
import co.kr.snaptime.data.model.login_dto.SignUpReqDto

class UserRepository {
    private val userApi = RetrofitBuilder.getUserApiService()

    suspend fun signUp(signUpReqDto: SignUpReqDto) = userApi.signUp(signUpReqDto)
}