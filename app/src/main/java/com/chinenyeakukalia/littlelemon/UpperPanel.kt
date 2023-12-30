package com.chinenyeakukalia.littlelemon

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chinenyeakukalia.littlelemon.ui.theme.LittleLemonTheme

@Composable
fun UpperPanel(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF495E57)),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        RestaurantName(
            name = stringResource(id = R.string.title),
            size= 32,
            modifier = Modifier.padding(start = 20.dp, top = 20.dp),
            color = Color(0xFFF4CE14),
        )
        Text(
            text = stringResource(R.string.chicago),
            fontSize = 24.sp,
            color = Color(0xFFFFFFFF),
            modifier = Modifier.padding(start = 20.dp)
        )
        Row (
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalArrangement = Arrangement.Center
        ){
            Column {
                Text(
                    text = "We are a family owned Mediterranean restaurant, focused on traditional recipes served with a modern twist.",
                    modifier = Modifier.width(200.dp),
                    color = Color.White,
                    fontSize = 21.sp)
                Button(
                    onClick = { /*TODO*/ },
                    border = BorderStroke(1.dp, Color.Red),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults
                        .buttonColors(Color(0xFFF4CE14))
                ) {
                    Text(
                        text = stringResource(R.string.order)
                    )
                }
            }
            Image(
                painter = painterResource(id = R.drawable.image),
                contentDescription = null,
                modifier = Modifier
                    .height(200.dp)
                    .clip(RoundedCornerShape(20.dp))
            )
        }
    }
}
@Composable
@Preview(showBackground = true)
fun UpperPanelPreview(){
    LittleLemonTheme {
        Surface (
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ){
            UpperPanel()
        }
    }
}