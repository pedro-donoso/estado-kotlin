package com.example.estado.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter

@Composable
fun MainScreen(bookViewModel: BookViewModel) {
    val state = bookViewModel.state

    if (state.isLoading)
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            CircularProgressIndicator()
            Text(text = "Cargando...", color = Color.Blue, modifier = Modifier.padding(top = 100.dp))
        }

    LazyColumn(modifier = Modifier.fillMaxWidth()) {
        items(state.books) { book ->

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Imagen del libro
                Image(
                    painter = rememberAsyncImagePainter(book.coverUrl),
                    contentDescription = "Cover of ${book.title}",
                    modifier = Modifier
                        .width(150.dp)
                        .height(200.dp)
                        .padding(end = 16.dp)
                )

                // Contenedor para el título y el autor
                Column(modifier = Modifier.weight(1f).clickable {
                    bookViewModel.onBookClicked(book)
                }) {
                    Text(text = book.title, modifier = Modifier.padding(bottom = 4.dp))
                    Text(text = book.author)
                }
            }

            HorizontalDivider(thickness = 1.dp, color = Color.Gray)
        }
    }
}