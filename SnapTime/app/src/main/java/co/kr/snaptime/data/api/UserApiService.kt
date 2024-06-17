package co.kr.snaptime.data.api

import co.kr.snaptime.data.model.login_dto.SignUpReqDto
import co.kr.snaptime.data.model.login_dto.SignUpResDto
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface UserApiService {
    @POST("users/sign-up")
    suspend fun signUp(
        @Body requestBody: SignUpReqDto
    ): Response<SignUpResDto>
}