package co.kr.snaptime.data.model.login_dto

import com.google.gson.annotations.SerializedName

data class SignUpResDto(
    @SerializedName("msg")
    val msg: String,
    @SerializedName("result")
    val result: SignUpResult
)
