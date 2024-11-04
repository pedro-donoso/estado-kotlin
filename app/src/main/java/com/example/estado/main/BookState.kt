package com.example.estado.main

data class BookState(
    val books: List<Book> = listOf(),
    val isLoading: Boolean = false
)
