package br.senai.sp.jandira.rickmorty.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.rickmorty.R
import br.senai.sp.jandira.rickmorty.model.Character
import coil.compose.AsyncImage
import org.jetbrains.annotations.Async


@Composable
fun CharacterCard(
    name: String = "",
    species: String = "",
    status: String = "",
    photo: String = ""
){

    Card(
        modifier = Modifier
            .fillMaxSize()
            .height(150.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Card(
                modifier = Modifier
                    .padding(start = 8.dp)
                    .size(100.dp),
                shape = CircleShape
            ) {
                AsyncImage(
                    model = photo,
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
            }
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center
            ){
                Text(
                    text = name,
                    fontSize = 20.sp
                )
                Text(
                    text = species
                )
                Text(
                    text = status
                )
            }
        }
    }

}

@Preview
@Composable
private fun CharacterCardPreview(){
    CharacterCard(
        name = "Characters name",
        species = "Human",
        status = "Live"
    )
}