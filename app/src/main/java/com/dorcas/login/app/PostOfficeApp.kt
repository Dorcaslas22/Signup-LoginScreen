package com.dorcas.login.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.dorcas.login.navigation.PostOfficeAppRouter
import com.dorcas.login.navigation.Screen
import com.dorcas.login.screens.LoginScreen
import com.dorcas.login.screens.SignUpScreen
import com.dorcas.login.screens.TermsandConditionsScreen

@Composable
fun PostOfficeApp(){
    Surface(modifier = Modifier.fillMaxSize(),
        color = Color.White
        ) {

        Crossfade(targetState = PostOfficeAppRouter.currentScreen, label = "") { currentState->
            when(currentState.value){
                is Screen.SignUpScreen ->{
                    SignUpScreen()
                }
                is Screen.TermsandConditionsScreen ->{
                    TermsandConditionsScreen()
                }
                is Screen.LoginScreen ->{
                    LoginScreen()
                }
            }

        }

    }
}