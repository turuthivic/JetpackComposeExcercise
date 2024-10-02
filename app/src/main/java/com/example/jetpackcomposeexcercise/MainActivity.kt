package com.example.jetpackcomposeexcercise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeexcercise.ui.theme.JetpackComposeExcerciseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeExcerciseTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    JetpackComposeTutorial(
                        modifier = Modifier.padding(top = 38.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun JetpackComposeTutorial(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Surface(modifier) {
        Box(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier.align(Alignment.TopCenter)) {
                Image(
                    painter = image,
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier.fillMaxWidth()
                )
                Text(
                    text = stringResource(R.string.jetpack_compose_tutorial_header),
                    fontSize = 24.sp,
                    modifier = Modifier
                        .padding(16.dp)
                )
                Text(
                    text = stringResource(R.string.jetpack_compose_first_paragraph),
                    modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                    textAlign = TextAlign.Justify
                )
                Text(
                    text = stringResource(R.string.jetpack_compose_second_paragraph),
                    modifier = Modifier.padding(16.dp),
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun JetpackComposeTutorialPreview() {
    JetpackComposeExcerciseTheme {
        JetpackComposeTutorial()
    }
}