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
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItemDefaults.contentColor
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import co.kr.snaptime.ui.component.Appbar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpEmailScreen(
    navController: NavController

) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
            //.padding(horizontal = 30.dp, vertical = 30.dp),
        horizontalAlignment = CenterHorizontally
            //.background(color = Color.Gray)
    ){
        Appbar(
            title = "SignUpEmail",
            navIcon = Icons.Filled.ArrowBack,
            onNavClick = { /*TODO*/ },
            menuIcon = Icons.Filled.Menu
        )

        var email by remember { mutableStateOf(TextFieldValue()) }

        Column(
            modifier = Modifier
                .padding(horizontal = 30.dp, vertical = 30.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Text(
                text = "사용하실 이메일 주소를 입력해주세요.",
                fontSize = 20.sp
            )

            Spacer(modifier = Modifier.height(100.dp))

            TextField(
                value = email,
                onValueChange = { email = it },
                label = {
                    Text("abc@example.com")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .width(300.dp)
            )

            Spacer(modifier = Modifier.height(32.dp))

            Button(
                onClick = {
                    navController.navigate(AllScreen.SignUpPWScreen.name)
                },
                colors = ButtonDefaults.buttonColors(
                    //Color(0xFFC0C0C0),
                    if (email.text.isNotEmpty()) Color(0xFFA4CEFF) else Color(0xFFC0C0C0),
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

@Composable
@Preview
fun PreSignEmailScreen(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            //.background(color = Color.Gray)
    ) {
        SignUpEmailScreen(navController = rememberNavController())
    }
}