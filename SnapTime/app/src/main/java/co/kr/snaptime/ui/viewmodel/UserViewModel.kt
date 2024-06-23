package co.kr.snaptime.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import co.kr.snaptime.data.model.login_dto.SignInReqDto
import co.kr.snaptime.data.model.login_dto.SignUpReqDto
import co.kr.snaptime.data.repository.UserRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class UserViewModel(private val userRepo: UserRepository): ViewModel() {

    private val _signUpResponse = MutableStateFlow("")
    val signUpResponse: StateFlow<String> = _signUpResponse
    private val _signInResponse = MutableStateFlow("")
    val signInResponse: StateFlow<String> = _signInResponse
    private val _code = MutableStateFlow(0)
    val code: StateFlow<Int> = _code
    private val _token = MutableStateFlow("")
    val token: StateFlow<String> = _token

    fun signUp(signUpReqDto: SignUpReqDto) {
        viewModelScope.launch {
            val response = userRepo.signUp(signUpReqDto)
            _code.value = response.code()

            if (response.isSuccessful) {
                _signUpResponse.value = response.body()?.result?.toString() ?: ""
            } else {
                val errorBody = response.errorBody()?.string() ?: "알 수 없는 에러 발생"
                throw Exception("실패: $errorBody, ${response.code()}")
            }
        }
    }

    fun signIn(signInReqDto: SignInReqDto) {
        viewModelScope.launch {
            val response = userRepo.signIn(signInReqDto)

            if (response.isSuccessful) {
                _code.value = response.code()
                _signInResponse.value = response.body()?.msg ?: ""
                _token.value = response.body()?.result?.accessToken ?: ""
                userRepo.saveSignInToken(_token.value)
            } else {
                val errorBody = response.errorBody()?.string() ?: "알 수 없는 에러 발생"
                throw Exception("실패: $errorBody, ${response.code()}")
            }
        }
    }
}