package co.kr.snaptime.data.model.user_dto

import com.google.gson.annotations.SerializedName

data class UserReqDto(
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
