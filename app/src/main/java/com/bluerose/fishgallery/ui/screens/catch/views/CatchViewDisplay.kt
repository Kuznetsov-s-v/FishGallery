package com.bluerose.fishgallery.ui.screens.catch.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bluerose.fishgallery.ui.theme.FishGalleryTheme
import com.bluerose.fishgallery.ui.theme.components.JetIconButton
import com.bluerose.fishgallery.ui.theme.fonts
import com.microsoft.fluent.mobile.icons.R

data class FishData(
    val label: String,
    val text: String,
    val imagePath: String
)

@Composable
fun getFishDataList(): List<FishData> {
    return listOf(
        FishData(
            label = "Призрачный дельфи",
            text = stringResource(id = com.bluerose.fishgallery.R.string.our_catch_value).replace("%s", "50 000 000 "),
            imagePath = "Fish1.jpg"
        ),
        FishData(
            label = "Алмазный ус",
            text = stringResource(id = com.bluerose.fishgallery.R.string.our_catch_value).replace("%s", "48 000 000"),
            imagePath = "Fish2.jpg"
        ),
        FishData(
            label = "Шестиперая аку",
            text = stringResource(id = com.bluerose.fishgallery.R.string.our_catch_value).replace("%s", "10 000 000"),
            imagePath = "Fish3.jpg"
        )
    )
}


@Composable
fun CatchViewDisplay(){
    Column(
        modifier = Modifier
            .background(
                color = MaterialTheme.colorScheme.primary,
            )
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ){
        Row(
            modifier = Modifier.padding(24.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            JetIconButton(
                vectorDrawableId = R.drawable.ic_fluent_chevron_left_16_filled,
                modifier = Modifier.size(48.dp),
                shape = RoundedCornerShape(CornerSize(8.dp)),
                contentPadding = PaddingValues(12.dp)
            )
            Box(
                modifier = Modifier.weight(1f),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = stringResource(com.bluerose.fishgallery.R.string.our_catch_title),
                    color = MaterialTheme.colorScheme.onPrimary,
                    style = TextStyle(
                        fontFamily = fonts,
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp,
                        lineHeight = 28.13.sp,
                        letterSpacing = 0.sp,
                    )
                )
            }
        }
        getFishDataList().forEach { fish ->
            CatchCard(
                label = fish.label,
                text = fish.text,
                imagePath = fish.imagePath,
            )
        }
    }
}

@Preview(showBackground = true, locale = "en")
@Composable
fun CatchViewDisplayPreview() {
      FishGalleryTheme(darkTheme = false, dynamicColor = false, ) {
        CatchViewDisplay()
    }
}
