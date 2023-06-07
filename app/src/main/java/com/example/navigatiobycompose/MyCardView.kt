package com.example.navigatiobycompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyCardView(
    title: String,
    imageResId: Int,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Card(
        shape = RoundedCornerShape(8.dp),
        elevation = 4.dp,
        modifier = modifier
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(imageResId),
                contentDescription = null,
                modifier = Modifier
                    .size(80.dp)
                    .clip(shape = RoundedCornerShape(8.dp))
            )
            Text(
                text = title,
                style = MaterialTheme.typography.h6,
                fontWeight = FontWeight.Normal
            )
            Spacer(modifier = Modifier.height(8.dp))
            content()
        }
    }
}
@Composable
@Preview(showBackground = true)
fun PreviewCard(){
    MyCardView(title = "Assad", imageResId =R.drawable.second ){

    }
}