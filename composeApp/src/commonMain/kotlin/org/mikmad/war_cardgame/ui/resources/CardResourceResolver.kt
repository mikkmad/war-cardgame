package org.mikmad.war_cardgame.ui.resources

import org.jetbrains.compose.resources.DrawableResource
import org.mikmad.war_cardgame.models.card.Card
import org.mikmad.war_cardgame.models.card.CardRank
import org.mikmad.war_cardgame.models.card.CardSuit
import war_cardgame.composeapp.generated.resources.*

// TODO: Find a better way to model this... Adding many more themes will be a massive pain.
fun englishPatternCardResource(card: Card): DrawableResource {
    return when (card.suit) {
        CardSuit.CLUBS -> when (card.rank) {
            CardRank.TWO -> Res.drawable.english_pattern_2_clubs
            CardRank.THREE -> Res.drawable.english_pattern_3_clubs
            CardRank.FOUR -> Res.drawable.english_pattern_4_clubs
            CardRank.FIVE -> Res.drawable.english_pattern_5_clubs
            CardRank.SIX -> Res.drawable.english_pattern_6_clubs
            CardRank.SEVEN -> Res.drawable.english_pattern_7_clubs
            CardRank.EIGHT -> Res.drawable.english_pattern_8_clubs
            CardRank.NINE -> Res.drawable.english_pattern_9_clubs
            CardRank.TEN -> Res.drawable.english_pattern_10_clubs
            CardRank.JACK -> Res.drawable.english_pattern_jack_clubs
            CardRank.QUEEN -> Res.drawable.english_pattern_queen_clubs
            CardRank.KING -> Res.drawable.english_pattern_king_clubs
            CardRank.ACE -> Res.drawable.english_pattern_ace_clubs
        }

        CardSuit.DIAMONDS -> when (card.rank) {
            CardRank.TWO -> Res.drawable.english_pattern_2_diamonds
            CardRank.THREE -> Res.drawable.english_pattern_3_diamonds
            CardRank.FOUR -> Res.drawable.english_pattern_4_diamonds
            CardRank.FIVE -> Res.drawable.english_pattern_5_diamonds
            CardRank.SIX -> Res.drawable.english_pattern_6_diamonds
            CardRank.SEVEN -> Res.drawable.english_pattern_7_diamonds
            CardRank.EIGHT -> Res.drawable.english_pattern_8_diamonds
            CardRank.NINE -> Res.drawable.english_pattern_9_diamonds
            CardRank.TEN -> Res.drawable.english_pattern_10_diamonds
            CardRank.JACK -> Res.drawable.english_pattern_jack_diamonds
            CardRank.QUEEN -> Res.drawable.english_pattern_queen_diamonds
            CardRank.KING -> Res.drawable.english_pattern_king_diamonds
            CardRank.ACE -> Res.drawable.english_pattern_ace_diamonds
        }

        CardSuit.HEARTS -> when (card.rank) {
            CardRank.TWO -> Res.drawable.english_pattern_2_hearts
            CardRank.THREE -> Res.drawable.english_pattern_3_hearts
            CardRank.FOUR -> Res.drawable.english_pattern_4_hearts
            CardRank.FIVE -> Res.drawable.english_pattern_5_hearts
            CardRank.SIX -> Res.drawable.english_pattern_6_hearts
            CardRank.SEVEN -> Res.drawable.english_pattern_7_hearts
            CardRank.EIGHT -> Res.drawable.english_pattern_8_hearts
            CardRank.NINE -> Res.drawable.english_pattern_9_hearts
            CardRank.TEN -> Res.drawable.english_pattern_10_hearts
            CardRank.JACK -> Res.drawable.english_pattern_jack_hearts
            CardRank.QUEEN -> Res.drawable.english_pattern_queen_hearts
            CardRank.KING -> Res.drawable.english_pattern_king_hearts
            CardRank.ACE -> Res.drawable.english_pattern_ace_hearts
        }

        CardSuit.SPADES -> when (card.rank) {
            CardRank.TWO -> Res.drawable.english_pattern_2_spades
            CardRank.THREE -> Res.drawable.english_pattern_3_spades
            CardRank.FOUR -> Res.drawable.english_pattern_4_spades
            CardRank.FIVE -> Res.drawable.english_pattern_5_spades
            CardRank.SIX -> Res.drawable.english_pattern_6_spades
            CardRank.SEVEN -> Res.drawable.english_pattern_7_spades
            CardRank.EIGHT -> Res.drawable.english_pattern_8_spades
            CardRank.NINE -> Res.drawable.english_pattern_9_spades
            CardRank.TEN -> Res.drawable.english_pattern_10_spades
            CardRank.JACK -> Res.drawable.english_pattern_jack_spades
            CardRank.QUEEN -> Res.drawable.english_pattern_queen_spades
            CardRank.KING -> Res.drawable.english_pattern_king_spades
            CardRank.ACE -> Res.drawable.english_pattern_ace_spades
        }
    }
}
