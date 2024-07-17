package co.kr.snaptime.ui.screen

import android.os.Build
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.Visibility
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import co.kr.snaptime.R
import co.kr.snaptime.ui.component.Appbar
import co.kr.snaptime.ui.viewmodel.LogInViewModel
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUpInfoScreen(
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

        var name by rememberSaveable { mutableStateOf("")}
        var birth by rememberSaveable { mutableStateOf("") }
        var birthError by rememberSaveable { mutableStateOf(false) }

        val dateFormatter = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            DateTimeFormatter.ofPattern("yyyy.MM.dd")
        } else {
            TODO("VERSION.SDK_INT < O")
        }

        fun validateDate(dateString: String): Boolean {
            return try {
                val inputDate = LocalDate.parse(dateString, dateFormatter)
                val currentDate = LocalDate.now()
                inputDate.isBefore(currentDate) || inputDate.isEqual(currentDate)
            } catch (e: Exception) {
                false
            }
        }


        Column(
            modifier = Modifier
                .padding(horizontal = 30.dp, vertical = 30.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Text(
                text = "이름, 생년월일을 입력해주세요.",
                fontSize = 20.sp
            )

            Spacer(modifier = Modifier.height(100.dp))

            TextField(
                value = name,
                onValueChange = { name = it },
                label = {
                    Text("이름 입력")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .width(300.dp)
            )

            Spacer(modifier = Modifier.height(32.dp))

            TextField(
                value = birth,
                onValueChange =
                {
                    birth = it
                    birthError = !validateDate(it)
                },

                label = {
                    Text("1991.01.01")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .width(300.dp),
                isError = birthError
            )

            if(birthError) {
                Text(
                    text = "생년월일 양식이 잘못되었습니다 !",
                    color = Color.Red,
                    modifier = Modifier.padding(top = 8.dp))
            }


            Spacer(modifier = Modifier.height(32.dp))


            Button(
                onClick = {
                    navController.navigate(AllScreen.SignUpIDScreen.name)
                },
                colors = ButtonDefaults.buttonColors(
                    //Color(0xFFC0C0C0),
                    if (name.isNotEmpty() && birth.isNotEmpty()) Color(0xFFA4CEFF) else Color(0xFFC0C0C0),
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
fun PreSignUpInfoScreen() {
    // NavHost setup
    val navController = rememberNavController()

    SignUpInfoScreen(navController = navController)
}