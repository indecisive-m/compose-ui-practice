package com.example.ui_practice.ui.screens.transaction_details.components

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val Dot: ImageVector
    get() {
        if (_Dot != null) {
            return _Dot!!
        }
        _Dot = ImageVector.Builder(
            name = "Dot",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        )
            .apply {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    fillAlpha = 1.0f,
                    stroke = null,
                    strokeAlpha = 1.0f,
                    strokeLineWidth = 1.0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                    strokeLineMiter = 1.0f,
                    pathFillType = PathFillType.NonZero
                ) {
                    moveTo(
                        8f,
                        9.5f
                    )
                    arcToRelative(
                        1.5f,
                        1.5f,
                        0f,
                        isMoreThanHalf = true,
                        isPositiveArc = false,
                        0f,
                        -3f
                    )
                    arcToRelative(
                        1.5f,
                        1.5f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = false,
                        0f,
                        3f
                    )
                }
            }
            .build()
        return _Dot!!
    }

private var _Dot: ImageVector? = null
