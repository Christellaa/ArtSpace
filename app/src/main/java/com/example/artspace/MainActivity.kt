package com.example.artspace


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtSpaceTheme
import com.example.artspace.ui.theme.LightGrey


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtSpaceApp()
                }
            }
        }
    }
}


@Composable
fun ArtSpaceApp(modifier: Modifier = Modifier) {
    var currentImg by remember {
        mutableStateOf(1)
    }

    fun clickPrevious() {
        if (currentImg == 1) {
            currentImg = 11
        } else {
            currentImg--
        }
    }
    fun clickNext() {
        if (currentImg == 11) {
            currentImg = 1
        } else {
            currentImg++
        }
    }

        when (currentImg) {
        1 -> {
            ArtworkLayout(
                img = painterResource(R.drawable.the_fall_of_phaeton_1990_1_1),
                imgDesc = stringResource(R.string.painting_phaeton_rubens),
                title = R.string.painting_phaeton_rubens,
                artist = R.string.artist_rubens,
                date = R.string.date_phaeton_rubens,
                previousImg = { clickPrevious() },
                nextImg = { clickNext() }
            )
        }
        2 -> {
            ArtworkLayout(
                img = painterResource(R.drawable.madame_d_aguesseau_de_fresnes_1946_7_16),
                imgDesc = stringResource(R.string.painting_fresnes_le_brun),
                title = R.string.painting_fresnes_le_brun,
                artist = R.string.artist_le_brun,
                date = R.string.date_fresnes_le_brun,
                previousImg = { clickPrevious() },
                nextImg = { clickNext() }
            )
        }
        3 -> {
            ArtworkLayout(
                img = painterResource(R.drawable.the_fence_1985_64_31),
                imgDesc = stringResource(R.string.painting_fence_pissarro),
                title = R.string.painting_fence_pissarro,
                artist = R.string.artist_pissarro,
                date = R.string.date_fence_pissarro,
                previousImg = { clickPrevious() },
                nextImg = { clickNext() }
            )
        }
        4 -> {
            ArtworkLayout(
                img = painterResource(R.drawable.a_creek_in_st__thomas__virgin_islands__1985_64_29),
                imgDesc = stringResource(R.string.painting_creek_pissarro),
                title = R.string.painting_creek_pissarro,
                artist = R.string.artist_pissarro,
                date = R.string.date_creek_pissarro,
                previousImg = { clickPrevious() },
                nextImg = { clickNext() }
            )
        }
        5 -> {
            ArtworkLayout(
                img = painterResource(R.drawable.flower_beds_in_holland_1983_1_21),
                imgDesc = stringResource(R.string.painting_flower_beds_van_gogh),
                title = R.string.painting_flower_beds_van_gogh,
                artist = R.string.artist_van_gogh,
                date = R.string.date_flower_beds_van_gogh,
                previousImg = { clickPrevious() },
                nextImg = { clickNext() }
            )
        }
        6 -> {
            ArtworkLayout(
                img = painterResource(R.drawable.roses_1991_67_1),
                imgDesc = stringResource(R.string.painting_roses_van_gogh),
                title = R.string.painting_roses_van_gogh,
                artist = R.string.artist_van_gogh,
                date = R.string.date_roses_van_gogh,
                previousImg = { clickPrevious() },
                nextImg = { clickNext() }
            )
        }
        7 -> {
            ArtworkLayout(
                img = painterResource(R.drawable.ginevra_de__benci__obverse__1967_6_1_a),
                imgDesc = stringResource(R.string.painting_da_vinci),
                title = R.string.painting_da_vinci,
                artist = R.string.artist_da_vinci,
                date = R.string.date_da_vinci,
                previousImg = { clickPrevious() },
                nextImg = { clickNext() }
            )
        }
        8 -> {
            ArtworkLayout(
                img = painterResource(R.drawable.the_artist_s_garden_at_vetheuil_1970_17_45),
                imgDesc = stringResource(R.string.painting_garden_monet),
                title = R.string.painting_garden_monet,
                artist = R.string.artist_monet,
                date = R.string.date_garden_monet,
                previousImg = { clickPrevious() },
                nextImg = { clickNext() }
            )
        }
        9 -> {
            ArtworkLayout(
                img = painterResource(R.drawable.still_life_with_milk_jug_and_fruit_1972_9_5),
                imgDesc = stringResource(R.string.painting_still_life_cezanne),
                title = R.string.painting_still_life_cezanne,
                artist = R.string.artist_cezanne,
                date = R.string.date_still_life_cezanne,
                previousImg = { clickPrevious() },
                nextImg = { clickNext() }
            )
        }
        10 -> {
            ArtworkLayout(
                img = painterResource(R.drawable.the_mill_1942_9_62),
                imgDesc = stringResource(R.string.painting_mill_rembrandt),
                title = R.string.painting_mill_rembrandt,
                artist = R.string.artist_rembrandt,
                date = R.string.date_mill_rembrandt,
                previousImg = { clickPrevious() },
                nextImg = { clickNext() }
            )
        }
        11 -> {
            ArtworkLayout(
                img = painterResource(R.drawable.faust_1949_1_40),
                imgDesc = stringResource(R.string.painting_faust_rembrandt),
                title = R.string.painting_faust_rembrandt,
                artist = R.string.artist_rembrandt,
                date = R.string.date_faust_rembrandt,
                previousImg = { clickPrevious() },
                nextImg = { clickNext() }
            )
        }
    }
}


@Composable
fun ArtworkLayout(
    img: Painter,
    imgDesc: String,
    @StringRes title: Int,
    @StringRes artist: Int,
    @StringRes date: Int,
    previousImg: () -> Unit,
    nextImg: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column (
        modifier = modifier
            .padding(12.dp)
            .padding(top = 40.dp)
            .fillMaxHeight()
    ) {
        Box(
            modifier = modifier
                .shadow(4.dp)
                .padding(24.dp)
                .weight(3f)
        ) {
            Image(
                painter = img,
                contentDescription = imgDesc,
                contentScale = ContentScale.Crop
            )
        }
        Spacer(modifier = modifier.height(50.dp))
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = modifier
                .fillMaxSize()
                .weight(.6f)
                .shadow(8.dp)
                .background(LightGrey)
                .padding(12.dp)
        ) {
            Text(
                text = stringResource(id = title),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Row(modifier = modifier) {
                Text(
                    text = stringResource(id = artist),
                    fontStyle = FontStyle.Italic
                )
                Spacer(modifier = modifier.width(10.dp))
                Text(
                    text = "(" + stringResource(id = date) + ")"
                )
            }
        }
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.Bottom,
            modifier = Modifier
                .weight(.6f)
                .fillMaxWidth()
        ) {
            Button("Previous", changeImg = previousImg)
            Button("Next", changeImg = nextImg)
        }
    }
}

@Composable
fun Button(btnName: String, changeImg: () -> Unit, modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.Bottom,
        modifier = modifier
    ) {
        Button(onClick = changeImg) {
            Text(text = btnName)
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ArtSpaceAppPreview() {
    ArtSpaceTheme {
        ArtSpaceApp()
    }
}