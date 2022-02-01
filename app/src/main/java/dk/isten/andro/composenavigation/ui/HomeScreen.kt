package dk.isten.andro.composenavigation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dk.isten.andro.composenavigation.R

@Preview
@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Hej mor", fontSize = 42.sp, color = Color.Red)
        Image(painter = painterResource(R.drawable.lobeklub), contentDescription = "", Modifier.padding(12.dp))
        Button(onClick = { /*TODO*/ }) {
            Text("click me")
        }
    }
}
