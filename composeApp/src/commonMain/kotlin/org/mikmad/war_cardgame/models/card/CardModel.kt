package org.mikmad.war_cardgame.models.card

enum class CardSuit(val displayName: String){
    CLUBS("Clubs"),
    DIAMONDS("Diamonds"),
    HEARTS("Hearts"),
    SPADES("Spades"),
}

enum class CardIcon(val displayIcon: String){
    CLUBS("\u2663"), // ♣️
    DIAMONDS("\u2666"), // ♦️
    HEARTS("\u2665"), // ♥️
    SPADES("\u2660"), // ♠️
}

enum class CardRank(val displayName: String){
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("Jack"),
    QUEEN("Queen"),
    KING("King"),
    ACE("Ace")
}

class Card(val rank: CardRank, val suit: CardSuit, val icon: CardIcon) {
    override fun toString(): String {
        return "${icon.displayIcon} | ${rank.displayName} of ${suit.displayName} | ${icon.displayIcon}"
    }
}
