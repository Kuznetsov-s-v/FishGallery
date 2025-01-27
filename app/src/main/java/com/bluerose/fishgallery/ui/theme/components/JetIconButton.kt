package com.bluerose.fishgallery.ui.theme.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bluerose.fishgallery.ui.theme.FishGalleryTheme
import com.bluerose.fishgallery.ui.utils.dashedBorder
import com.microsoft.fluent.mobile.icons.R.drawable


@Composable
fun JetIconButton(
    vectorDrawableId: Int,
    modifier: Modifier,
    shape: RoundedCornerShape,
    contentPadding: PaddingValues,
){
    Box(
        modifier = Modifier
                .dashedBorder(2.dp,color = MaterialTheme.colorScheme.onPrimary,shape = shape,on = 7.dp,off = 7.dp
    )
        .padding(contentPadding)
    ){
        Icon (
            painter = painterResource(id = vectorDrawableId),
            contentDescription = "Icon button",
            tint = MaterialTheme.colorScheme.onPrimary
        )
    }
}


@Preview(showBackground = true, backgroundColor = 0xFFEEF4F3)
@Composable
fun JetIconButtonPreview() {
    FishGalleryTheme(darkTheme = false, dynamicColor = false, ) {
        JetIconButton(
              vectorDrawableId = drawable.ic_fluent_chevron_left_16_filled,
              modifier = Modifier.size(48.dp),
              shape = RoundedCornerShape(CornerSize(8.dp)),
              contentPadding = PaddingValues(12.dp)
        )
    }
}
