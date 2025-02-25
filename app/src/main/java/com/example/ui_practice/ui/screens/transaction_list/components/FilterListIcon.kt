package com.example.ui_practice.ui.screens.transaction_list.components

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val Filter_list: ImageVector
    get() {
        if (_Filter_list != null) {
            return _Filter_list!!
        }
        _Filter_list = ImageVector.Builder(
            name = "Filter_list",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        )
            .apply {
                path(
                    fill = SolidColor(Color.Black),
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
                        400f,
                        720f
                    )
                    verticalLineToRelative(-80f)
                    horizontalLineToRelative(160f)
                    verticalLineToRelative(80f)
                    close()
                    moveTo(
                        240f,
                        520f
                    )
                    verticalLineToRelative(-80f)
                    horizontalLineToRelative(480f)
                    verticalLineToRelative(80f)
                    close()
                    moveTo(
                        120f,
                        320f
                    )
                    verticalLineToRelative(-80f)
                    horizontalLineToRelative(720f)
                    verticalLineToRelative(80f)
                    close()
                }
            }
            .build()
        return _Filter_list!!
    }

private var _Filter_list: ImageVector? = null
