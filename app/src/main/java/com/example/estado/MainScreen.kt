package com.example.estado

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.estado.main.BookViewModel

@Composable
fun MainScreen(bookViewModel: BookViewModel) {
    LazyColumn(modifier = Modifier.fillMaxWidth()) {
        items(bookViewModel.books.value) { book ->
            Column(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
                Image(
                    painter = rememberAsyncImagePainter(book.coverUrl),
                    contentDescription = "Cover of ${book.title}",
                    modifier = Modifier
                        .width(100.dp)
                        .height(200.dp)
                        .fillMaxWidth()
                        .padding(bottom = 8.dp)
                )
                Text(text = book.title)
                Text(text = book.author)
                Spacer(modifier = Modifier.height(8.dp))

                // Divisor
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(Color.Black)
                )
                Spacer(modifier = Modifier.height(4.dp))
            }
        }
    }
}