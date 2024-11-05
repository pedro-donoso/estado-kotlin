package com.example.estado

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.estado.main.BookViewModel
import com.example.estado.main.MainScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bookViewModel by viewModels<BookViewModel>()
        setContent {
            MainScreen(bookViewModel)
        }
    }
}

