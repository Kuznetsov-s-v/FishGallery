package com.bluerose.fishgallery.ui.screens.catch.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bluerose.fishgallery.ui.theme.FishGalleryTheme
import com.bluerose.fishgallery.ui.theme.TypographyCatchCard
import com.bluerose.fishgallery.ui.theme.components.JetRoundImage


@Composable
fun CatchCard(
    label: String,
    text: String,
    imagePath: String,
    modifier: Modifier = Modifier
){
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        JetRoundImage(
            imagePath = imagePath,
            shape = RoundedCornerShape(size = 32.dp),
            modifier = Modifier
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 5.dp)
        ) {
        Text(
            text = label,
            color = MaterialTheme.colorScheme.onPrimary,
            style = TypographyCatchCard.titleLarge,
            modifier = Modifier
                .padding(start = 16.dp)
        )
        Spacer(modifier = Modifier.weight(0.1f))
        Text(
            text = text,
            color = MaterialTheme.colorScheme.onPrimary,
            style = TypographyCatchCard.bodyLarge,
            modifier = Modifier
                .padding(end = 16.dp)
        )
        }

    }

}

@Preview(showBackground = true, backgroundColor = 0xFFEEF4F3)
@Composable
fun JetIconButtonPreview() {
    FishGalleryTheme(darkTheme = false, dynamicColor = false, ) {
        CatchCard(
            label = "Призрачный дельфи",
            text =  "50 000 000 тонн",
            imagePath = "Fish1.jpg",
        )
    }
}