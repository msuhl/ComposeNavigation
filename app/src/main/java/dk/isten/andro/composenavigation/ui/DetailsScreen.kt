package dk.isten.andro.composenavigation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import dk.isten.andro.composenavigation.R

@Composable
fun DetailsScreen(
    navController: NavController = NavController(LocalContext.current),
){

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Nu bliver du bange!", fontSize = 42.sp, color = Color.Red)
        Image(painter = painterResource(R.drawable.ic_launcher_foreground), contentDescription = "", Modifier.padding(12.dp))
        Button(onClick = {
            navController.navigate(
                Screen.FurtherDetailScreen.route
            )
        }) {
            Text("Men vi skal længere ind")
        }
    }
}