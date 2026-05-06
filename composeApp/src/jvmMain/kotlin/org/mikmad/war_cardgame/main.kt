package org.mikmad.war_cardgame

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "war-cardgame",
    ) {
        App()
    }
}