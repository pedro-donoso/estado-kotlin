package com.example.estado

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.estado.main.BookViewModel

@Composable
fun MainScreen(bookViewModel: BookViewModel) {
    LazyColumn(modifier = Modifier.fillMaxWidth()) {
        items(bookViewModel.books.value) { book ->
            Column(modifier = Modifier.fillMaxWidth()) {
                Text(text = book.title)
                Text(text = book.author)
                Text(text = book.year.toString())
                HorizontalDivider()
            }
        }
    }
}