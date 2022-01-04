package com.emreozcan.composeto_do.data.models

import androidx.compose.ui.graphics.Color
import com.emreozcan.composeto_do.ui.theme.HighPriorityColor
import com.emreozcan.composeto_do.ui.theme.LowPriorityColor
import com.emreozcan.composeto_do.ui.theme.MediumPriorityColor
import com.emreozcan.composeto_do.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NODE(NonePriorityColor)
}