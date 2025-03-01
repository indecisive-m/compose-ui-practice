package com.example.ui_practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.ui_practice.navigation.NavHost
import com.example.ui_practice.ui.theme.UipracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UipracticeTheme {


                Scaffold(
                    modifier = Modifier
//                        .fillMaxSize()
                ) { innerPadding ->
                    NavHost(
                        modifier = Modifier
                            .padding(innerPadding)
                    )

                }
            }
        }
    }
}



