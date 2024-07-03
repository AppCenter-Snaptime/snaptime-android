package co.kr.snaptime.data.model.login_dto

import com.google.gson.annotations.SerializedName

data class SignInResDto(
    @SerializedName("accessToken")
    val accessToken: String
)
