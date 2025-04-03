package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LemonadeTheme {
                LemonadeApp()
            }
        }
    }
}

@Composable
fun LemonWithButtonAndImage(modifier: Modifier = Modifier) {

    var clicker by remember { mutableStateOf(1) }

    when (clicker) {
        1 -> {
            Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(R.drawable.lemon_tree),
                    contentDescription = "1",
                    modifier = Modifier
                        .clickable { clicker = 2 }
                )
                Spacer (modifier = Modifier.height(18.dp))
                Text (stringResource(R.string.tap_lemon_tree))
            }
        }
        2 -> {
            Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(R.drawable.lemon_squeeze),
                    contentDescription = "1",
                    modifier = Modifier
                        .clickable { clicker = 3 }
                )
                Spacer (modifier = Modifier.height(18.dp))
                Text (stringResource(R.string.tap_lemon_squeeze))
            }
        }
        3 -> {
            Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(R.drawable.lemon_drink),
                    contentDescription = "1",
                    modifier = Modifier
                        .clickable { clicker = 4 }
                )
                Spacer (modifier = Modifier.height(18.dp))
                Text (stringResource(R.string.tap_lemon_drink))
            }
        }
        4 -> {
            Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(R.drawable.lemon_restart),
                    contentDescription = "1",
                    modifier = Modifier
                        .clickable { clicker = 1 }
                )
                Spacer (modifier = Modifier.height(18.dp))
                Text (stringResource(R.string.tap_lemon_restart))
            }
        }


    }
}


@Preview(showBackground = true)
@Composable
fun LemonadeApp() {
    LemonadeTheme {
        LemonWithButtonAndImage(modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center))
    }
}