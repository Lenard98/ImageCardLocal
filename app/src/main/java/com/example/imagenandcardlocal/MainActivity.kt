package com.example.imagenandcardlocal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.imagenandcardlocal.ui.theme.ImagenAndCardLocalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImagenAndCardLocalTheme {
                Surface {
                    Modifier .fillMaxSize()
                    MaterialTheme.colorScheme.background
                    Local()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Local() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopAppBar(title = { Text(stringResource(R.string.main_title)) } )
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                ElevatedCard(
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Black
                    ),
                    modifier = Modifier.size(width = 700.dp, height = 500.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Nirvana: IN UTERO",
                            modifier = Modifier.padding(16.dp),
                            color = Color.White,
                            textAlign = TextAlign.Center
                        )

                        Image(
                            painter = painterResource(R.drawable.xd2),
                            contentDescription = "xd1",

                            )

                        Text(
                            text = "In Utero es el tercer y último álbum de estudio de la banda estadounidense de grunge Nirvana, lanzado en septiembre de 1993 por DGC Records.",
                            modifier = Modifier.padding(16.dp),
                            color = Color.White,
                            textAlign = TextAlign.Left
                        )
                    }
                }
            }

            item {
                ElevatedCard(
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Black
                    ),
                    modifier = Modifier.size(width = 700.dp, height = 500.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Nirvana: BLEACH",
                            modifier = Modifier.padding(16.dp),
                            color = Color.White,
                            textAlign = TextAlign.Center
                        )
                        Image(
                            painter = painterResource(R.drawable.xd3),
                            contentDescription = "xd3",

                            )

                        Text(
                            text = "Bleach es el álbum de estudio debut de la banda de rock estadounidense Nirvana, lanzado el 15 de junio de 1989 por Sub Pop.",
                            modifier = Modifier.padding(16.dp),
                            color = Color.White,
                            textAlign = TextAlign.Left
                        )
                    }
                }
            }

            item {
                ElevatedCard(
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Black
                    ),
                    modifier = Modifier.size(width = 700.dp, height = 500.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Nirvana: Nevermind",
                            modifier = Modifier.padding(16.dp),
                            color = Color.White,
                            textAlign = TextAlign.Center
                        )
                        Image(
                            painter = painterResource(R.drawable.xd6),
                            contentDescription = "xd6",

                        )

                        Text(
                            text = "Nevermind es el segundo álbum de estudio de la banda estadounidense de grunge Nirvana, publicado el 24 de septiembre de 1991.",
                            modifier = Modifier.padding(16.dp),
                            color = Color.White,
                            textAlign = TextAlign.Left
                        )
                    }
                }
            }
        }
    }
}

