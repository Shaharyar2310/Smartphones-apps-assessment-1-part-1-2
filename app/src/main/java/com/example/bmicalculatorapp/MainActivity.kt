package com.example.bmicalculatorapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyNavigation()
        }
    }

    @Composable
    fun MyNavigation() {
        val navCon = rememberNavController()
        NavHost(navController = navCon, startDestination = "home") {
            composable("home") {
                HomeScreen(navCon)
            }
            composable("BMI") {
                Calculator(navCon)
            }

            composable("${ResultScreen.route}/{result}") { navBackStackEntry ->
                val result = navBackStackEntry.arguments?.getString("result") ?: ""
                ResultScreen(result,navCon)
            }

        }

    }

    }
