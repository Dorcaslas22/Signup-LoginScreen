package com.dorcas.login.screens

import androidx.compose.foundation.gestures.ScrollableState
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
import com.dorcas.login.navigation.PostOfficeAppRouter
import com.dorcas.login.navigation.Screen
import com.dorcas.login.components.CheckboxComponent
import com.dorcas.login.components.ClickableLoginTextComponent
import com.dorcas.login.components.DividerTextComponent
import com.dorcas.login.components.HeadingTextComponent
import com.dorcas.login.components.MyTextField
import com.dorcas.login.components.PasswordTextField
import com.dorcas.login.components.TextComponent

@Composable
fun SignUpScreen() {
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            TextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value = stringResource(id = R.string.create_account))
            Spacer(modifier = Modifier.height(10.dp))

            MyTextField(
                labelValue = stringResource(id = R.string.firstname),
                painterResource(id = R.drawable.user_2)
            )
            MyTextField(
                labelValue = stringResource(id = R.string.lastname),
                painterResource(id = R.drawable.user_2)
            )
            MyTextField(
                labelValue = stringResource(id = R.string.email),
                painterResource(id = R.drawable.mail_2)
            )

            PasswordTextField(
                labelValue = stringResource(id = R.string.password),
                painterResource(id = R.drawable.lock_1)
            )
            CheckboxComponent(value = stringResource(
                id = R.string.terms_conditions),
                onTextSelected = {
                    PostOfficeAppRouter.navigationTo(Screen.TermsandConditionsScreen)
                })
            Spacer(modifier = Modifier.height(20.dp))

            ButtonComponent(value = stringResource(id = R.string.register))

            Spacer(modifier = Modifier.height(10.dp))

            DividerTextComponent()

            ClickableLoginTextComponent(tryingToLogin = true, onTextSelected = {
                PostOfficeAppRouter.navigationTo(Screen.LoginScreen)

            })
        }
    }
}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen(){
    SignUpScreen()
}