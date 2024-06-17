package co.kr.snaptime.data.model.login_dto

import com.google.gson.annotations.SerializedName

data class SignInReqDto(
    @SerializedName("loginId")
    val loginId: String,
    @SerializedName("password")
    val password: String
)
