package co.kr.snaptime.data.model.login_dto

import com.google.gson.annotations.SerializedName

data class SignInResult(
    @SerializedName("accessToken")
    val accessToken: String
)
