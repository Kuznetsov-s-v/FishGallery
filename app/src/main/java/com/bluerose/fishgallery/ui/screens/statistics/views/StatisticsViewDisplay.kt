package com.bluerose.fishgallery.ui.screens.statistics.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bluerose.fishgallery.R
import com.bluerose.fishgallery.ui.components.JetRoundIconTransparent
import com.bluerose.fishgallery.ui.theme.FishGalleryTheme
import com.bluerose.fishgallery.ui.theme.TypographyStatisticsViewDisplay

@Composable
fun StatisticsViewDisplay() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = MaterialTheme.colorScheme.primary
            )
            .padding(start = 24.dp, top = 32.dp, end = 24.dp)
            .verticalScroll(rememberScrollState())
    ) {
          Text(
              text = buildAnnotatedString {
                  withStyle(style = TypographyStatisticsViewDisplay.titleLarge.toSpanStyle()) {
                      append(stringResource(R.string.header_title).substringBefore(" ")+" ")
                  }
                  withStyle(style = TypographyStatisticsViewDisplay.titleMedium.toSpanStyle()) {
                      append(stringResource(R.string.header_title).substringAfter(" "))
                  }
              },
              modifier = Modifier.padding(bottom = 32.dp),
          )
        StatisticsCard(
            Modifier,
            label = stringResource(R.string.our_catch_title),
            text = stringResource(R.string.our_catch_value).replace("%s", "108 000 000"),
            shape = RoundedCornerShape(topStart = 16.dp, topEnd = 32.dp, bottomEnd = 16.dp )
        )
        Spacer(
            modifier = Modifier.padding(bottom = 24.dp)
        )
        StatisticsCard(
            Modifier,
            stringResource(R.string.our_profit_title),
            stringResource(R.string.our_profit_value).replace("%s", "5 400 000"),
            shape = RoundedCornerShape(topStart = 16.dp, bottomEnd = 16.dp, bottomStart = 32.dp )
        )
        Spacer(
            modifier = Modifier.padding(bottom = 24.dp)
        )
        StatisticsCard(
            Modifier,
            stringResource(R.string.our_partners_title),
            stringResource(R.string.our_partners_value).replace("%s", "1 500"),
            shape = RoundedCornerShape(topStart = 16.dp,topEnd = 48.dp,bottomEnd = 16.dp),
        )
        Spacer( modifier = Modifier.weight(1f) )
        Row(modifier = Modifier
            .padding(bottom = 16.dp)
            .align(Alignment.End)
        ){
            Text(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(end = 16.dp)
                ,
                text = stringResource(R.string.footer_title),
                style = TypographyStatisticsViewDisplay.titleLarge
            )
            JetRoundIconTransparent(
                Modifier,
                R.drawable.ic_launcher
            )
        }
    }
}

@Preview(showBackground = false, locale = "en")
@Composable
fun StatisticsViewDisplayPreview() {
    FishGalleryTheme(darkTheme = false, dynamicColor = false) {
        StatisticsViewDisplay()
    }
}