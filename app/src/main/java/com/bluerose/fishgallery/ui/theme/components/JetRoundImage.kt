package com.bluerose.fishgallery.ui.theme.components

import android.graphics.BitmapFactory
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import com.bluerose.fishgallery.ui.theme.FishGalleryTheme
import com.bluerose.fishgallery.ui.utils.advancedShadow

@Composable
fun JetRoundImage(
    imagePath: String,
    shape: RoundedCornerShape,
    withShadow: Boolean = true,
    size: DpSize = DpSize(366.dp, 136.dp),
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val assetManager = context.assets
    val inputStream = assetManager.open(imagePath)
    val bitmap = BitmapFactory.decodeStream(inputStream)

    Box(
        modifier = modifier
            .padding(5.dp)
            .size(size)
            .border(
                3.dp,
                color =  MaterialTheme.colorScheme.surface,
                shape = shape
            )
            .advancedShadow(
                alpha = if (withShadow) 0.05f else 0f,
                shadowBlurRadius = 5.dp,
                offsetY = 4.dp
            ),

        ) {
        Image(
            bitmap = bitmap.asImageBitmap(),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .clip(shape)
        )
    }
}



@Preview(showBackground = true)
@Composable
fun JetRoundImagePreview() {
    FishGalleryTheme(darkTheme = false, dynamicColor = false) {
        JetRoundImage(
            imagePath = "Fish1.jpg",
            shape = RoundedCornerShape(size = 32.dp),
            modifier = Modifier ////.size(100.dp)
        )
    }
}