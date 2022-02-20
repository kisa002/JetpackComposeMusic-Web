package supports.compose

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.ContentBuilder
import org.jetbrains.compose.web.dom.Div
import org.w3c.dom.HTMLDivElement
import ui.ColorPrimary

@Composable
fun Body(backgroundColor: CSSColorValue = ColorPrimary, content: ContentBuilder<HTMLDivElement>) {
    Div(attrs = {
        style {
            width(100.vw)
            height(100.vh)
            backgroundColor(ColorPrimary)
            padding(0.px)
        }
    }, content = content)
}