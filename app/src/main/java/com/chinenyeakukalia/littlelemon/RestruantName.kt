package com.chinenyeakukalia.littlelemon

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RestaurantName(name: String, size: Int, modifier: Modifier, color: Color){
    Text(
        text = name,
        fontSize = size.sp,
        color = Color(0xFFF4CE14),
        modifier = Modifier.padding(start = 20.dp, top = 20.dp)
    )
}

