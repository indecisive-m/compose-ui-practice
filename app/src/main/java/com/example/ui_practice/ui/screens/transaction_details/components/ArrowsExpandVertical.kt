package com.example.ui_practice.ui.screens.transaction_details.components

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val ArrowsExpandVertical: ImageVector
    get() {
        if (_ArrowsExpandVertical != null) {
            return _ArrowsExpandVertical!!
        }
        _ArrowsExpandVertical = ImageVector.Builder(
            name = "ArrowsExpandVertical",
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
                        15f
                    )
                    arcToRelative(
                        0.5f,
                        0.5f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -0.5f,
                        -0.5f
                    )
                    verticalLineToRelative(-13f)
                    arcToRelative(
                        0.5f,
                        0.5f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        1f,
                        0f
                    )
                    verticalLineToRelative(13f)
                    arcToRelative(
                        0.5f,
                        0.5f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -0.5f,
                        0.5f
                    )
                    moveTo(
                        0.146f,
                        8.354f
                    )
                    arcToRelative(
                        0.5f,
                        0.5f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        0f,
                        -0.708f
                    )
                    lineToRelative(
                        2f,
                        -2f
                    )
                    arcToRelative(
                        0.5f,
                        0.5f,
                        0f,
                        isMoreThanHalf = true,
                        isPositiveArc = true,
                        0.708f,
                        0.708f
                    )
                    lineTo(
                        1.707f,
                        7.5f
                    )
                    horizontalLineTo(5.5f)
                    arcToRelative(
                        0.5f,
                        0.5f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        0f,
                        1f
                    )
                    horizontalLineTo(1.707f)
                    lineToRelative(
                        1.147f,
                        1.146f
                    )
                    arcToRelative(
                        0.5f,
                        0.5f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -0.708f,
                        0.708f
                    )
                    close()
                    moveTo(
                        10f,
                        8f
                    )
                    arcToRelative(
                        0.5f,
                        0.5f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        0.5f,
                        -0.5f
                    )
                    horizontalLineToRelative(3.793f)
                    lineToRelative(
                        -1.147f,
                        -1.146f
                    )
                    arcToRelative(
                        0.5f,
                        0.5f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        0.708f,
                        -0.708f
                    )
                    lineToRelative(
                        2f,
                        2f
                    )
                    arcToRelative(
                        0.5f,
                        0.5f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        0f,
                        0.708f
                    )
                    lineToRelative(
                        -2f,
                        2f
                    )
                    arcToRelative(
                        0.5f,
                        0.5f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        -0.708f,
                        -0.708f
                    )
                    lineTo(
                        14.293f,
                        8.5f
                    )
                    horizontalLineTo(10.5f)
                    arcTo(
                        0.5f,
                        0.5f,
                        0f,
                        isMoreThanHalf = false,
                        isPositiveArc = true,
                        10f,
                        8f
                    )
                }
            }
            .build()
        return _ArrowsExpandVertical!!
    }

private var _ArrowsExpandVertical: ImageVector? = null
