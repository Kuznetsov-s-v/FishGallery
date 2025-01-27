package com.bluerose.fishgallery.ui.screens.statistics.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bluerose.fishgallery.ui.theme.TypographyStatisticsCard
import com.bluerose.fishgallery.ui.theme.surfaceColor
import com.bluerose.fishgallery.ui.utils.dashedBorder


@Composable
fun StatisticsCard(
    modifier: Modifier,
        label: String,
        text: String,
        shape: RoundedCornerShape
) {

    Column(
        Modifier
            //.fillMaxSize()
            .size(366.dp, 128.dp)
            .dashedBorder(
                3.dp,
                color = Color.Black.copy(0.1f),
                shape = shape,
                on = 11.dp,
                off = 10.dp
            )
            .background(surfaceColor, shape = shape),
        verticalArrangement = Arrangement.Top,
    ) {
        Text(
            modifier = Modifier
                .padding(start = 20.dp, top = 20.dp),
            text = label,
            color = Color(0xFFACACAC),
            style = TypographyStatisticsCard.bodyLarge
        )
        var textValueInt = ""
        var textValueStr = ""
        text.forEach {
            if (it in "+-~<> 0123456789") {
                textValueInt += it
            } else {
                textValueStr += it
            }
        }
        Text(
            modifier = Modifier
                .padding(start = 20.dp, top = 16.dp),
            text = buildAnnotatedString {
                withStyle(style = TypographyStatisticsCard.titleLarge.toSpanStyle()) {
                    append(textValueInt)
                }
                withStyle(style = TypographyStatisticsCard.titleSmall.toSpanStyle()) {
                    append(textValueStr)
                }
            },
        )
    }
}

@Preview(showBackground = false, widthDp = 366, heightDp = 128)
@Composable
fun StatisticsCardPreview(){
    StatisticsCard(
        Modifier,
        label = "Наш улов",
        text = "~ 108 000 000 тонн",
        shape = RoundedCornerShape(topStart = 16.dp, topEnd = 32.dp, bottomEnd = 16.dp),
    )
}