package org.mikmad.war_cardgame.models.card

enum class CardSuit(val displayName: String){
    CLUBS("Clubs"),
    DIAMONDS("Diamonds"),
    HEARTS("Hearts"),
    SPADES("Spades"),
}

enum class CardRank(
    val displayName: String,
    val power: Int
){
    TWO("2", 2),
    THREE("3", 3),
    FOUR("4", 4),
    FIVE("5", 5),
    SIX("6", 6),
    SEVEN("7", 7),
    EIGHT("8", 8),
    NINE("9", 9),
    TEN("10", 10),
    JACK("Jack", 11),
    QUEEN("Queen", 12),
    KING("King", 13),
    ACE("Ace", 14)
}

class Card(
    val rank: CardRank,
    val suit: CardSuit
) {
    override fun toString(): String {
        return "${rank.displayName} of ${suit.displayName}"
    }
}
