package com.example.estado.main

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class BookViewModel : ViewModel() {
    var books = mutableStateOf(listOf<Book>())
    private set

    init {
        viewModelScope.launch {
            delay(5000)
            books.value = listOf(
                Book("The Great Gatsby", "F. Scott Fitzgerald", 1925),
                Book("Pride and Prejudice", "Jane Austen", 1813),
                Book("The Catcher in the Rye", "J.D. Salinger", 1951)
                )
        }
    }
}