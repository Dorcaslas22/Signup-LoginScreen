package com.dorcas.login.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dorcas.login.R
import com.dorcas.login.components.ButtonComponent
import com.dorcas.login.components.ClickableLoginTextComponent
import com.dorcas.login.components.DividerTextComponent
import com.dorcas.login.components.HeadingTextComponent
import com.dorcas.login.components.MyTextField
import com.dorcas.login.components.PasswordTextField
import com.dorcas.login.components.TextComponent
import com.dorcas.login.components.UnderlinedTextComponent
import com.dorcas.login.navigation.PostOfficeAppRouter
import com.dorcas.login.navigation.Screen
import com.dorcas.login.navigation.SystemBackButtonHandler

@Composable
fun LoginScreen() {
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .padding(28.dp)
    ) {
        Column(
            modifier = Modifier
            .fillMaxSize()
        ) {
            TextComponent(value = stringResource(id = R.string.login))
            HeadingTextComponent(value = stringResource(id = R.string.welcome))
            Spacer(modifier = Modifier.height(20.dp))


            MyTextField(
                labelValue = stringResource(id = R.string.email),
                painterResource(id = R.drawable.mail_2)
            )

            PasswordTextField(
                labelValue = stringResource(id = R.string.password),
                painterResource(id = R.drawable.lock_1)
            )

            Spacer(modifier = Modifier.height(20.dp))
            UnderlinedTextComponent(value = stringResource(id = R.string.forgot_password))

            Spacer(modifier = Modifier.height(20.dp))
            ButtonComponent(value = stringResource(id = R.string.login))

            Spacer(modifier = Modifier.height(20.dp))
            DividerTextComponent()

            ClickableLoginTextComponent(tryingToLogin = false, onTextSelected = {
                PostOfficeAppRouter.navigationTo(Screen.SignUpScreen)


            })

        }

    }
              SystemBackButtonHandler {
                  PostOfficeAppRouter.navigationTo(Screen.SignUpScreen)


    }
}


@Preview
@Composable
fun LoginScreenPreview(){
    LoginScreen()
}