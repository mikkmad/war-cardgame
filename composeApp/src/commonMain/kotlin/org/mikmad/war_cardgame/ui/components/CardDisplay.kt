package org.mikmad.war_cardgame.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.mikmad.war_cardgame.models.card.Card
import org.mikmad.war_cardgame.models.card.CardIcon
import org.mikmad.war_cardgame.models.card.CardRank
import org.mikmad.war_cardgame.models.card.CardSuit

@Composable
fun CardDisplay(card: Card) {
    Card(
        modifier = Modifier.padding(16.dp),
    ){
        Text(
            card.toString(),
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview
@Composable
fun CardDisplayPreview() {
    val sampleCard = Card(rank = CardRank.ACE, suit = CardSuit.HEARTS, icon = CardIcon.HEARTS)
    CardDisplay(sampleCard)
}
