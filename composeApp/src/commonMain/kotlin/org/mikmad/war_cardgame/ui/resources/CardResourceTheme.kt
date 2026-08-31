package org.mikmad.war_cardgame.ui.resources

import org.jetbrains.compose.resources.DrawableResource
import org.mikmad.war_cardgame.models.card.Card

interface CardResourceTheme {
    val displayName: String

    fun front(card: Card): DrawableResource

    fun back(): DrawableResource
}
