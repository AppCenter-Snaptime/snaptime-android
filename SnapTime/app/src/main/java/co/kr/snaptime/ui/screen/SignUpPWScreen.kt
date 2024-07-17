package co.kr.snaptime.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.Visibility
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import co.kr.snaptime.R
import co.kr.snaptime.ui.component.Appbar
import co.kr.snaptime.ui.viewmodel.LogInViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpPWScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ){
        Appbar(
            title = "SignUpPW",
            navIcon = Icons.Filled.ArrowBack,
            onNavClick = { /*TODO*/ },
            menuIcon = Icons.Filled.Menu
        )


        var password by rememberSaveable { mutableStateOf("") }
        var password2 by rememberSaveable { mutableStateOf("") }
        var passwordVisibility by remember { mutableStateOf(false) }
        var passwordVisibility2 by remember { mutableStateOf(false) }

        val visibilityIcon = if (passwordVisibility) {
            Icons.Filled.Lock
        } else {
            Icons.Filled.Lock
        }



        Column(
            modifier = Modifier
                .padding(horizontal = 30.dp, vertical = 30.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Text(
                text = "사용하실 비밀번호를 입력해주세요.",
                fontSize = 20.sp
            )

            Spacer(modifier = Modifier.height(100.dp))

            TextField(
                value = password,
                onValueChange = { password = it },
                label = {
                    Text("비밀번호 입력")
                },
                trailingIcon = {
                    IconButton(onClick = {
                        passwordVisibility = !passwordVisibility
                    }) {
                        Icon(
                            imageVector = visibilityIcon,
                            contentDescription = "Visibility Icon"
                        )
                    }
                },
                visualTransformation = if (passwordVisibility) VisualTransformation.None else PasswordVisualTransformation(),
                modifier = Modifier
                    .fillMaxWidth()
                    .width(300.dp)
            )

            Text(
                text = " 8 - 10자의 영문, 숫자를 조합해주세요.",
                color = Color.Blue,
                modifier = Modifier.padding(top = 5.dp),
                fontSize = 10.sp

            )

            Spacer(modifier = Modifier.height(32.dp))

            TextField(
                value = password2,
                onValueChange = { password2 = it },
                label = {
                    Text("비밀번호 재입력")
                },
                trailingIcon = {
                    IconButton(onClick = {
                        passwordVisibility2 = !passwordVisibility2
                    }) {
                        Icon(
                            imageVector = visibilityIcon,
                            contentDescription = "Visibility Icon"
                        )
                    }
                },
                visualTransformation = if (passwordVisibility) VisualTransformation.None else PasswordVisualTransformation(),
                modifier = Modifier
                    .fillMaxWidth()
                    .width(300.dp)
            )

            if(password.isNotEmpty() && password2.isNotEmpty() && password != password2) {
                Text(
                    text = "비밀번호가 일치하지 않습니다 !",
                    color = Color.Red,
                    modifier = Modifier.padding(top = 5.dp)
                )
            }

            Spacer(modifier = Modifier.height(32.dp))


            Button(
                onClick = {
                    navController.navigate(AllScreen.SignUpInfoScreen.name)
                },
                colors = ButtonDefaults.buttonColors(
                    //Color(0xFFC0C0C0),
                    if (password.isNotEmpty()) Color(0xFFA4CEFF) else Color(0xFFC0C0C0),
                    contentColor = Color.White
                ),
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .width(300.dp)
                    .height(48.dp)
            )
            {
                Text(text = "다음")
            }

        }

    }

}

@Preview
@Composable
fun PreSignUpPWScreen() {
    // NavHost setup
    val navController = rememberNavController()

    SignUpPWScreen(navController = navController)
}