package com.example.estado.main

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class BookViewModel : ViewModel() {
    var state by mutableStateOf(BookState())

    init {
        viewModelScope.launch {
            state = state.copy(
                isLoading = true
            )

            delay(5000)

            state = state.copy(
                isLoading = false,
                books = listOf(
                    Book(
                        "The Great Gatsby",
                        "F. Scott Fitzgerald",
                        1925,
                        "https://th.bing.com/th/id/OIP.rX3bivDFwC-271y5wMlIrQHaLO?rs=1&pid=ImgDetMain"
                    ),
                    Book(
                        "Pride and Prejudice",
                        "Jane Austen",
                        1813,
                        "https://th.bing.com/th/id/OIP.17fuccisPdTvLIHxK2hcPgHaLU?rs=1&pid=ImgDetMain"
                    ),
                    Book(
                        "The Catcher in the Rye",
                        "J.D. Salinger",
                        1951,
                        "https://idunneditorial.com/wp-content/uploads/2016/04/El-guardia%CC%81n-entre-el-centeno.jpg"
                    )
                )
            )
        }
    }
}