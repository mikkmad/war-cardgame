package org.mikmad.war_cardgame.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.painterResource
import org.mikmad.war_cardgame.models.card.Card
import org.mikmad.war_cardgame.models.card.CardRank
import org.mikmad.war_cardgame.models.card.CardSuit
import org.mikmad.war_cardgame.ui.resources.CardResourceTheme
import org.mikmad.war_cardgame.ui.resources.EnglishPatternCardTheme

@Composable
fun CardDisplay(
    card: Card,
    theme: CardResourceTheme,
    modifier: Modifier = Modifier,
    faceUp: Boolean = true
) {
    val drawable = if (faceUp) {
        theme.front(card)
    } else {
        theme.back()
    }

    Card(
        modifier = Modifier.padding(6.dp),
        elevation = CardDefaults.cardElevation(12.dp)
    ) {
        Image(
            painter = painterResource(drawable),
            contentDescription = if (faceUp) {
                "${card.rank.displayName} of ${card.suit.displayName}"
            } else {
                "Face-down card"
            },
            modifier = modifier.size(width = 120.dp, height = 180.dp),
            contentScale = ContentScale.Fit
        )
    }
}

@Preview
@Composable
fun CardDisplayPreview() {
    val selectedTheme = EnglishPatternCardTheme
    val sampleCard = Card(rank = CardRank.ACE, suit = CardSuit.HEARTS)
    CardDisplay(sampleCard, selectedTheme)
}
