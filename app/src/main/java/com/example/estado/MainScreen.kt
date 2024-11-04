package com.example.estado

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.estado.main.BookViewModel

@Composable
fun MainScreen(bookViewModel: BookViewModel) {
    LazyColumn(modifier = Modifier.fillMaxWidth()) {
        items(bookViewModel.books.value) { book ->
            // Contenedor para cada libro
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically // Alinear verticalmente
            ) {
                // Imagen del libro
                Image(
                    painter = rememberAsyncImagePainter(book.coverUrl),
                    contentDescription = "Cover of ${book.title}",
                    modifier = Modifier
                        .width(150.dp)
                        .height(200.dp)
                        .padding(end = 16.dp) // Espacio a la derecha de la imagen
                )

                // Contenedor para el título y el autor
                Column(modifier = Modifier.weight(1f)) {
                    Text(text = book.title, modifier = Modifier.padding(bottom = 4.dp))
                    Text(text = book.author)
                }
            }
            // Divisor entre libros
            Divider(color = Color.Gray, thickness = 1.dp)
        }
    }
}