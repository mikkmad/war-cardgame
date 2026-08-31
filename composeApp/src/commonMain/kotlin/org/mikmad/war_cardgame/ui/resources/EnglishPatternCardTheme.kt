package org.mikmad.war_cardgame.ui.resources

import org.jetbrains.compose.resources.DrawableResource
import org.mikmad.war_cardgame.models.card.Card
import war_cardgame.composeapp.generated.resources.Res
import war_cardgame.composeapp.generated.resources.english_pattern_back

object EnglishPatternCardTheme : CardResourceTheme {
    override val displayName: String = "English Pattern"

    override fun front(card: Card): DrawableResource {
        return englishPatternCardResource(card)
    }

    override fun back(): DrawableResource {
        return Res.drawable.english_pattern_back
    }
}
