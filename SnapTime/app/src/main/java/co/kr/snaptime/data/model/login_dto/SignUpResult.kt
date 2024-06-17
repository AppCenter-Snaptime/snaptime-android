package co.kr.snaptime.data.model.login_dto

import com.google.gson.annotations.SerializedName

data class SignUpResult(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("loginId")
    val loginId: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("birthDay")
    val birthDay: String
)
