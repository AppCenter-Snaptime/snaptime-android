package co.kr.snaptime.ui.screen

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import co.kr.snaptime.data.model.login_dto.SignUpReqDto
import co.kr.snaptime.data.model.user_dto.UserReqDto
import co.kr.snaptime.ui.viewmodel.LogInViewModel

@Composable
fun LogInScreen(
    navController: NavController,
    loginViewModel: LogInViewModel
) {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Gray)
            .padding(horizontal = 10.dp, vertical = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        val userInfo = SignUpReqDto(
            "choi",
            "choi1234",
            "asdfasdf",
            "choi1234@gmail.com",
            "2000-11-11"
        )
        Text(
            text = "Login",
            fontSize = 30.sp
        )

        Spacer(Modifier.weight(1f))

        // api test
        Button(
            onClick = {
                loginViewModel.signUp(userInfo)
                Toast.makeText(context, "${loginViewModel.code.value}", Toast.LENGTH_SHORT).show()
            }
        ) {
            Text(text = "test")
        }
    }
}