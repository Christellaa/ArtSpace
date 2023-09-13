package com.example.artspace


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.artspace.ui.theme.ArtSpaceTheme
import com.example.artspace.ui.theme.PurpleGrey40


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
                    ArtSpaceLayout()
                }
            }
        }
    }
}


@Composable
fun ArtSpaceLogic(modifier: Modifier = Modifier) {
}


@Composable
fun ArtSpaceLayout(modifier: Modifier = Modifier) {
    Column (
        modifier = modifier
            .padding(20.dp)
            .padding(top = 40.dp)
            .fillMaxHeight()
    ) {
        Box(
            modifier = modifier
                .background(PurpleGrey40)
                .padding(16.dp)
                .weight(3f)
        ) {
            Image(
                painter = painterResource(R.drawable.the_fall_of_phaeton_1990_1_1),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        }
        Spacer(modifier = modifier.height(70.dp))
        Column(
            modifier = modifier
                .background(PurpleGrey40)
                .padding(12.dp)
                .fillMaxWidth()
                .weight(.5f)
        ) {
            Text(
                text = stringResource(R.string.painting_phaeton_rubens)
            )
            Row(modifier = modifier) {
                Text(text = stringResource(R.string.artist_rubens))
                Spacer(modifier = modifier.width(20.dp))
                Text(text = stringResource(R.string.date_phaeton_rubens))
            }
        }
        Row(
            horizontalArrangement = Arrangement.SpaceAround ,
            verticalAlignment = Alignment.Bottom,
            modifier = modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Previous")
            }
            //Spacer(modifier = modifier.width(160.dp))
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Next")
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ArtSpaceLayoutPreview() {
    ArtSpaceTheme {
        ArtSpaceLayout()
    }
}