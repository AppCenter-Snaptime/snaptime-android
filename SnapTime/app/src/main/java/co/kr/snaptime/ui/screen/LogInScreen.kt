package co.kr.snaptime.ui.screen

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import co.kr.snaptime.data.model.login_dto.SignInReqDto
import co.kr.snaptime.data.model.login_dto.SignUpReqDto
import co.kr.snaptime.navigation.AllScreen
import co.kr.snaptime.ui.viewmodel.UserViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LogInScreen(
    navController: NavController,
    loginViewModel: LogInViewModel
) {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            //.background(color = Color.Gray)
            .padding(horizontal = 30.dp, vertical = 30.dp),
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

        Spacer(modifier = Modifier.height(130.dp))

        Text(
            text = "나만을 위한 인생네컷 앨범,",
            fontSize = 16.sp,
            textAlign = TextAlign.Left,
            modifier = Modifier
                .fillMaxWidth()

        )

        Spacer(modifier = Modifier.height(100.dp))

        TextField(
            value = "",
            onValueChange = {},
            label = {
                Text("아이디 또는 이메일")
            },
            modifier = Modifier
                .fillMaxWidth()
                .width(300.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        TextField(
            value = "",
            onValueChange = {},
            label = {
                Text("비밀번호")
            },
            modifier = Modifier
                .fillMaxWidth()
                .width(300.dp)

        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = {
                navController.navigate(AllScreen.HomeScreen.name)
            },
            colors = ButtonDefaults.buttonColors(
                Color(0xFFA4CEFF),
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .width(300.dp)
                .height(48.dp)
        )
        {
            Text(text = "로그인")
        }

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "이메일로 회원가입",
            textDecoration = TextDecoration.Underline,
            modifier = Modifier.clickable {
                navController.navigate(AllScreen.SignUpEmailScreen.name)
            }
        )
        Spacer(Modifier.weight(1f))

        // api test
        Button(
            onClick = {
                userViewModel.signUp(userInfo)
                Toast.makeText(context, "${userViewModel.code.value}", Toast.LENGTH_SHORT).show()
            }
        ) {
            Text(text = "test")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                userViewModel.signIn(signInInfo)
                Toast.makeText(context, userViewModel.token.value, Toast.LENGTH_SHORT).show()
            }
        ) {
            Text(text = "sign in")
        }
    }
}