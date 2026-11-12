package com.example.harudam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.harudam.ui.screens.HarudamHomeScreen
import com.example.harudam.ui.theme.HarudamTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            HarudamTheme {
                HarudamHomeScreen()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun HarudamHomeScreenPreview() {
    MaterialTheme {
        HarudamHomeScreen()
    }
}