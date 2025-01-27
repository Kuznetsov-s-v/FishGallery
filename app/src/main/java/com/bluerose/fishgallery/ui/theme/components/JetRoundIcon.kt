package com.bluerose.fishgallery.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bluerose.fishgallery.R
import com.bluerose.fishgallery.ui.theme.OnPrimaryColor_BlueRose
import com.bluerose.fishgallery.ui.theme.backColorIcon
import com.bluerose.fishgallery.ui.theme.onPrimaryColor
import com.bluerose.fishgallery.ui.theme.surfaceColor


@Composable
fun JetRoundIcon(
    modifier: Modifier,
    vectorDrawableId: Int
){ Box(
    modifier = modifier
            .clip(CircleShape)
            .background(backColorIcon)
            .border(3.dp, onPrimaryColor, shape = CircleShape)
            .size(100.dp),
    contentAlignment = Alignment.Center
    ){
        Icon(
            imageVector = ImageVector.vectorResource(id = vectorDrawableId),
            contentDescription = "App Icon",
           // modifier = modifier
           //     .background(surfaceColor),
            tint = surfaceColor
        )
    }
}

@Composable
fun JetRoundIconTransparent(
    modifier: Modifier,
    vectorDrawableId: Int
){ Box(
    modifier = modifier
        .clip(CircleShape)
        .background(MaterialTheme.colorScheme.primary)
        .border(3.dp, OnPrimaryColor_BlueRose, shape = CircleShape)
        .size(64.dp),
    contentAlignment = Alignment.Center
){
    Icon(
        imageVector = ImageVector.vectorResource(id = vectorDrawableId),
        contentDescription = "App Icon",
        modifier = modifier
             .background(MaterialTheme.colorScheme.primary),
        tint = OnPrimaryColor_BlueRose
    )
}
}

@Preview(showBackground = false)
@Composable
fun JetRoundIconPreview(){
        //JetRoundIcon(
    JetRoundIconTransparent(
            Modifier,
            R.drawable.ic_launcher
        )
    }