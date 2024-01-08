package com.dorcas.login.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dorcas.login.R
import com.dorcas.login.components.HeadingTextComponent
import com.dorcas.login.navigation.PostOfficeAppRouter
import com.dorcas.login.navigation.Screen
import com.dorcas.login.navigation.SystemBackButtonHandler

@Composable
fun TermsandConditionsScreen(){
    Surface(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        .padding(16.dp)) {
        
        HeadingTextComponent(value = stringResource(id = R.string.terms_conditions_header))

    }
    SystemBackButtonHandler {
        PostOfficeAppRouter.navigationTo(Screen.SignUpScreen)

    }
}



@Preview
@Composable
fun TermsandConditionsScreenPreview(){
    TermsandConditionsScreen()
}