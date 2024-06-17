package co.kr.snaptime.data.model.login_dto

import com.google.gson.annotations.SerializedName

data class SignUpReqDto(
    @SerializedName("name")
    val name: String,
    @SerializedName("loginId")
    val loginId: String,
    @SerializedName("password")
    val password: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("birthDay")
    val birthDay: String
)
